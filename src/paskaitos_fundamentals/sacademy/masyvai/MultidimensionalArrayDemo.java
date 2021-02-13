package paskaitos_fundamentals.sacademy.masyvai;

public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[]{58, 78, 74};
        arr[2] = new int[3];
        arr[3] = new int[3];


        // Visu reikšmių spausdinimas advanced for ciklo pagalba
        for (int[] row: arr) {
            for (int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("##############################");
        // Visu reikšmių spausdinimas paprasto for ciklo pagalba
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("##############################");
        System.out.println();
        // Individualios reikšmės paėmimas
        System.out.println(arr[1][0]);


        // Neegzistuojančio elemento ėmimas (meta java.lang.ArrayIndexOutOfBoundsException):
        // System.out.println(arr[2][3]);

    }
}
