public class Ikarus extends Autobus {
    public Ikarus(int konieMechaniczne, int pojemnosc) {
        super(konieMechaniczne, pojemnosc);
    }

    public String zarycz() {
        String rykSilnika = "W";

        for (int i = 0; i < getKonieMechaniczne(); i++) {
            rykSilnika += "RR";
        }

        return rykSilnika;

    }
}
