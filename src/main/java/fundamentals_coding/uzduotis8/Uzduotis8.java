package fundamentals_coding.uzduotis8;
import java.util.Scanner;
public class Uzduotis8 {
    //Write an application that implements a simple calculator. The application should:
    //a. read first number (type float)
    //b. read one of following symbols: + - / *
    //c. read second number (type float)
    //d. return a result of given mathematical operation
    //If the user provides a symbol other than supported, the application should print
    // "Invalid symbol". If the entered action cannot be implemented (i.e. it is inconsistent
    // with the principles of mathematics), the application should print "Cannot calculate".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite skaičių:");
        float firstNumber = scanner.nextFloat();

        System.out.println("Įveskite simbolį:");
        String symbol = scanner.next();

        System.out.println("Įveskite skaičių");
        float secondNumber = scanner.nextFloat();


        if (symbol.equals("/") && secondNumber == 0.0){
            System.out.println("Cannot calculate");
        }
        if (symbol.equals("+")){
            System.out.println("Įvestų skaičių ir simbolio rezultatas = " + (firstNumber+secondNumber));
        } else if (symbol.equals("-")){
            System.out.println("Įvestų skaičių ir simbolio rezultatas = " + (firstNumber-secondNumber));
        } else if (symbol.equals("*")){
            System.out.println("Įvestų skaičių ir simbolio rezultatas = " + (firstNumber*secondNumber));
        } else if (symbol.equals("/") && secondNumber!=0){
            System.out.println("Įvestų skaičių ir simbolio rezultatas = " + (firstNumber/secondNumber));
        } else {
            System.out.println("Invalid symbol");
        }
    }
}
