package homework.nd2;

public class Uzduotis4 {
    //4.	Write a Java program to compute the sum of the digits of an integer: 133
    //Output: 7
    public static void main(String[] args) {
        int var1 = 133;
        int pirmasS = var1/100;
        int antrasS = var1 % 100 / 10;
        int treciasS = var1 % 10;
        System.out.println(pirmasS + antrasS + treciasS);
        //arba:
        System.out.println(sumDigits(var1));
    }
    public static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
