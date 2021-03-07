package paskaitos_fundamentals.sacademy.variables;

public class InstanceVariableDemo {

    // PASTABA: Kuomet objekto kintamasis nėra inicializuotas, jam iš karto yra priskirta numatyta (default) reikšmė

    // PASTABA: Objekto kintamasis gali būti neinicializuotas (gali neturėti reikšmės)

    // Objekto kintamojo deklaravimas. Deklaravimas susideda is kintamojo tipo ir kintamojo vardo (name/identifier):
    int abc;

    // Objekto kintamojo deklaravimas ir inicializacija
    int abc2 = 10;

    void doSth() {
        // Objekto kintamojo inicializacija. Initialization - reiksmes priskyrimas
        abc = 12;
    }

    void doSthElse() {
        // Objekto kintamasis yra pasiekamas visuose metoduose toje klaseje, kurioje yra deklaruotas
        System.out.println(abc2);
    }
}
