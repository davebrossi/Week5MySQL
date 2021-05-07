package porsche;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.List;
import porsche.dao.PorscheDao;


public class PorscheApp {
	private Scanner scanner = new Scanner(System.in);
	private PorscheDao porscheDao = new PorscheDao();
	
	
	public static void main(String[] args) {
		new PorscheApp().run();

	}
	private void run() {
		while(true) {
			printInstructions();
			System.out.println("Enter a Selection:");
			String choice = scanner.nextLine();
			if(choice.isBlank()) {
				break;
			}
			try {
				switch(choice) {
				case"1":
				createPorsche();
				break;
				
				case"2":
				modifyPorsche();
				break;
				
				case"3":
				listPorsche();
				break;
				
				case"4":
				deletePorsche();
				break;
			default:
				System.out.println("invalid selection, try again!");
				}
			}
		catch(Exception e) {
			System.out.println("That didn't work"+ e.getMessage());
			break;
			}
		}
	}		
	private void deletePorsche() throws SQLException {
		listPorsche();
		System.out.print("Enter the Porsche ID to delete:");
		long id = Long.parseLong(scanner.nextLine());
		
		PorscheDao.deletePorsche(porscheId);
		listPorsche();
	}
	private void modifyPorsche() throws SQLException {
		listPorsche();
		System.out.print("Enter the Porsche ID to modify:");
		long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Enter the new Porsche name");
		String name = scanner.nextLine();
		
		PorscheDao.modifyPorsche(id, name);
		listPorsche();
		}
	
	private void listPorsche() throws SQLException {
		List<Porsche>porsche = porscheDao.fetchPorsche();
		
		porsche.stream().forEach(System.out::println);
	}
		private void createPorsche() throws SQLException {
			System.out.println("Enter a Porsche Model:");
			String name = scanner.nextLine();
			PorscheDao.createPorsche(name);
		}

		private void printInstructions() {
			System.out.println("Choose your option:");
			System.out.println("1: Create a Porsche");
			System.out.println("2: Modify a Porsche");
			System.out.println("3: List all Porsches");
			System.out.println("4: Delete a Porsche");
	}
	}

