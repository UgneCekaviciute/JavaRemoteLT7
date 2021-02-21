package advanced.generics.generic_class.example2;

public class CarGarage {
    //Car kintamasis su konstruktorium
    private Car car;
    public CarGarage(Car car){
        this.car = car;
    }
    //kviečiamas repair metodas iš Car klasės
    public void repairCar(){
        car.repair();
    }
}
