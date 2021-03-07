package paskaitos_fundamentals.sacademy.masyvai;

// Masyvas (angl. array)
public class ArrayDemo {
    public static void main(String[] args) {

        // Default'inės (numatytosios) reikšmės (taip pat galite pažiūrėti
        // "DefaultInstanceVariablesValuesDemo") klasėje:
        // Sveikųjų kintamųjų: 0
        // Nesveikujų kintamųjų: 0.0
        // Simbolių char: tuščia vieta (\u0000)
        // boolean: false
        // Objektai (String): null

        // int masyvo deklaracija ir inicializacija
        // Pastaba: Jeigu masyvo reikšmės nėra priskirtos, elementai turės defaultin'es (numatytasias) reikšmes
        int[] arr = new int[10];

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);


        // int masyvo deklaracija ir inicializacija (kitas būdas)
        // Pastaba: paskutinio elemento indeksas yra lygus masyvo dydžiui minus vienas
        int[] arr2 = new int[]{25, 30, 90};

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // Mes java.lang.ArrayIndexOutOfBoundsException klaidą, nes bandote pasiekti elementą už masyvo ribų:
        // System.out.println(arr2[3]);



        //

        System.out.println("\narr2 masyvo turinys:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


    }
}
