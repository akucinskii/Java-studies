public class Pojazd {
    private final int konieMechaniczne;
    private final String typPojazdu;


    public Pojazd(int konieMechaniczne, String typPojazdu) {
        this.konieMechaniczne = konieMechaniczne;
        this.typPojazdu = typPojazdu;
    }

    public int getKonieMechaniczne() {
        return konieMechaniczne;
    }

    public void wypiszKonieMechaniczne() {
        System.out.println(typPojazdu + " - Konie mechaniczne: " + getKonieMechaniczne());
    }
}
