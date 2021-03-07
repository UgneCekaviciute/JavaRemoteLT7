package homework.nd3;
import java.util.Scanner;
public class Uzduotis2 {
    //2.	Implement the program, where you have to read 6 integers (using Scanner class)
    // and save them in the previously declared 6-element table (čia omeny turimas vienmatis
    // masyvas). Then compute an arithmetic average for all table values and display the result
    // on the standard output.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int var3 = scanner.nextInt();
        int var4 = scanner.nextInt();
        int var5 = scanner.nextInt();
        int var6 = scanner.nextInt();
        int [] arr = new int[] {var1, var2, var3, var4, var5, var6};
        System.out.println("Average = " + ((arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5])/arr.length));
    }
}
