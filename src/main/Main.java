package main;

import controller.CharakterController;
import controller.ProduktController;
import model.Charakter;
import model.Produkt;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ProduktController produktController = new ProduktController(view);
        CharakterController charakterController = new CharakterController(view);

        // Initialisierung der Produkte
        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Mjolnir", 500.0, "Asgard"));
        produkte.add(new Produkt("Vibranium-Schild", 700.0, "Wakanda"));
        produkte.add(new Produkt("Infinity Gauntlet", 10000.0, "Titan"));
        produkte.add(new Produkt("Web-Shooter", 250.0, "Terra"));
        produkte.add(new Produkt("Arc-Reaktor", 1500.0, "Terra"));
        produkte.add(new Produkt("Norn Stones", 1200.0, "Asgard"));
        produkte.add(new Produkt("Quantum Suit", 3000.0, "Terra"));
        produkte.add(new Produkt("X-Gene Serum", 850.0, "X-Mansion"));
        produkte.add(new Produkt("Cosmic Cube", 9000.0, "Multiverse"));
        produkte.add(new Produkt("Darkhold", 2000.0, "Multiverse"));

        // Initialisierung der Charaktere
        List<Charakter> charaktere = new ArrayList<>();

        Charakter c1 = new Charakter(1, "Thor", "Asgard");
        c1.kaufeProdukt(produkte.get(0)); // Mjolnir
        c1.kaufeProdukt(produkte.get(5)); // Norn Stones
        c1.kaufeProdukt(produkte.get(9)); // Darkhold

        Charakter c2 = new Charakter(2, "Black Panther", "Wakanda");
        c2.kaufeProdukt(produkte.get(1)); // Vibranium-Schild
        c2.kaufeProdukt(produkte.get(7)); // X-Gene Serum

        Charakter c3 = new Charakter(3, "Iron Man", "Terra");
        c3.kaufeProdukt(produkte.get(4)); // Arc-Reaktor
        c3.kaufeProdukt(produkte.get(6)); // Quantum Suit
        c3.kaufeProdukt(produkte.get(3)); // Web-Shooter

        Charakter c4 = new Charakter(4, "Spider-Man", "Terra");
        c4.kaufeProdukt(produkte.get(3)); // Web-Shooter
        c4.kaufeProdukt(produkte.get(8)); // Cosmic Cube

        Charakter c5 = new Charakter(5, "Doctor Strange", "Multiverse");
        c5.kaufeProdukt(produkte.get(9)); // Darkhold
        c5.kaufeProdukt(produkte.get(8)); // Cosmic Cube
        c5.kaufeProdukt(produkte.get(2)); // Infinity Gauntlet

        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);

        // Add initial products and characters to controllers
        produktController.getProdukte().addAll(produkte);
        charakterController.getCharaktere().addAll(charaktere);

        // Main loop
        while (true) {
            view.displayMenu();
            int choice = view.getUserChoice();
            switch (choice) {
                case 1:
                    produktController.addProdukt();
                    break;
                case 2:
                    produktController.editProdukt();
                    break;
                case 3:
                    produktController.deleteProdukt();
                    break;
                case 4:
                    produktController.displayProdukte();
                    break;
                case 5:
                    charakterController.addCharakter();
                    break;
                case 6:
                    charakterController.editCharakter();
                    break;
                case 7:
                    charakterController.deleteCharakter();
                    break;
                case 8:
                    charakterController.displayCharaktere();
                    break;
                case 9:
                    charakterController.filterByRegion();
                    break;
                case 10:
                    charakterController.displayCharaktereByProduktUniversum();
                    break;
                case 11:
                    charakterController.sortProdukteByPreis();
                    break;
                case 12:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Option.");
            }
        }
    }
}