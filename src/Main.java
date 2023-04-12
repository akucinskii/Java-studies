// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {
        Ikarus ikarus = new Ikarus(123, 10);
        Star star = new Star(132, 1233, 123);
        Opel opel = new Opel(1245124);
        Fiat fiat = new Fiat(444);
        Skoda skoda = new Skoda(999);

        System.out.println(ikarus.zarycz());
        ikarus.wypiszPojemnosc();
        ikarus.wypiszKonieMechaniczne();

        System.out.println(star.wypiszCzyUniesie());

        System.out.println("Wartosc opla: " + opel.obliczWartosc());
        System.out.println(opel.sprzedaj());

        fiat.wypiszCzySieZepsul();


        skoda.wypiszKonieMechaniczne();
        skoda.wypiszCzyCiagleJestKatalizator();
    }
}