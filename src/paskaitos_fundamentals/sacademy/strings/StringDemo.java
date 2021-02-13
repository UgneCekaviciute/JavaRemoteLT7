package paskaitos_fundamentals.sacademy.strings;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        // String reference (nuorodos) tipas turi išskirtinį bruožą, jog
        // gali būti inicializuotas nenaudojant new raktažodžio,
        // o tiesiog parašant tekstinę eilutę:
        String str = "abc";

        // Tačiau galima incializuoti kaip ir kitus reference duomenų tipus:
        String str2 = new String("abc2");

        System.out.println(str);

        str += "def";

        // Nors iš pažiūros atrodo, jog mes naudojame tą patį objektą
        // kuri sukūrėmę parašę "String str = "abc";" statement'ą,
        // iš tiesų įvykdžius "str += "def";" statement'ą
        // buvo sukurtas naujas objektas ir jo nuoroda buvo priskirta
        // tam pačiam kintajam. Tokio pobūdžio klasės, kurios neleidžia
        // jų keisti vadinamos immutable (neikeičiamomis). String'as yra
        // IMMUTABLE
        System.out.println(str);


        // Kuomet yra naudojamos vienodos String reikšmės (kompiliacijos metu), tuomet JVM heap'e yra sukuriamas tik vienas objektas, kuris
        // yra patalpinamas String pool'e (duomenų struktūra, kuriame laikomi pasikartojančios String reikšmės).
        // Pavyzdys (tiek a, tiek b kintamieji rodys į tą patį objektą):
        String a = "abcdefgh";
        String b = "abcdefgh";

        if (a == b) {
            System.out.println("Sring'ai sutampa");
        }


        // Tekstas bus vienodas, tačiau String reikšmės susivienodins vykdant programą
        // todėl į String Pool'ą nepaklius
        String c = "abcdefghi";
        String d = "abcdefghi ";

        d = d.trim();

        if (c == d) {
            System.out.println("String'ai sutampa");
        } else {
            System.out.println("String'ai nesutampa");
        }

        // PASTABA: Niekados nenaudokite == su Stringais!!! Nebent išimtiniais atvejais arba mokymosi tikslais

        // Kuomet tikrinama ar sutampa teksto eilutės esančios String objektuose, naudojamas equals metodas
        if (c.equals(d)) {
            System.out.println("String'ai sutampa");
        } else {
            System.out.println("String'ai nesutampa");
        }

        // #############################

        // Sujungimas (Concatenation)
        String concatExample = "Labas " + "rytas";
        System.out.println(concatExample);

        String labas = "Labas ";
        String rytas = "rytas";
        System.out.println(labas.concat(rytas));

        // #############################

        // Sužinokite String ilgį
        System.out.println(labas.length());

        // #############################

        // Pakeiskite visas raides į didžiasias
        System.out.println(labas.toUpperCase());

        // Pakeiskite visas raides į mažasias
        System.out.println(labas.toLowerCase());

        // #############################

        // Ras pirmą kart panaudoto nurodyto teksto indeksą
        String text = "fox jumped over dog";

        System.out.println(text.indexOf("jump"));

        // #############################

        // Pakeičia visus konkretaus teksto panaudijimus į kitą tekstą

        System.out.println(text.replaceAll("o", "i"));


        // #############################

        // Scanner pavyzdys su String'u

        Scanner scanner = new Scanner(System.in);
        // Atkomentuokite eilutę jeigu norite pasibandyti:
//        System.out.println(paskaitos_fundamentals.sacademy.scanner.nextLine());


        //

        // ##############################

        // printf pavyzdys prisiminimui:
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0);


        // Kada kartositės printf, būtų gerai, kad įsidėmėtumėte
        // šias raides, reiškiantis duomenų tipą, reikšmės, kurią
        // ketinate įterpti teksto eilutėje:

        //  * e - floating point number in exponential notation
        //  * f - floating-point number
        //  * x - integer in hexadecimal system
        //  * o - integer in the octal number system
        //  * s - string
        //  * c - one character (char)
        //  * b - logical value
    }
}
