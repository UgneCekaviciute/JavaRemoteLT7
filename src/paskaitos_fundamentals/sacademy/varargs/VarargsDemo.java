package paskaitos_fundamentals.sacademy.varargs;

public class VarargsDemo {


    public static void main(String[] args) {
        displayNumbers(5, 4, 5, 1, 2, 2);

        // Varargs nereikalauja, kad jūs būtinai pateiktumėte nors viena reikšmę
        displayNumbers();
    }

    // paskaitos_fundamentals.sacademy.varargs tai toks parametras, kuris priima NELIMITUOTA
    // KIEKĮ apibrėžto tipo argumentų (šiuo atveju displayNumbers
    // metodas priima nelimituotą kiekį int tipo argumentų)

    public static void displayNumbers(int... sk) {
        // Pastaba paskaitos_fundamentals.sacademy.varargs, kaip ir masyvas, suteikia galimybę pasiekti
        // argumentus naudojant panašią sintakstę (šiuo atveju: sk[i]).
        // Taip pat paskaitos_fundamentals.sacademy.varargs, kaip ir masyvas, suteikia galimybę
        // sužinoti kiek argumentų vartotojas padavė metodui naudojant
        // length atributą (šiuo atveju: sk.length)
        for (int i = 0; i < sk.length; i++) {
            System.out.println(sk[i]);
        }
    }

    // PASTABA: paskaitos_fundamentals.sacademy.varargs gali būti TIK PASKUTINIU metodo parametru
    // Nekompiliuos:
    // public static void doSth(int... sk, float b) {}

    // PASTABA: Metode gali būti tik vienas paskaitos_fundamentals.sacademy.varargs parametras
    // Nekompiliuos:
    // public static void doSth(int... sk, float... sk) {}

}
