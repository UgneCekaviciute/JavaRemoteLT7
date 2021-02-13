package paskaitos_fundamentals.sacademy.static_import;

// Jeigu norite pasiekti prieinamą statinį kintamąjį/metodą
// kas kart prieš tai nerašant klasės pavadinimo - tai galite
// padaryti parašius statinį importą ir po paketo nurodžius
// norimą pasiekti kintamajį/metodą
import static java.lang.Math.PI;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println(PI);
    }

}
