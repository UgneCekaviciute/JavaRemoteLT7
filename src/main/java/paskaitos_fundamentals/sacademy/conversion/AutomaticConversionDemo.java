package paskaitos_fundamentals.sacademy.conversion;

public class AutomaticConversionDemo {

    public static void main(String[] args) {
        // Taisyklė: konvertavimu iš sveikojo skaičiaus į
        // slankiojo kablelio (floating point) skaičių pasirūpina pati Java:
        int a = 10;
        float b = a;
        double c = a;

        // Taisyklė: konvertavimu iš slankiojo kablelio (floating point) skaičiaus į
        // sveikąjį skaičių pati Java NEPASIRŪPINA:
        // Nekompiliuos:
        // float num1 = 10.0f;
        // int num2 = num1;

        // Taisyklė: automatinis narrowing konvertavimas (iš didesnio į mažesnį)
        // Java'oje egzistuoja tik šiais atvejais:
        byte varByte = 10;
        short varShort = 10;
        char varChar = 10;

        // Taisyklė: widening konvertavimas (iš mažesnio į didesnį) Javo'je yra
        // automatinis:
        varShort = varByte;
        a = varShort;


        // Pastaba, galimas dalinas duomenų praradimas:
        // int -> float
        // long -> float
        // long -> double

        int varInt = 2147483647;
        float varFloat = varInt;

        System.out.println(varFloat);

        System.out.println(varInt == varFloat);

        // ################################################

        // ############################################################
        // Automatinio konvertavimo (Java tai padaro už jus) taisyklės (Numeric promotion)
        // #############################################################

        // 1) Jeigu dvi reikšmės yra skirtingų duomenų tipų, Java automatiškai
        // pakeis mažesnio dydžio tipo reikšmės tipą į didesnio tipo reikšmės tipą.
        // T.y. Jeigu vienas didesnis tipas, kitas mažesnis tipas - mažesnis bus
        // konvertuojamas į didesnį tipą
        int varrInt = 10;
        long varrLong = 10;

        System.out.println("Operacijos metu varrInt'as konvertuojamas į long tipą: "
                + (varrInt + varrLong));

        // 2) Jeigu viena reikšmė yra sveikojo tipo, kitą reikšmė slankiojo kablelio tipo,
        // tai sveikoji reikšmė bus konvertuotą į slankiojo kablelio tipo reikšmę
        int varrInt2 = 10;
        float varrFloat = 10.0f;

        System.out.println("Operacijos metu varrInt2'as konvertuojamas į float tipą: "
                + (varrInt2 + varrFloat));

        // 3) byte, short ir char reikšmės naudojamos aritmetinėje operacijoje
        // automatiškai konvertuojamos į int (net jeigu nei vienas iš operandų
        // nėra int)
        byte varrByte1 = 10;
        byte varrByte2 = 10;

        System.out.println("Operacijos metu varrByte1'as ir varrByte2'as konvertuojami" +
                " į int tipą: " + (varrByte1 + varrByte2));

        // 4) Kuomet visi automatiniai konvertavimai įvyko ir visi operandai
        // tapo vienodo tipo - rezultatas bus būtent to tipo
        byte varrByte3 = 10;
        byte varrByte4 = 10;
        byte varrByte5 = 10;

        System.out.println("Rezultatas yra int tipo" + (varrByte3 + varrByte4 + varrByte5));


        // ################################################
        // ################################################
        // ################################################

        // Pavyzdys, kuriame naudojamos visos 4-ios taisyklės
        // (savanoriškai ir savarankiškai galite panagrinėti šį atvejį):

        short x = 14;
        float y = 13;
        double z = 30;

        // Koks bus rezultato duomenų tipas
        System.out.println(x*y/z);


        // ################################################
        // ################################################
        // ################################################




        // ###############################
        // Panašios taisyklės iš skaidrių (šių taisyklių egzistavimo tikslas toks pats, tačiau formuluotė
        // visiškai skiriasi):
        // If one of the operands is of the double type, the other will also be converted to the double type.
        // Otherwise, if an operand is of float type, the other will also be converted to float type.
        // Otherwise, if an operand is of the long type, the other will also be converted to the long type.
        // Otherwise both operands will be converted to the int type.
    }
}
