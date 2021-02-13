package paskaitos_fundamentals.sacademy.variables;

public class LocalVariableDemo {

    // PASTABA: Lokalus kintamasis yra aprasomas metodo viduje

    void doSth() {
        // Lokalaus metodo deklaravimas (deklaravimas susideda is tipo nurodymo ir vardo(name/identifier) nurodymo):
        int abc;

        // Lokalaus metodo inicializacija. Inicializacija (Initialization) - reiksmes priskyrimas
        abc = 10;

        System.out.println(abc);
    }

    void doSthMore() {
        // Lokalus kintamasis PRIVALO būti inicializuotas (jam privalo būti priskirta reikšmė)
        int kint1;

        // Šitas kodas nesikompiliuos: System.out.println(kint1);
    }

    void doSthElse() {
        // Lokalusis kintamasis yra pasiekiamas tik tame metode, kuriame yra deklaruotas
        // Sitas kodas nesikompiliuos: System.out.println(abc);
    }
}
