package paskaitos_fundamentals.sacademy.operatoriai;

public class OperatorsDemo {

    public static void main(String[] args) {

        // Paprastas priskyrimo (assignment) operatoriaus naudojimas:

        int var1 = 15;
        int var2 = 10;

        int result = 0;

        double var3 = 15;
        double var4 = 10;

        double result2 = 0;

        // #########################################################

        //Aritmetiniai paskaitos_fundamentals.sacademy.operatoriai:

        // Sudėtis (addition):
        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);
        System.out.println("25 + 30 = " + (25 + 30));
        result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        // Atimtis (subtraction):
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        // Daugyba (multiplication):
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        // Dalyba (division):

        // Dalyba su sveikais skaičiais:
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        // Dalyba su slankiojo kablelio skaičiais:
        result2 = var3 / var4;
        System.out.println("var3 / var4 = " + result2);

        // Dalyba su sveikais ir slankiojo kablelio skaičiais:
        // Pastaba: sveikasis skaičius aritmetinės operacijos metu
        // konvertuotas į slankiojo kablelio skaičiu
        result2 = var1 / var4;
        System.out.println("var3 / var4 = " + result2);

        // Dalyba su sveikais skaičiais priskiriant slankiojo kablelio tipą
        // turinčiam kintamajam:
        result2 = var1 / var2;
        System.out.println("var1 / var2 = " + result2);

        // Modulio (Modulus) operatorius
        // Pastaba: šis operatorius gali būti naudojamas ir su neigiamom reikšmėm
        result = var1 % var2;
        System.out.println("var1 % var2 = " + result);

        // #########################################################

        // Sudėtiniai (Compound) paskaitos_fundamentals.sacademy.operatoriai
        // Compound operatorius atlieka aritmetinį veiksmą su esamą reikšme ir
        // su kita priskirta reikšme

        // Compound sudėties operatorius:
        int a = 5;

        // Tai yra tas pats kas "a = 5 + 10;"
        a += 10;
        System.out.println("a += 10 rezultatas: " + a);

        // Compound atimties operatorius:
        int b = 10;

        b -= 2;
        System.out.println("b -= 2 rezultatas: " + b);

        // Compound daugybos operatorius:
        int c = 10;

        c *= 2;
        System.out.println("c *= 2 rezultatas: " + c);

        // Compound dalybos operatorius:
        int d = 10;

        d /= 2;
        System.out.println("c /= 2 rezultatas: " + d);

        // Compound modulio operatorius:
        int e = 9;

        e %= 2;
        System.out.println("c %= 2 rezultatas: " + e);

        // #########################################################
        // PASTABA: Pasiekspermentuokite su increment operatoriais

        // Increment paskaitos_fundamentals.sacademy.operatoriai

        // Pre-increment (Keičia reikšmę ir ją iš karto gražina)

        int inc = 2,
            dec = 2;


        System.out.println("++inc = " + ++inc);
        System.out.println("inc reikšmė po ++inc = " + inc);

        System.out.println("--dec = " + --dec);
        System.out.println("dec reikšmė po --dec = " + dec);

        // Post-increment (Grąžina reikšmę ir ją pakeičia)

        int i = 2, dec2 = 2;

        System.out.println("i++ = " + i++);
        System.out.println("i reikšme atlikus i++ = " + i);

        System.out.println("dec2-- = " + dec2--);
        System.out.println("dec2 reikšmė po dec2-- = " + dec2);

        // #########################################################

        // Relational paskaitos_fundamentals.sacademy.operatoriai

        // Equality (lygybės) operatorius

        int varr = 2,
            varr2 = 3;

        System.out.println("varr == varr2: "  +  (varr == varr2));

        int varr3 = 4,
            varr4 = 4;

        System.out.println("varr3 == varr4: "  +  (varr3 == varr4));

        // Inequality (nelygybės) operatorius

        System.out.println("varr != varr2: "  +  (varr != varr2));
        System.out.println("varr3 != varr4: "  +  (varr3 != varr4));

        // Greater than > ir greater than or equal to paskaitos_fundamentals.sacademy.operatoriai

        System.out.println("varr > varr2: "  +  (varr > varr2));
        System.out.println("varr >= varr2: "  +  (varr >= varr2));

        // Less than < ir less than or equal to <=  paskaitos_fundamentals.sacademy.operatoriai

        System.out.println("varr3 < varr4: "  +  (varr3 < varr4));
        System.out.println("varr3 <= varr4: "  +  (varr3 <= varr4));

        // #########################################################

        // Loginiai paskaitos_fundamentals.sacademy.operatoriai

        // Conjuction (konjukcija/IR/AND) operatorius (&&)
        // Jeigu viena iš reikšmių yra lygi false, tuomet bendras rezultas bus lygus false.
        // ABI REIKŠMĖS TURI BŪTI TRUE, kad rezultatas būtų true;

        System.out.println("true && false: " + (true && false));

        System.out.println("true && true: " + (true && true));

        // Disjunction/logical sum (disjunkcija/ARBA/OR) operatorius (||)
        // Kad rezultatas būtų true, turi būti bent vieną true reikšmė operacijoje
        // Tik jeigu abi reikšmės yra false, rezultatas bus false

        System.out.println("true || false: " + (true || false));

        System.out.println("true || true: " + (true || true));

        System.out.println("false || false: " + (false || false));

        // Negation (neigimo) operatorius (!)
        // Gražina priešingą loginę reikšmę

        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);
        System.out.println("!(true && true): " + !(true && true));



    }

}
