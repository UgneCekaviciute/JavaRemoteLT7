package advanced.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");
        //norim, kad visi vardai būtų surašyti kaip vienas kintamasis tokiu formatu:
        // "Tom : Brandon : Michael"

        //kuriam kintamąjį text, kuris duos rezultatą norimu formatu
        String text = names.stream()
                .reduce("", (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ": ") + element);
        //klaustukas yra kaip if sąlyga po : rašoma reikšmė, jei sąlyga netenkinama
        //užrašymas susideda iš dviejų dalių:
        // "" - pradinė text kintamojo reikšmė, (tarpinė suminė reikšmė, elementas) -> logika kas bus vykdoma
        //1-a iteracija: text = ""; currentValue = ""; element = "Tom"
        //2-a iteracija: text = ""; currentValue = "Tom"; element = "Brandon" įvykdžius ją
        // currentValue = "Tom: Brandon" (nes currentValue+ : + element)
        //3-ia iteracija: text = "", currentValue = "Tom: Brandon", element = "Michael"
        //įvykdžius ją rezultatas bus Tom: Brandon: Michael (nes currentValue+ : + element)
        //po visų iteracijų text = "Tom: Brandon: Michael"
        System.out.println(text);

        //parašom reducerį, kuris jei vardo simboliai >3 bus rašoma 1, jei mažiau - 0
        int num = names.stream()
                .map(name -> name.length()) //bus gautas sąrašas [3, 7, 7] vietoj vardų
                .reduce(0, (currentSum, number) -> (number > 3 ? 1 : 0) + currentSum);
        System.out.println(num);

        //1-a iteracija: currentSum = 0; number = 3; (kadangi 3 nėra daugiau už 3, grąžina 0; 0+0=0)
        //2-a iteracija: currentSum = 0; number = 7; (kadangi 7 daugiau už 3, grąžina 1; 1+0=1)
        //3-ia iteracija: currentSum = 1; number = 7; (kadangi 7 daugiau už 3, grąžina 1; 1+1=2)

        //reduce (pradinė reikšmė, (suminė/tarpinė reikšmė, iteruojama reikšmė) -> logika (sąlyga, kurią tikrinant
        // suteikiamos reikšmės suminei tarpinei reikšmei

   /*     Su esamu žodžių sąrašu atlikite užduotis:
    * Sujunkite žodžius į vieną naudodami `reduce` funkciją;
    * Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su `map` funkcija ir vėl
        sujunkite į vieną žodį su `reduce`;
    * Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu `,`
        (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        Atfiltruoti žodžius, kurie ilgesni, nei 5 simbolių ilgio
    * Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę `o`.
    [Rytas, Lova, Durys, Automobilis, Katinas]*/

        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String concatenatedString = words.stream()
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatenatedString);

        String concatenatedStringInCapital = words.stream()
                .map(word -> word.toUpperCase())
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatenatedStringInCapital);

        String concatenatedStringSeparatedWithCommas = words.stream()
                .filter (word -> word.length() > 5)
                .reduce("", (concatenatedText, word) -> (concatenatedText.isEmpty() ? "" : concatenatedText + ", ") + word);
        System.out.println(concatenatedStringSeparatedWithCommas);

        words.stream()
                .filter (word -> word.contains("o"))
                .forEach(word -> System.out.println(word));
    }
}
