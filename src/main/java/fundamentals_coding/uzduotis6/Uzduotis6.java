package fundamentals_coding.uzduotis6;
import java.util.Scanner;
public class Uzduotis6 {
    //Write an application that takes a number n from the user (type int)
    // and calculates the sum of the harmonic series from 1 to n, according to the formula below:
    // Hn = 1+1/2+1/3+1/4+...+1/n

    static double sum(int n)
    {
        double i, H = 0.0;
        for (i = 1; i <= n; i++)
            H = H + 1/i;
        return H;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("Sum is %.2f", sum(n));

    }
}
