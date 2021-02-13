package fundamentals_coding.uzduotis13;
import java.util.Scanner;
public class Uzduotis13 {
    //Write an application that "stutters", that is, reads the user's text
    // (type String), and prints the given text, in which each word is printed
    // twice. For example, for the input: "This is my test" the application
    // should print "This This is is my my test test".

    static String repeatText (String text) {

        String stutter = "";

        for (int i = 0; i < text.length(); i++){
            stutter = text + " " + text;
            for (int j = 0; j<= i; j++){

            }
        } return stutter;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(repeatText(text));
    }
}
