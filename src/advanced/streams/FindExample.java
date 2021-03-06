package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael"); //jei čia nebus reikšmių, atspausdins,
        //kad reikšmių nebuvo

        Optional<String> anyName = names.stream().findAny(); //kadangi nežinom ar sąrašas turi bent vieną reikšmę,
        // reikia rašyti Optional
        System.out.println("Any name: " + anyName.orElse("list was empty"));
        System.out.println("First name in list: " + names.stream().findFirst().get());
    }
}
