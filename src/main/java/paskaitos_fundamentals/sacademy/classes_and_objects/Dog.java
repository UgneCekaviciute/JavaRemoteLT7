package paskaitos_fundamentals.sacademy.classes_and_objects;

public class Dog {

    // instance paskaitos_fundamentals.sacademy.variables (state) / field/ laukas / objekto kintamieji / atributai:
    int height = 12;
    int weight = 5;
    String veisle = "Auksinis retriveris";

    // PASTABA: Konstruktoriaus pavadinimas turi būti identiškas klasės pavadinimui

    // PASTABA: Konstruktorius nieko negražina

    // Pastaba: Jeigu jūs nesukuriate jokių konstruktorių
    // tai klasėje konstruktorius be parametrų (default konstruktorius) automatiškai
    // susigeneruoja (default konstruktorius) (jūs to nematote, tuo pasirūpina JAVA)
    Dog() {

    }

    // Pastaba: Jeigu jūs sukuriate konstruktorių su parametrais
    // , automatiškai konstruktorius be parametrų nesigeneruoja
    Dog(int height, int weight, String veisle) {
        // this raktažodis yra nuorodą į esamą objektą
        this.height = height;
        this.weight = weight;
        this.veisle = veisle;
    }

    // paskaitos_fundamentals.sacademy.methods (behaviour) / metodai:

    void run() {
        System.out.println("Šuo bėga");
    }

    void atneskKamuoliuka(String kamuoliukas) {
        System.out.println("Šuo atneša kamuoliuką " + kamuoliukas);
    }



}
