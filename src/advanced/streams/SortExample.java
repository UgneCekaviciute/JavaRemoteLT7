package advanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Brad");
        //išrūšiuoti vardus sąraše pagal abėcėlę
        List<String> sortedNames = names.stream()
                .sorted() //jei paliksim tik sorted, išrūšiuos pagal abėcėlę
                .collect(Collectors.toList());

        //išrūšiuoti vardus sąraše atvirkštine tvarka
        List<String> sortedNamesInReverseOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(sortedNames);
        System.out.println(sortedNamesInReverseOrder);
    }
}
