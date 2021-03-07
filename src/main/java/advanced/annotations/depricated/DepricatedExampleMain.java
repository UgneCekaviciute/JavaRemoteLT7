package advanced.annotations.depricated;

import java.util.Arrays;
import java.util.List;

public class DepricatedExampleMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(11, 100); //kviečiamas metodas sum iš klasės Calculator
        //sum perbraukta, nes panaudota depricated anotacija, kuri informuoja programuotoją,
        // kad ateity ši metodo versija bus panaikinta
        System.out.println(result);

        //V2
        List<Integer> numbers = Arrays.asList(10, 20, 30 ,40); //sukuriamas sąrašas,
        // jo reikšmes sudės klasėje Calculator sukurtas metodas
        result = calculator.sum(numbers);

        System.out.println(result);
    }
}
