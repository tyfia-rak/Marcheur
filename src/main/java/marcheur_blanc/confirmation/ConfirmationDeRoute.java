package main.java.marcheur_blanc.confirmation;

import main.java.marcheur_blanc.Carte;
import main.java.marcheur_blanc.Lieux;

import java.util.List;

public class ConfirmationDeRoute extends Carte {
    public ConfirmationDeRoute(String lieuDeDepart, String lieuDArriver, List<Lieux> ensembleDeLieu) {
        super(lieuDeDepart, lieuDArriver, ensembleDeLieu);
    }

    // Méthode pour confirmer que l'itinéraire mène bien à destination
    public boolean validerItineraire(String itineraire) {
        String[] lieux = itineraire.split(" -> ");
        return lieux[lieux.length - 1].equals(getLieuDArriver());
    }
}
