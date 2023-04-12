public class Autobus extends Pojazd {
    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    private int pojemnosc = 10;

    public void wypiszPojemnosc() {
        System.out.println("Ten autobus pomiesci: " + getPojemnosc() + "Osób");
    }

    public Autobus(int konieMechaniczne, int PPojemnosc) {
        super(konieMechaniczne, "autobus");
        pojemnosc = PPojemnosc;
    }






}
