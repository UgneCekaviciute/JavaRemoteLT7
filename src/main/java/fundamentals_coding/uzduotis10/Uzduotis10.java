package fundamentals_coding.uzduotis10;
import java.util.Scanner;
public class Uzduotis10 {
    //Write an application that gets one positive number (type int)
    // from the user and calculates a sum of digits of the given number.
    // Hint: to make some operations on every single digit of the number
    // (digit by digit), you can calculate the remainder of dividing the
    // number by 10 (to get the value of the last digit) and divide the
    // number by 10 (to "move" to the next digit).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite skaičių");
        int number = scanner.nextInt();

        if (number < 0){
            return;
        }
        System.out.println("Skaitmenų suma = " + getSum(number));

    }
    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }
}
