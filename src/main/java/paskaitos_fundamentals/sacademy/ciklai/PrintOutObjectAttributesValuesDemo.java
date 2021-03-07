package paskaitos_fundamentals.sacademy.ciklai;

import paskaitos_fundamentals.sacademy.classes_and_objects.ProperDog;

public class PrintOutObjectAttributesValuesDemo {

    public static void main(String[] args) {
        ProperDog[] dogs = new ProperDog[] {
            new ProperDog(50, 60, "Pinčeris"),
            new ProperDog(52, 12, "Auksinis Retriveris"),
            new ProperDog(45, 45, "Buldogas"),
            new ProperDog(12, 25, "Laika"),
            new ProperDog(84, 87, "Haskis")
        };

        for(ProperDog dog: dogs) {
            System.out.println(dog);
        }

    }
}
