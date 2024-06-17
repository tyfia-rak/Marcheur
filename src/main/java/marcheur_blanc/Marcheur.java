package main.java.marcheur_blanc;

public abstract class Marcheur {
    private String lieuDeDepart;
    private String lieuDArriver;

    public Marcheur(String lieuDeDepart, String lieuDArriver) {
        this.lieuDeDepart = lieuDeDepart;
        this.lieuDArriver = lieuDArriver;
    }

    public String getLieuDeDepart() {
        return lieuDeDepart;
    }

    public void setLieuDeDepart(String lieuDeDepart) {
        this.lieuDeDepart = lieuDeDepart;
    }

    public String getLieuDArriver() {
        return lieuDArriver;
    }

    public void setLieuDArriver(String lieuDArriver) {
        this.lieuDArriver = lieuDArriver;
    }

    public abstract String ItineraireAleatoire();
}
