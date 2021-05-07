CREATE database IF NOT EXISTS porsche;
DROP TABLE IF EXISTS porsche;

CREATE TABLE porsche(
	porsche_id int NOT NULL Auto_increment,
	name varchar(42)
	PRIMARY KEY (porsche_id)
	);
