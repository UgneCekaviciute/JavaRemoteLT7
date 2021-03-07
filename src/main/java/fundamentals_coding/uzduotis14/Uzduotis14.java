package fundamentals_coding.uzduotis14;
import java.util.Scanner;
public class Uzduotis14 {
    //Write an application that reads two lowercase letters of the Latin alphabet
    // (type char) and calculates how many characters is there in the alphabet
    // between given letters. Hint - use the ASCII code table and treat the
    // characters as int numbers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);

        if (firstLetter >= 'a' && firstLetter <= 'z' && secondLetter >= 'a' && secondLetter <= 'z'){
            System.out.println(Math.abs((int)firstLetter-secondLetter-1));
        }
    }
}
