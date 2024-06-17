package main.java.marcheur_blanc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carte extends Marcheur {
    protected List<Lieux> ensembleDeLieu;
    private Lieux lieuActuel;

    public Carte(String lieuDeDepart, String lieuDArriver, List<Lieux> ensembleDeLieu) {
        super(lieuDeDepart, lieuDArriver);
        this.ensembleDeLieu = ensembleDeLieu;
        this.lieuActuel = findLieuxByName(lieuDeDepart);
    }

    public List<Lieux> getEnsembleDeLieu() {
        return ensembleDeLieu;
    }

    public void setEnsembleDeLieu(List<Lieux> ensembleDeLieu) {
        this.ensembleDeLieu = ensembleDeLieu;
    }

    private Lieux findLieuxByName(String nom) {
        return ensembleDeLieu.stream().filter(l -> l.getNom().equals(nom)).findFirst().orElse(null);
    }

    @Override
    public String ItineraireAleatoire() {
        Random random = new Random();
        List<String> itineraire = new ArrayList<>();
        itineraire.add(getLieuDeDepart());

        while (!lieuActuel.getNom().equals(getLieuDArriver())) {
            List<String> rues = lieuActuel.getRues();
            String prochaineRue = rues.get(random.nextInt(rues.size()));
            lieuActuel = findLieuxByName(prochaineRue);
            itineraire.add(lieuActuel.getNom());
        }
        return String.join(" -> ", itineraire);
    }
}
