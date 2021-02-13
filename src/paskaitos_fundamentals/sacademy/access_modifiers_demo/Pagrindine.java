package paskaitos_fundamentals.sacademy.access_modifiers_demo;

public class Pagrindine {

    public void doSth() {
        Car car = new Car();
        // Neleis pasiekti:
//        System.out.println(car.brand);
//        car.turnOnEngine();
        //#################
        // Leidžia pasiekti, nes šis kintamasis ir metodas
        // turi public access modifier'į:
        car.spalva = "žalia";
        car.pypsek();
        // Leidžia pasiekti, nes šis  metodas
        // turi default access modifier'į:
        car.drive();
    }
}
