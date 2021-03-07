package fundamentals_coding.uzduotis18;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Uzduotis18 {
    //Write an application that reads a text from the user (type String) and checks
    // whether the user sneezed, i.e. whether the text equals ‘achooo!’ with one or
    // more letters "o" at the end of the expression (so both 'acho!' and ‘achooooooo!’
    // are correct). Hint: use a regular expression with the appropriate quantifier.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        final String regex = "acho{1,}\\!";
        final String string = "acho!";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        if (text.contains(regex)|| text.contains(string)) {
            System.out.println("User sneezed ");
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("User sneezed");
            }
        } else {
            System.out.println("User did not sneezed");
        }
    }
}
