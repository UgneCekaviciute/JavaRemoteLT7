package advanced.streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        //turim sąrašą su vardais
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");
        //norim patikrinti ar yra bent vienas vardas, kurio ilgis > 3 simboliai
        /*boolean isThereANameWhichLengthIsGtThan3 = false;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 3) {
                isThereANameWhichLengthIsGtThan3 = true;
                break;
            }
        }*/ //rašom aukštesnį kodą paprasčiau:
        //kuriama boolean reikšmė, kur imamas sąrašas name ir naudojant stream (iteruoja per kiekvieną sąrašo reikšmę)
        //panaudojam anyMatch metodą, kuris patikrina ar sąraše yra reikšmė, kurios ilgis > 3
        boolean isThereANameWhichLengthIsGtThan3 = names.stream().anyMatch(name -> name.length() > 3);
        System.out.println("Ar yra bent vienas vardas, kurio ilgis yra > 3: " + isThereANameWhichLengthIsGtThan3);

        //ir ar visų vardų ilgiai yra > 3
        /*boolean areAllNameLengthsGtThan3 = false; //norint rasti visus vardus >3 reikės counterio
        int counter = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 3) {
                counter++;
            }
        }
        if (counter == names.size()) {
            areAllNameLengthsGtThan3 = true;
        }*/ //rašom aukštesnį kodą paprasčiau:
        //kuriama boolean reikšmė, kur imamas sąrašas name ir naudojant stream (iteruoja per kiekvieną sąrašo reikšmę)
        //panaudojam allMatch metodą, kuris patikrina ar visos reikšmės sąraše yra > 3
        boolean areAllNameLengthsGtThan3 = names.stream().allMatch(name -> name.length() > 3);
        System.out.println("Ar visų vardų ilgiai yra > 3: " + areAllNameLengthsGtThan3);
    }
}
