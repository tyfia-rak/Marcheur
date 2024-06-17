package test;

import main.java.marcheur_blanc.Lieux;
import main.java.marcheur_blanc.confirmation.ConfirmationDeRoute;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestItineraire {
    @Test
    public void testItineraire() {
        Lieux HEI = new Lieux("HEI", Arrays.asList("Pullman"));
        Lieux Pullman = new Lieux("Pullman", Arrays.asList("HEI", "Balançoire"));
        Lieux Balançoire = new Lieux("Balançoire", Arrays.asList("Pullman", "ESTI"));
        Lieux ESTI = new Lieux("ESTI", Arrays.asList("Balançoire"));

        List<Lieux> lieux = Arrays.asList(HEI, Pullman, Balançoire, ESTI);

        ConfirmationDeRoute carte = new ConfirmationDeRoute("HEI", "ESTI", lieux);
        String itineraire = carte.ItineraireAleatoire();

        System.out.println("Itinéraire: " + itineraire);
        assertTrue(carte.validerItineraire(itineraire));
    }
}
