package homework.nd2;

import java.util.Scanner;

public class Uzduotis5 {
    //5.	Basing on the example below, please implement the program, where:
    //a)	Declare and initialize three variables of type int : a, b, c (initialize it to any values)
    //b)	Store the result of the a - b - c operation in the variable result1 and then display it
    // on the standard output (screen)
    //c)	Declare and initialize three variables of type long : d, e, f (initialize it to any values)
    //d)	Store the result of the d * e / f operation in the variable result2 and then display it
    // on the standard output (screen)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result1 = a-b-c;
        System.out.println("result1 = " + result1);
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int result2 = d*e/f;
        System.out.println("result2 = " + result2);
    }
}
