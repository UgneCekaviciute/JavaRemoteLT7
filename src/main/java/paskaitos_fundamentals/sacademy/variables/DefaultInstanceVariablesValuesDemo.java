package paskaitos_fundamentals.sacademy.variables;

public class DefaultInstanceVariablesValuesDemo {

    // Sveiki skaičiai (Integral/Integers numbers):
    static byte varByte; // 8 bitai = 1 baitas (byte) skaitinės reikšmės: 2^8=256 nuo -128 iki 127;
    static short varShort;// 16 bitų = 2 baitai (bytes) 2^16=65 536 nuo -32 768 iki 32 767;
    static int varInt; // 32 bitai = 4 baitai (bytes) 2^32=4 294 967 296 nuo -2 147 483 648 iki 2 147 483 647;
    static long varLong;// 64 bitai = 8 baitai (bytes) 2^64=18 446 744 073 709 551 616;

    // Slankiojo kablelio skaičiai (Floating point numbers):
    static float varFloat; // 32 bitai = 4 baitai (bytes)
    static double varDouble; // 64 bitai = 8 baitai (bytes)

    // Simboliai (Characters):
    static char varChar; //16 bitų = 2 baitai (bytes)

    // Bulio (Boolean)
    static boolean varBoolean;

    public static void main(String[] args) {
        System.out.println("byte default value: " + varByte);
        System.out.println("short default value: " + varShort);
        System.out.println("int default value: " + varInt);
        System.out.println("long default value: " + varLong);
        System.out.println("float default value: " + varFloat);
        System.out.println("double default value: " + varDouble);
        System.out.println("char default value: " + varChar); // Atspausdina: \u0000
        System.out.println("boolean default value: " + varBoolean);
    }
}
