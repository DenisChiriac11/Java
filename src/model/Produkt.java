package model;

public class Produkt {
    private String name;
    private double preis;
    private String universum;

    public Produkt(String name, double preis, String universum) {
        this.name = name;
        this.preis = preis;
        this.universum = universum;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public String getUniversum() {
        return universum;
    }

    @Override
    public String toString() {
        return name + " - " + preis;
    }
}