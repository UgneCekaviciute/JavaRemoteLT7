package advanced.annotations.to_string;

public class ToStringExample {
    public static void main(String[] args) {
        //sukuriami du objektai iš klasių Object1 ir Object2 su tuščiais konstruktoriais
        Object1 object1 = new Object1();
        Object2 object2 = new Object2();

        //Spasudinam nuorodas į objektus
        System.out.println("object1 to string: " + object1.toString());
        System.out.println("object2 to string: " + object2.toString());
        //norint atspausdinti objekto pavadinimą, reikia override'inti norimo objekto metodą.
        // Šiuo atveju tai padaryta su Object2 klase

    }

}
