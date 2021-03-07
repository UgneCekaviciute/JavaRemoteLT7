package homework.nd2;

import java.util.Scanner;

public class Uzduotis11 {
    //11.	Declare an integer variable and assign any value to it. Next check, if the value of this
    //variable is greater, or less, or equal to zero. In every case, please display the proper
    //information on the screen. Please use conditional statement construction.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        if (var1 > 0) {
            System.out.println(var1 + " > 0");
        } else if (var1 < 0){
            System.out.println(var1 + " < 0");
        } else if (var1 == 0){
            System.out.println(var1 + " = 0");
        }
    }
}
