package fundamentals_coding.uzduotis9;
import java.util.Scanner;
public class Uzduotis9 {
    //Write an application that will take a positive number from the user (type int)
    // and draw a wave with a given length and height of 4 lines, according to the
    // following example (fill empty spaces with spaces):

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite stulpelių skaičių:");
        int num = scanner.nextInt();
        if (num<0){
            return;
        }
        for (int i = 4; i >= 1; i--){
            for (int j = num; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k<(i*2); k++){
                if (k > 1 && k < (i*2)-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
