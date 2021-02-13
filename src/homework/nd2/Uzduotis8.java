package homework.nd2;

public class Uzduotis8 {
    //8.	Implement the program, where you have to:
    //a)	Declare and initialize two variables: intVar1, intVar2 of int type
    //b)	Declare variable shortSum of short type and initialize it as the sum of previously
    //c)	declared variables (intVar1 + intVar2)
    //d)	Display on the screen the value stored in shortSum variable
    //e)	Next, display on the screen the result of the incrementation: shortSum ++
    //f)	Declare variable byteSum of byte type and initialize it as the sum of previously
    //g)	declared variables (intVar1 + intVar2)
    //h)	Display on the screen the value stored in byteSum variable
    //i)	Next, display on the screen the result of the incrementation: ++ byteSum
    public static void main(String[] args) {
        int intVar1 = 1;
        int intVar2 = 2;
        short shortSum = (short) (intVar1+intVar2);
        System.out.println("shortSum = " + shortSum);
        shortSum++;
        System.out.println("shortSum ++ = " + shortSum);
        byte byteSum = (byte) (intVar1 + intVar2);

        System.out.println("byteSum = " + byteSum);
        ++byteSum;
        System.out.println("++ byteSum = " + byteSum);
    }
}
