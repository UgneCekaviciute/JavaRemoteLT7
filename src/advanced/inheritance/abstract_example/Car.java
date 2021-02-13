package advanced.inheritance.abstract_example;

public class Car extends Vehicle {
    //Klasės paveldėjimui sukuriamas kintamasis
    // ir jo konstruktorius. Reikia parašyti extends,
    // kad įdėtume tėvinę klasę
    //galima paveldėti tik vieną tėvinę klasę

    private String model;
    //turime iškviesti tėvinės klasės konstruktorių su
    // žodžiu super ir konstruktoriuje pridėti kintamąjį
    // tėvinį

    public Car(String model, int maxSpeed){
        super(maxSpeed); //super metodas kreipiasi į tėvinės klasės konstruktorių
        this.model = model;
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 20; //viršutinė eilutė buvo raudona kur klasė sukurta,
        // todėl reikėjo implementuoti metodą, paspaudus ant raudonos
        //lemputės ir pasirinkus implement method
        // maxSpeed raudonas, kol klasė yra private, kad
        //taip nebūtų reikia klasėje, kur sukurtas kintamasis
        // prie kintamojo parašyti protected, o ne private
    }
}
