package controller;

import model.Charakter;
import model.Produkt;
import view.View;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CharakterController {
    private List<Charakter> charaktere;
    private View view;

    public CharakterController(View view) {
        this.charaktere = new ArrayList<>();
        this.view = view;
    }

    public void addCharakter() {
        Charakter charakter = view.getCharakterDetails();
        charaktere.add(charakter);
    }

    public void editCharakter() {
        String name = view.getCharakterName();
        for (Charakter charakter : charaktere) {
            if (charakter.getName().equalsIgnoreCase(name)) {
                Charakter updatedCharakter = view.getCharakterDetails();
                charakter.setName(updatedCharakter.getName());
                charakter.setRegion(updatedCharakter.getRegion());
                return;
            }
        }
        System.out.println("Charakter nicht gefunden.");
    }

    public void deleteCharakter() {
        String name = view.getCharakterName();
        charaktere.removeIf(charakter -> charakter.getName().equalsIgnoreCase(name));
    }

    public void displayCharaktere() {
        view.displayCharaktere(charaktere);
    }

    public void filterByRegion() {
        String region = view.getRegion();
        List<Charakter> filteredCharaktere = charaktere.stream()
                .filter(charakter -> charakter.getRegion().equalsIgnoreCase(region))
                .collect(Collectors.toList());
        view.displayCharaktere(filteredCharaktere);
    }

    public void displayCharaktereByProduktUniversum() {
        String universum = view.getUniversum();
        List<Charakter> filteredCharaktere = charaktere.stream()
                .filter(charakter -> charakter.getGekaufteProdukte().stream()
                        .anyMatch(produkt -> produkt.getUniversum().equalsIgnoreCase(universum)))
                .sorted(Comparator.comparing(Charakter::getName))
                .collect(Collectors.toList());
        view.displayCharaktere(filteredCharaktere);
    }

    public void sortProdukteByPreis() {
        String name = view.getCharakterName();
        String sortOrder = view.getSortOrder();
        for (Charakter charakter : charaktere) {
            if (charakter.getName().equalsIgnoreCase(name)) {
                List<Produkt> sortedProdukte = charakter.getGekaufteProdukte().stream()
                        .sorted(sortOrder.equalsIgnoreCase("aufsteigend") ?
                                Comparator.comparingDouble(Produkt::getPreis) :
                                Comparator.comparingDouble(Produkt::getPreis).reversed())
                        .collect(Collectors.toList());
                view.displayProdukte(sortedProdukte);
                return;
            }
        }
        System.out.println("Charakter nicht gefunden.");
    }

    public List<Charakter> getCharaktere() {
        return charaktere;
    }
}