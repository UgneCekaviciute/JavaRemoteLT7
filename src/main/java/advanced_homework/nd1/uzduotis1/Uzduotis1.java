package advanced_homework.nd1.uzduotis1;

import java.util.Locale;

public class Uzduotis1 {
    // Susikurti String tipo kintamąjį su tekstu: "Ad Astra Per Aspera"
    // (žemiau pateiktas užduotis atlikti naudojantis String funkcijas)
    //    * Paversti tekstą tik mažosiomis raidėmis;
    //    * Paversti tekstą tik didžiosiomis raidėmis;
    //    * Pakeisti visas 'A' raides, raidėmis 'X';
    //    * Patikrinkite ar jūsų tekstas prasideda tekstu: "Ad".

    public static void main(String[] args) {
        String text = "Ad Astra Per Aspera";

        System.out.println("Mažosiomis raidėmis: " + text.toLowerCase());
        System.out.println("Didžiosiomis raidėmis: " + text.toUpperCase());
        System.out.println("Visos A pakeistos į X: " + text.replaceAll("A","X"));

        System.out.print("Ar tekstas prasideda tekstu Ad? ");
        if (text.startsWith("Ad")){
            System.out.println("Taip, prasideda");
        } else {
            System.out.println("Tekstas skiriasi");
        }
    }
}
