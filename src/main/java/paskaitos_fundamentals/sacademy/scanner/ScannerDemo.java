package paskaitos_fundamentals.sacademy.scanner;

import java.util.Scanner;

// Scanner klase suteikia galimybė vartotojui įvesti duomenis konsolėje

public class ScannerDemo {

    // PASTABA: Atkreipkite dėmesį į tai, kad įvedant slankiojo kabelio skaičiaus
    // reikšmę konsolėje vienuose kompiuteriuose reikia naudoti kablelį, kituose
    // tašką

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int var1 = scanner.nextInt();
        double var2 = scanner.nextDouble();

        System.out.println("Var1 kintamojo reikšmė: " + var1);
        System.out.println("Var2 kintamojo reikšmė: " + var2);
        System.out.println(var1 + " + " + var2 + " = " + (var1 + var2));

    }
}
