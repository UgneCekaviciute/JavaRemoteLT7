package fundamentals_coding.uzduotis5;
import java.util.Scanner;
public class Uzduotis5 {
    //Write an application that takes a positive number from the user (type int)
    // and prints all prime numbers greater than 1 and less than the given number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0){
            return;
        }

        for (i = 1; i < n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 2 to n are :");
        System.out.println(primeNumbers);

    }
}
