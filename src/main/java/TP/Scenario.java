package TP;
import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private List<Effet> effets = new ArrayList<>();
    private Bandeau bandeau;

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet effet, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            effets.add(effet);
        }
    }

    public void jouer() {
        for (Effet effet : effets) {
            effet.jouer();
        }
    }
}
