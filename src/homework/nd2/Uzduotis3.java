package homework.nd2;

public class Uzduotis3 {
    //3.	Write a Java program to compare two numbers and print if they are equal or different,
    // smaller, larger, smaller or equal, larger or equal: 25; 39
    //25 != 39
    //25 < 39
    //25 <= 39
    public static void main(String[] args) {
        int var1 = 25;
        int var2 = 39;

        if (var1 == var2)
        {
            System.out.println(var1 + " = " + var2);
        }
        if (var1 != var2)
        {
            System.out.println(var1 + " != " + var2);
        }
        if (var1 < var2)
        {
            System.out.println(var1 + " < " + var2);
        }
        if (var1 > var2)
        {
            System.out.println(var1 + " > " + var2);
        }
        if (var1 <= var2)
        {
            System.out.println(var1 + " <= " + var2);
        }
        if (var1 >= var2)
        {
            System.out.println(var1 + " >= " + var2);
        }
    }

}
