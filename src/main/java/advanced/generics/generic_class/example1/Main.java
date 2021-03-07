package advanced.generics.generic_class.example1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //sukuriami trys kintamieji car, text ir number
        Car car = new Car(0);
        String text = new String("tekstas");
        int number = 50;
        //sukuriami GenericBox klasės objektai, kurie laiko duomenų tipus skirtingus
        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);//parašom <Car> iš kokios klasės kuriam generic klasės objektą (car)
        GenericBox<String> boxWithText = new GenericBox<>(text);
        //norint įdėti į <> primityvų duomenų tipą (int, double ir t.t) turim rašyti jų
        //klasės pavadinimą
        GenericBox<Integer> boxWithNumber = new GenericBox<>(number);

        //atspausdinam sukurtus generic items
        System.out.println(boxWithCarInIt.getItem());
        System.out.println(boxWithNumber.getItem());

        //sukuriamas objektas, kur į generic <> nededam jokio duomenų tipo
        GenericBox genericBox = new GenericBox();
        //tada su seteriu nustatom kas bus paduodama, tai turi būti objektas
        genericBox.setItem("sekmadienis");
        genericBox.setItem(new Car(5));
        genericBox.setItem(BigDecimal.ZERO);

        System.out.println(genericBox.getItem());
    }
}
