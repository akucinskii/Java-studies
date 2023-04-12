public class Ciezarowy extends Pojazd {
    public int getUdzwig() {
        return udzwig;
    }

    public void setUdzwig(int udzwig) {
        this.udzwig = udzwig;
    }

    private int udzwig = 1000;

    public int getTowar() {
        return towar;
    }

    public void setTowar(int towar) {
        this.towar = towar;
    }

    private int towar = 100;

    public Ciezarowy(int konieMechaniczne, int podanyUdzwig, int podanyTowar) {
        super(konieMechaniczne, "ciezarowy");
        udzwig = podanyUdzwig;
        towar = podanyTowar;
    }

    public boolean czyUniesie () {
        return udzwig >= towar;
    }

    public int ObliczRoznice() {
        return udzwig - towar;
    }

    public String wypiszCzyUniesie () {
        if (czyUniesie()) {
            return "Uniesie i jest: " + ObliczRoznice() + " Miejsca";
        } else {
            return "Nie ma szans, Zdejmij " + ObliczRoznice() * -1 + " Towaru";
        }
    }

}
