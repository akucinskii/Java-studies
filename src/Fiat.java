import java.util.Random;

public class Fiat extends Osobowy {
    public Fiat(int konieMechaniczne) {
        super(konieMechaniczne);
    }

    public String czySieZepsul () {
        boolean rand = new Random().nextBoolean();

        if (rand) {
            return "Popsul sie";
        } else {
            return "Ciagle dziala";
        }
    }

    public void wypiszCzySieZepsul () {
        System.out.println(czySieZepsul());
    }
}
