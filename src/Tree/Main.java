package Tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add("TestDluzszy");
        tree.add("Test");
        tree.add("Tkr");
        tree.add("Wojtek");
        tree.add("Ala");
        tree.add("Krzysztof");
        tree.add("Michal");
        tree.add("Abrakadabratomabycnakoncu");
        tree.add("TestyNaProdukcji");
        tree.add("EEE");
        tree.add("Wojciech");
        tree.add("dadsda");
        tree.add("dadsda");
        tree.add("dadsda");
        tree.add("dadsda");

        tree.display();
        // tree.displayAsc();
        // tree.displayDsc();

        // Metoda do usuwania elementu z drzewa
        tree.delete("Abrakadabratomabycnakoncu");

        Boolean shouldBeFalse = tree.findValue("TegoNieMa");
        Boolean shouldBeTrue = tree.findValue("Wojtek");

        System.out.println("Czy w drzewie znajduje się wartość 'TegoNieMa'? " + shouldBeFalse.toString());
        System.out.println("Czy w drzewie znajduje się wartość 'Wojtek'? " + shouldBeTrue.toString());

        System.out.println("Minimalna wartość: " + tree.getMin().toString());
        System.out.println("Maksymalna wartość: " + tree.getMax().toString());
        System.out.println("Liczba elementów w drzewie: " + tree.getNodesCount().toString());
    }

}
