package paskaitos_fundamentals.sacademy.static_variables;

public class StaticVariablesDemo {

    // Statiniai kintamieji (kitaip vadinami klasės kintamaisiais)
    // Jų reikšmė vienoda visiems klasės, turinčios tokį kintamajį, objektams
    // Jie (jeigu yra pasiekiami) gali būti pasiekiami taip pat kaip ir
    // statiniai metodai (naudojant tik klasės pavadinimą)
    public static int a = 45;

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        new SomeClass();
        new SomeClass();
        new SomeClass();
        new SomeClass();
        new SomeClass();
        new SomeClass();
        new SomeClass();

        System.out.println(SomeClass.counter);
    }
}
