import java.util.Random;

public class Skoda extends Osobowy {
    public Skoda(int konieMechaniczne) {
        super(konieMechaniczne);
    }

    private String czyCiagleJestKatalizator() {
        if (new Random().nextBoolean()) {
            return "Ciagle jest";
        } else {
            return "Juz ukradli";
        }
    }

    public void wypiszCzyCiagleJestKatalizator () {
        System.out.println(czyCiagleJestKatalizator());
    }
}
