package homework.nd1;

import java.util.Scanner;

public class Uzduotis3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float varFloat = scanner.nextFloat();
        byte varByte = scanner.nextByte();
        char varChar = scanner.next().charAt(0);
        System.out.println("Float reikšmė " + varFloat);
        System.out.println("Byte reikšmė " + varByte);
        System.out.println("Char reikšmė " + varChar);
    }
}
