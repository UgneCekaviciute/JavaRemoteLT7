package homework.nd2;

public class Uzduotis2 {
    //2.	Write a Java program to swap two variables: a = 5; b = 13
    //Ouput: a = 13; b = 5
    public static void main(String[] args) {
        int a = 5;
        int b = 13;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+"; b = "+b);
    }
}
