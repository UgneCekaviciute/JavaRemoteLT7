package fundamentals_coding.uzduotis7;
import java.util.Scanner;
public class Uzduotis7 {
    // Write an application that will take a positive number from the user (type int)
// and calculate the Fibonacci number at the indicated index. For example, if the
// number equals 5, your program should print the fifth Fibonacci number. In the
// Fibonacci sequence, each number is the sum of the two preceding ones. For example,
// the first few Fibonacci numbers are:
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…

    public static void main(String[] args) {

        int[] fibonacci = new int[15];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        System.out.println("Fibonacci seka:");
        System.out.print(fibonacci[0] + " " + fibonacci[1]);
        for (int i = 0; i < fibonacci.length; ++i){
            fibonacci[2] = fibonacci[0] + fibonacci[1];
            System.out.print(" " + fibonacci[2]);
            fibonacci[0] = fibonacci[1];
            fibonacci[1] = fibonacci[2];

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nĮveskite skaičių");
        int number = scanner.nextInt();

        System.out.println("Įvestas skaičius Fibonacci sekoje atitinka: " + fibonacci(number));

    }
    static int fibonacci(int number)
    {
        if (number <= 1)
            return number;
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
