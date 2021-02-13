package fundamentals_coding.uzduotis15;
import java.util.Scanner;
public class Uzduotis15 {
    //Write an application that reads from the user 10 arbitrarily large numbers
    // (variables of type int) and prints those that occurred at least twice.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int[] var = new int [n];
        int counter = 0;

        System.out.println("Įveskite skaičius");
        for (int i = 0; i<=n; i++){
            var[i] = scanner.nextInt();
            System.out.print("Pasikartojantys skaičiai: ");
            if (var[i] == var[i++]){
                System.out.println(var[i]);
            }
        }

    }
}
