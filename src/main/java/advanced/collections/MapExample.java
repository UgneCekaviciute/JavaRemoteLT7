package advanced.collections;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Skliaustuose <> reikės nurodyti du tipus rakto ir reikšmės, kurią pasieksim su raktu
        Map<String, String> countriesAndCities = new HashMap<>();
        //kuriam reikšmes mape
        countriesAndCities.put("Poland", "Warsaw"); //raktas turi būti unikalus, reikšmės gali kartotis
        countriesAndCities.put("Lithuania", "Vilnius");
        countriesAndCities.put("Latvia", "Ryga");

        //iteruojame per map
        for (Map.Entry<String, String> entry : countriesAndCities.entrySet()){ //map.klasė (entry)<duomenų tipas,
            //duomenų tipas> vienos reikšmės pavadinimas : mapo pavadinimas.entrySet metodas
            String key = entry.getKey();
            String value1 = entry.getValue(); //gaunama konkretaus rakto reikšmė
            String value2 = countriesAndCities.get(key); //gaunama konkretaus rakto reikšmė, kitu būdu

            System.out.println("Key: " + key);
            System.out.println("Value from getValue(): " + value1);
            System.out.println("Value from get(key): " + value2);
        }
        //galima pakeisti reikšmę prie rakto naudojant .put
        countriesAndCities.put("Lithuania", "Kaunas");
        System.out.println(countriesAndCities.get("Lithuania"));
    }
}
