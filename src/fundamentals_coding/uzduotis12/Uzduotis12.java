package fundamentals_coding.uzduotis12;
import java.util.Scanner;
public class Uzduotis12 {
    //Write an application that reads a text from the user (type String)
    // and counts a percentage of occurrences of a space character.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int counter = 0;

        if (text.contains(" ")){
            counter = counter + 1;
        }
        int percentage = (counter*100/text.length());
        System.out.println(percentage);
    }
}
