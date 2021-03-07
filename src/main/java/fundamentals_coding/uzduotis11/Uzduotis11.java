package fundamentals_coding.uzduotis11;
import java.util.Scanner;
public class Uzduotis11 {
    //Write an application that will read texts (variables of the String type)
    // until the user gives the text "Enough!" and then writes the longest of
    // the given texts (not including the text "Enough!"). If the user does
    // not provide any text, write "No text provided".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        String longestText = "";

        for (text = scanner.next(); text.equals("Enough!"); text = scanner.next()){
            if (longestText.length() < text.length()) {
                longestText = text;
            }
            System.out.println(text);
        }
    }
}
