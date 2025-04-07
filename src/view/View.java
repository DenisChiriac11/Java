package view;

import model.Charakter;
import model.Produkt;

import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Produkt hinzufügen");
        System.out.println("2. Produkt bearbeiten");
        System.out.println("3. Produkt löschen");
        System.out.println("4. Produkte anzeigen");
        System.out.println("5. Charakter hinzufügen");
        System.out.println("6. Charakter bearbeiten");
        System.out.println("7. Charakter löschen");
        System.out.println("8. Charaktere anzeigen");
        System.out.println("9. Charaktere nach Region filtern");
        System.out.println("10. Charaktere nach Produktuniversum anzeigen");
        System.out.println("11. Produkte eines Charakters nach Preis sortieren");
        System.out.println("12. Beenden");
    }

    public int getUserChoice() {
        System.out.print("Wählen Sie eine Option: ");
        return scanner.nextInt();
    }

    public Produkt getProduktDetails() {
        System.out.print("Produktname: ");
        String name = scanner.next();
        System.out.print("Preis: ");
        double preis = scanner.nextDouble();
        System.out.print("Universum: ");
        String universum = scanner.next();
        return new Produkt(name, preis, universum);
    }

    public int getProduktId() {
        System.out.print("Produkt ID: ");
        return scanner.nextInt();
    }

    public Charakter getCharakterDetails() {
        System.out.print("Charakter ID: ");
        int id = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Region: ");
        String region = scanner.next();
        return new Charakter(id, name, region);
    }

    public String getCharakterName() {
        System.out.print("Charakter Name: ");
        return scanner.next();
    }

    public String getRegion() {
        System.out.print("Region: ");
        return scanner.next();
    }

    public String getUniversum() {
        System.out.print("Universum: ");
        return scanner.next();
    }

    public String getSortOrder() {
        System.out.print("Sortierreihenfolge (aufsteigend/absteigend): ");
        return scanner.next();
    }

    public void displayProdukte(List<Produkt> produkte) {
        for (Produkt produkt : produkte) {
            System.out.println(produkt);
        }
    }

    public void displayCharaktere(List<Charakter> charaktere) {
        for (Charakter charakter : charaktere) {
            System.out.println(charakter);
        }
    }
}