package homework.nd2;

public class Uzduotis6 {
    //6.	Please, implement the program, where you will declare and initialize several final
    //variables of various types having any names. Next, try to display them in the following
    //lines of text. Compile it and check what will happen, when you try to set the value again
    //for any previously declared final variable.
    public static void main(String[] args) {
        final int var1 = 1;
        final float var2 = 2.3f;
        final boolean var3 = true;
        System.out.println("var1 = " + var1 + "; var2 = " + var2 + "; var3 = " + var3);
        //var1 = 2;
        //var2 = 3.6f;
        //var3 = false;
        //System.out.println("var1 = " + var1 + "; var2 = " + var2 + "; var3 = " + var3);
    }
}
