package paskaitos_fundamentals.sacademy.conditional_statements;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        // Sąlyga: Jeigu loterijos metu jūsų kamuoliuko vertė
        // yra lygi 8 - jūs gaunate tušinuką, jeigu su kamuoliuko
        // vertė lygi 5 - jūs gaunate trintuką, jeigu su kamuoliuko
        // vertė lygi 6 - jūs gaunate drožtuką. Jeigu loterijos
        // komuoliuko vertė nėra lygi nei 8-iems, nei 5-iems -
        // negaunate jokio prizo

        int kamuoliukoVerte = 3;

        switch (kamuoliukoVerte) {
            case 8:
                System.out.println("Jūsų prizas: tušinukas");
            break;
            case 5:
                System.out.println("Jūsų prizas: trintukas");
            break;
            case 6:
                System.out.println("Jūsų prizas: drožtukas");
            break;
            default:
                System.out.println("Jūs nieko nelaimėjote :(");
        }

        // PASTABA: Jeigu norite pasidomėkite
        // wrapper klasėmis (pvz.: Integer)
        // Duomenų tipai palaikomi switch statement'o
        // int ir Integer (pasidomėkite patys kas tai yra)
        // byte ir Byte (pasidomėkite patys kas tai yra)
        // short ir Short (pasidomėkite patys kas tai yra)
        // char ir Character (pasidomėkite patys kas tai yra)
        // String
        // enum reikšmės (pasidomėkite patys kas tai yra)


    }
}
