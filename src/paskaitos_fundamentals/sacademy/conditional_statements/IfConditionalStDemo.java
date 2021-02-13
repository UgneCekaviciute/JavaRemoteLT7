package paskaitos_fundamentals.sacademy.conditional_statements;

public class IfConditionalStDemo {

    public static void main(String[] args) {
        // Sąlyginis sakinys (conditional statement) suteikia galimybę vykdyti kodo dalį, tik tuomet
        // kai jis atitinka kokią nors sąlygą.

        // if sąliginio sakinio (if statement) paprasčiausias pavyzdys:
        if (true) {
            System.out.println("Labas rytas");
        }

        if (false) {
            System.out.println("Labas vakaras");
        }

        // if

        boolean deglasDega = true;

        if (deglasDega) {
            System.out.println("Ruošiasi polio gynybai");
        }

        // if (kartu su else)

        boolean deglasDega2 = false;

        if (deglasDega2) {
            System.out.println("Ruošiasi polio gynybai");
        } else {
            System.out.println("Viskas Gerai");
        }

        System.out.println("####################################\n");

        // if (kartu su else if)
        // Sąlyga: Jeigu loterijos metu jūsų kamuoliuko vertė
        // yra lygi 8 - jūs gaunate tušinuką, jeigu su kamuoliuko
        // vertė lygi 5 - jūs gaunate trintuką. Jeigu loterijos
        // komuoliuko vertė nėra lygi nei 8-iems, nei 5-iems -
        // negaunate jokio prizo

        int kamuoliukoVertė = 5;

        if (kamuoliukoVertė == 8) {
            System.out.println("Jūsų prizas: tušinukas");
        } else if (kamuoliukoVertė == 5) {
            System.out.println("Jūsų prizas: trintukas");
        } else {
            System.out.println("Jūs nieko nelaimėjote :(");
        }




        System.out.println("####################################\n");

        // Sąlyga: Jeigu Petriukas išmes šiukšles ir išplaus indus -
        // mama jam leis žaist su kompiuteriu.

        boolean siukslesIsmestos = true;
        boolean indaiIsplauti = true;

        if (siukslesIsmestos && indaiIsplauti) {
            System.out.println("Mama leidžia žaisti su kompiuteriu");
        }

        System.out.println("####################################\n");

        // Sąlyga: Jeigu jūsų temperatūra yra didesnė arba lygi 36,6
        // ir mažesnė negu 37 laipsniai - jūs esate sveikas

        float kunoTemperatura = 36.7f;

        if (kunoTemperatura >= 36.6f && kunoTemperatura < 37) {
            System.out.println("Jūs esate sveikas");
        }

    }
}
