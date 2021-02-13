package paskaitos_fundamentals.sacademy.primitive_variables;

public class PrimitiveVariablesDemo {

    // Papildoma info:
    // Bitas - tai mažiausias duomenų matavimo vienetas
    // 8 bit yra lygu 1 baitui

    public static void main(String[] args) {

        // Primityvūs duomenų tipai (Primitive data type):

        // Sveiki skaičiai (Integral/Integers numbers):
        byte varByte;   // 8 bit (-128 to 127)
        short varShort; // 16 bit
        int varInt;     // 32 bit
        long varLong;   // 64 bit

        // Slankiojo kablelio skaičiai (Floating point numbers):
        float varFloat;   // 32 bit
        double varDouble; // 64 bit

        // Simboliai (Characters):
        char varChar; // 16 bit

        // Bulio (Boolean) (jis saugo loginę vertę true (tiesa) arba false (melas)):
        boolean varBoolean;


        //############################################################
        //############################################################
        //############################################################

        // Kai kode naudoji sveiką skaičių - Java jį mato kaip int
        // tipo sveiką skaičių.
        // Šioje kodo eilutėje long tipo "var2" kintamajam priskirtas 10 vertę turintis
        // int tipo skaičius:
        long var2 = 10;

        // Ši kodo eilutė nesikompiliuos, nes 2147483648 viršyja
        // maksimalią int tipo reikšmę:
        // long var3 = 2147483648;

        // L raidė rašoma po sveikojo skaičiaus informuoja Java, kad
        // parašytas skaičius yra long tipo:
        long var4 = 2147483648L;

        //############################################################
        //############################################################
        //############################################################

        // Java neleidžia didesnio tipo reikšmės priskirti
        // mažesnio tipo kintamaja (su išimtim). Todėl ši kodo eilutė
        // nebus kompiliuojamas:
        // int var5 = 10L;

        //Išimtys šiai taisyklei (kompiliatorius pats konvertuoja int į
        // byte, short, char):
        byte var6 = 10;
        short var7 = 10;
        char var8 = 10;


        //############################################################
        //############################################################
        //############################################################

        // Kai kode naudoji slankiojo kablelio skaičių (floating point number)
        // Java jį mato kaip double tipo skaičių. Todėl šis kodas nebus
        // kompiliuojamas:
        // float var9 = 2.5;

        // f raidė parašyta prieš slankiojo kablelio skaičių informuoja Java, kad
        // parašytas skaičius yra float tipo:
        float var9 = 2.5f;


        //############################################################
        //############################################################
        //############################################################

        // Pastaba: char reikšmė aprašoma tarp viengubų kabučių

        // char tipo kintamajam gali būti priskirtas simbolis:
        char var10 = ' ';
        char var11 = 'a';

        // char tipo kintamajam gali būti priskirta dešimtainė simbolio reprezantaciją
        // (galite pamatyti dešimtaines simbolių reikšmes https://en.wikipedia.org/wiki/List_of_Unicode_characters
        // lentelės stulpelyje Decimal):
        char var12 = 75;

        // char tipo kintamajam gali būti priskirta Unicode reikšmė
        // (galite pamatyti Unicode simbolių reikšmes https://en.wikipedia.org/wiki/List_of_Unicode_characters
        // lentelės stulpelyje Code):
        char var13 = '\u00B6';


    }
}
