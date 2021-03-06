package paskaitos_fundamentals.sacademy.access_modifiers_demo;

public class Car {

    // Access modifier'iai nusako kintamojo arba metodo preinamumo lygmenį

    // private access modifier'iai nurodo jog kintamasis arba metodas
    // yra pasiekiamas tik toje klasėje, kur yra aprašytas:
    private String brand;
    private void turnOnEngine() {
        // A lot of code
    }
    void drive() {
        System.out.println(brand);
        turnOnEngine();
    }
    // #################################################################
    // public access modifier'iai nurodo jog kintamasis arba metodas
    // yra pasiekiamas visoje programoje
    public String spalva;
    public void pypsek() {
        konfiguruotiPypsėjimoMechnanizma();
        // pypsėjimo logika
    }
    // #################################################################
    // Kuomet access modifier'ius nėra nurodytas (tuomet jis įgauna
    // default/package-private access modifierį) - kintamasis ar metodas
    // be nurodyto access modifier'iaus gali būti pasiektas klasėse,
    // esančiose tik tame pačiame pakete (šiuo atveju drive() metodas
    // yra pasiekiamas tik accessModifiersDemo pakete)

    // PASTABA: Jeigu metodas yra naudojamas tik klasės viduje - jis turėtų būti privatus
    private void konfiguruotiPypsėjimoMechnanizma() {
        // logika
    }

    // protected access modifier'is turi tokias pat sąvybes kaip default access modifier + yra pasiekimas subklasėse,
    // net jei jos yra kitame pakete


}
