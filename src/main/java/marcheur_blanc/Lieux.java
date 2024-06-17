package main.java.marcheur_blanc;


import java.util.List;

public final class Lieux {
    private String nom;
    private List<String> rues;

    public Lieux(String nom, List<String> rues) {
        this.nom = nom;
        this.rues = rues;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getRues() {
        return rues;
    }

    public void setRues(List<String> rues) {
        this.rues = rues;
    }

}
