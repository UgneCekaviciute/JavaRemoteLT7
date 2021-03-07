package paskaitos_fundamentals.sacademy.static_methods;

public class Pagrindine {

    public static void main(String[] args) {

        // Taip kviesti statinių metodų mes NEPRIVALOME IR NETURĖTUME:
        SomeClassUtils someClassUtils = new SomeClassUtils();
        someClassUtils.pasisveikink();

        // Statinius prieinamus (t.y su prieiti leidžiančiu access modifier'iu) metodus/kintamuosius
        // galime pasiekti nekuriant jokių objektų. Užtenka parašyti klasės vardą ir tašką.
        // Tuomet pasieksime prieinamus metodus/kintamuosius įprastiniu būdu:
        SomeClassUtils.pasisveikink();

    }
}
