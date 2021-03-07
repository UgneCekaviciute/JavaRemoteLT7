package advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //importuojam listą ir sukuriam objektą string tipo, panaudodami polimorfizmą
        List<String> visitedCountries = new ArrayList<>();
        //pridedame į sąrašą elementus
        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("France");
        visitedCountries.add("Italy");
        visitedCountries.add("Spain");

        //iteruojam per sąrašą
        System.out.println("Original list:");
        for (String country : visitedCountries){ //dešinėj pusėj per ką iteruosi sąrašąs arba masyvas
            //kairėj dvitaškio pusėj elemento duomenų tipas, elementas kurį naudosim for cikle
            System.out.println(country);
        }
        //ištrinam reikšmę iš sąrašo naudodami remove nurodydami
        // reikšmių intervalą arba konkrečią reikšmę
        visitedCountries.remove("France");
        System.out.println("Edited list:");
        for (String country : visitedCountries){
            System.out.println(country);
        }
        //patikrinam ar sąraše yra šalis Germany, jei yra atspausdins true, jei ne - false
        System.out.println(visitedCountries.contains("Germany"));
    }
}
