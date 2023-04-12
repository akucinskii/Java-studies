import java.util.Random;

public class Opel extends Osobowy {
    public Opel(int konieMechaniczne) {
        super(konieMechaniczne);
    }

    public int obliczWartosc () {
        int losowaCena = new Random().nextInt(10000);

        return losowaCena;
    }

    public String sprzedaj () {
        return "Sprzedano";
    }
}
