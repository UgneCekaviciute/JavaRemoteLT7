package paskaitos_fundamentals.sacademy.variables;

// final kintamieji (konstantos) gali būti inicializuoti tik vieną kartą

public class FinalVariableDemo {

    // final objekto kintamieji (konstantos) turi būti iš karto incializuoti toj pačioj eilutėj kaip
    // ir deklaracija
    final int var1 = 1;

    void doSth() {
        // Tuo tarpu final lokalieji kintamieji gali būti incializuoti ir kitoje eilutėje
        final int localVar1;
        localVar1 = 20;

        // Kadangi reikšmės priskirtos ankstesnėse eilutės šios eilutės nebus kompiliuojamos:
        // var1 = 2;
        // localVar1 = 10;
    }
}
