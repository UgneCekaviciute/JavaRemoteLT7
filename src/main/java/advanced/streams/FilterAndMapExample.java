package advanced.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Brad");
        //Išspausdinti vardus, kurie prasideda raide B
        /*for (int i = 0; i < names.size(); i++){
            if (names.get(i).startsWith("B")){
                System.out.println(names.get(i));
            }
        }*/ //užrašom paprasčiau su filter metodu. Jis atfiltruoja reikšmes, kurios atitinka sąlygą:
        names.stream()
                .filter(name -> name.startsWith("B")) //vietoj name gali būti bet koks kitas pavadinimas,
                //kuris anksčiau nebuvo naudotas
                .forEach (name -> System.out.println(name)); //filtruoja su kiekvienu vardu

        //Paversti vardus sąraše jų simbolių skaičiais
        /*List<Integer> nameLenghts = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            nameLenghts.add(names.get(i).length());
        }*/
        List<Integer> nameLenghts = names.stream() //mapas keičia sąrašo struktūrą
                .map(name -> name.length()) //reikia reikšmes sugrupuoti ir sudėti į sąrašą su metodu collect
                .collect(Collectors.toList()); //Collectors.toList surinktos reikšmės bus sudėtos į naują sąrašą
        System.out.println(nameLenghts);
        //Paversti vardus sąraše jų simbolių skaičiais ir palikti tik tuos skaičius, kurie didesni už 5
        List<Integer> nameLenghts2 = names.stream()
                .map(name -> name.length())
                .filter(length -> length > 5)
            //    .map(number -> number * 10) padaugintų likusius skaičius iš 10
                .collect(Collectors.toList());
        System.out.println(nameLenghts2);
    }
}
