package advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> visitedCities = new HashSet<>(); //<> skliausteliuose nurodomas duomenų tipas
        visitedCities.add("Vilnius");
        visitedCities.add("Kaunas");
        visitedCities.add("Klaipėda");
        visitedCities.add("Vilnius");
        visitedCities.add("Klaipėda");
        visitedCities.add("Panevėžys");

        //iteruojam per reikšmes seto
        System.out.println("Original set");
        for (String city : visitedCities){
            System.out.println(city); //atspausdina tik originalias reikšmes, dublikatų nekelia
        }

        System.out.println("Edited set");
        visitedCities.remove("Kaunas");
        visitedCities.remove("Talinas");
        for (String city : visitedCities){
            System.out.println(city);
        }

        if (!visitedCities.contains("Madrid")){ //šauktukas nurodo priešingą reikšmę
            System.out.println("Set does not contain Madrid");
        }
    }
}
