package paskaitos_fundamentals.sacademy.substitude_symbols;

public class SubstitudeSymbolsDemo {

    public static void main(String[] args) {
        System.out.println("########-Backspace demonstracija-########");

        System.out.println("wowMeow");
        System.out.println("wow\bMeow");
        System.out.println("wow\b\bMeow");

        System.out.println("\n######-Horizontal tab demonstracija-######");

        System.out.println("wow");
        System.out.println("\twow");
        System.out.println("\t\twow");

        System.out.println("\n#########-New line demonstracija-#########");

        System.out.println("wowMeow");
        System.out.println("wow\nMeow");
        System.out.println("wow\n\nMeow");

        System.out.println("\n######-Cariage return demonstracija-######");

        System.out.print("Hello cruel cruel\rWorld");

        System.out.println("\n########################");

        System.out.println("\n######-Double quote-######");

        System.out.println("Tekstas: \"Idomus tekstas\"");

        // Šitos kodo eilutės nekompiliuos
        // System.out.println("Tekstas: "Idomus tekstas"");

        System.out.println("\n######-Single quote-######");

        System.out.println("Tekstas: \'Idomus tekstas\'");
    }
}
