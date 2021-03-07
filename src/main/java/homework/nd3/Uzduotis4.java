package homework.nd3;
import java.util.Scanner;
public class Uzduotis4 {
    //4.	Please implement a method, which takes three integers
    // as input parameters and returns the result of multiplication
    // of these parameters.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int var3 = scanner.nextInt();
        int rezultatas = sudauginkTrisSkaicius(var1, var2, var3);

        System.out.println(rezultatas);



    }

    static int sudauginkTrisSkaicius(int var1,int var2, int var3) {
        return var1 * var2 * var3;
    }
}
