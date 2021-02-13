package fundamentals_coding.uzduotis17;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Uzduotis17 {
    //Write an application that will read from the user the date of your next SDA
    // classes and calculate how many days are left to them. Hint: read the date
    // as String and parse it to LocalDate. Get the current date using LocalDate.now()
    // method. (čia reiks pasigooglinti įvairias klases ir metodus naudojamus darbui su datomis)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite sekančios paskaitos datą:");
        String input = scanner.next();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld1 = LocalDate.parse(input, dtf1);
        Period period = Period.between(LocalDate.now(), ld1);
        System.out.print("Iki sekančios paskaitos liko: " + period.getDays() + " d.");
    }
}
