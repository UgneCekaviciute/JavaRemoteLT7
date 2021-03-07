package paskaitos_fundamentals.sacademy.conversion;

public class ManualConversionDemo {

    public static void main(String[] args) {

        // Casting (reikšmės duomenų tipo keitimas į kitą duomenų tipą "rankų" pagalba)

        // Castinimas iš didesnio sveikojo duomenų tipo į mažesnį
        // Apeinama šita taisyklė: "Automatinis narrowing konvertavimas neegzistuoja
        // išskyrus su byte, short ir char"
        long varLong1 = 10;
        int varInt1 = (int)varLong1;

        // Castinimas iš slankiojo kablelio duomenų vertės į sveikojo tipo vertę
        // Pastaba: pati Java tuo nepasirūpina
        float num1 = 10.0f;
        int num2 = (int)num1;

        // ####################
        // Sudėtingesni atvejai
        // ####################

        // Vertė viršyja galimą maksimalią duomenų tipo vertę.
        // Kadangi sveikas skaičius automatiškai yra int tipo
        // negalima rašyti vertės viršijančios maksimalią galimą
        // int vertę.:
        long varLong2 = 2147483648L;

        // Atkreipti dėmesį, kad castinama reikšmė tilptų
        // kintamojo tipo, kuriam ji priskiriama rėžiuose:
        short varShort = (short)1921222;
        // Bus išvesta iškraipyta reikšmė
        System.out.println(varShort);

    }
}
