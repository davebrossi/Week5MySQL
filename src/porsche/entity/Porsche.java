package porsche.entity;

public class Porsche {
	private long porscheID;
	private String name;
	
	public Porsche(long porscheID, String name) {
		this.porscheID = porscheID;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public long getPorscheID() {
		return porscheID;
	}
	@override
	public String toString() {
		return "Porsche[porscheID=" + porscheID + ",name=" + name + "]";
	}
}
