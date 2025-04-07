package controller;

import model.Produkt;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class ProduktController {
    private List<Produkt> produkte;
    private View view;

    public ProduktController(View view) {
        this.produkte = new ArrayList<>();
        this.view = view;
    }

    public void addProdukt() {
        Produkt produkt = view.getProduktDetails();
        produkte.add(produkt);
    }

    public void editProdukt() {
        int id = view.getProduktId();
        if (id >= 0 && id < produkte.size()) {
            Produkt produkt = view.getProduktDetails();
            produkte.set(id, produkt);
        } else {
            System.out.println("Produkt nicht gefunden.");
        }
    }

    public void deleteProdukt() {
        int id = view.getProduktId();
        if (id >= 0 && id < produkte.size()) {
            produkte.remove(id);
        } else {
            System.out.println("Produkt nicht gefunden.");
        }
    }

    public void displayProdukte() {
        view.displayProdukte(produkte);
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }
}