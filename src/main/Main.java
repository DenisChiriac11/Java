package main;

public class Main {
	public static void main(String[] args) {


		Persoana persoana1 = new Persoana("Andra", "Laura", "Cluj", 25, false);


		System.out.println(persoana1);


		Persoana persoana2 = new Persoana();


		System.out.println(persoana2);


		persoana2.setNume("Antonache");
		persoana2.setPrenume("Andra-LAURA   ");
		persoana2.setOras("Bucuresti");
		persoana2.setVarsta(30);
		persoana2.setCasatorita(true);
		System.out.println(persoana2);


		Persoana.curs = "JAVA";


		persoana1.creste();
		System.out.println(persoana1);


		System.out.println("Identificator: " + persoana2.obtineIdentificator());


	}

}
