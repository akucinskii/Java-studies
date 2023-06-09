package Tree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        ArrayList<String> words = new ArrayList<String>();

        words.add("Wojtek");
        words.add("Test");
        words.add("TestDluzszy");
        words.add("Tkr");
        words.add("Wojtek");
        words.add("Ala");
        words.add("Krzysztof");
        words.add("Michal");
        words.add("Abrakadabratomabycnakoncu");
        words.add("Michal");

        for (String word : words) {
            try {
                tree.add(word);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            tree.delete("Test");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tree.display();

        Boolean shouldBeTrue = tree.findValue("Wojtek");

        System.out.println("Czy w drzewie znajduje się wartość 'Wojtek'? " + shouldBeTrue.toString());

        try {
            tree.delete("Wojtek");

            // This should throw an exception
            tree.delete("Wojtek");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Czy w drzewie znajduje się wartość 'Wojtek'? " + tree.findValue("Wojtek").toString());
        System.out.println("Minimalna wartość: " + tree.getMin().toString());
        System.out.println("Maksymalna wartość: " + tree.getMax().toString());
        System.out.println("Liczba elementów w drzewie: " + tree.getNodesCount().toString());

        // Operacje na pustym drzewie
        tree.clear();

        try {
            tree.displayAsc();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
