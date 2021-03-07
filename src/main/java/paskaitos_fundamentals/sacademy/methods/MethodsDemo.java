package methods;

public class MethodsDemo {

    // Pastaba: Java yra pass by value kalba. T.y. perduodant argumentą
    // metodui - perduodama TIK jo reikšmė, o ne pats kintamasis!

    // Pastaba: Prieš metodo pavadinimą nurodomas duomenų tipas, nusakantis
    // kokio tipo duomenis metodas gražins (pvz.: int, float, boolean ir t.t.)
    // ARBA nurodomas raktažodis void, kuris informuoja, kad metodas
    // NIEKO negrąžins

    // Vieni iš SKAIDYMO Į METODUS privalumų:
    // 1) Padeda išvengti kodo dublikavimosi
    // 2) Suteikia kodui aiškumo
    public static void main(String[] args) {
        pasisveikinkV2(11);

        //

        pasisveikinkV2(19);

        //

        atspausdinkDviejuSkaiciuSandaugosRezultata(2, 2);

        //

        int rezultatas = sudauginkDuSkaicius(5, 6);
        System.out.println("\n 5 * 6 = " + rezultatas);
    }

    static void pasisveikink() {
        System.out.println("Labas rytas");
        System.out.println("Labas diena");
        System.out.println("Labas vakaras");
    }

    // Metodo su vienu parametru pavyzdys
    static void pasisveikinkV2(int valanda) {
        if (valanda < 12) {
            System.out.println("Labas rytas");
        } else if (valanda < 18) {
            System.out.println("Labas diena");
        } else if (valanda < 24) {
            System.out.println("Labas vakaras");
            // return; sakinys (statement) naudojamas, kuomet norima nustoti vykdyti
            // metoda (įvykdžius return sakinį, po jo einantis kodas nėra vykdomas ir
            // grįžtama į metodą, kuris pakvietė šį metodą)
            return;
        }

        System.out.println("Isivaizduokite cia logika, kuria norite praleisti, kad neivykdytu, " +
                "kuomet pasisveikina \"Labas vakaras\"");
    }

    // Metodo su dviem parametrais pavyzdys
    static void atspausdinkDviejuSkaiciuSandaugosRezultata(int a, int b) {
        System.out.println(sudauginkDuSkaicius(a, b));
    }

    // Metodo su dviem parametrais pavyzdys, kuris grąžina reikšmę
    static int sudauginkDuSkaicius(int num1, int num2) {
        return num1*num2;
    }
}
