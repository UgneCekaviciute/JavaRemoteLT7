package paskaitos_fundamentals.sacademy.ciklai;

public class AdvancedForLoop {

    public static void main(String[] args) {
        int[] arr = new int[]{25, 30, 90};

        // Advanced for loop'e turite deklaruoti kintamajį (šiuo atveju mes tai padarome tarp skliaustelių
        // parašydami: int value), kuris turėtų tokį patį tipą, kaip ir masyve esančių elementų tipai. Tada
        // parašome dvitaškį ir nurodome masyvą, per kurį norime iteruoti (šiuo atveju: arr)
        System.out.println("\narr masyvo turinys:");
        for (int value: arr) {
            System.out.println(value);
        }
    }
}
