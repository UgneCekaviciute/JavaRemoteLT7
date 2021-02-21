package advanced.generics.generic_class.example2;

public class MotorcycleGarage {
    //Motorcycle kintamasis su konstruktorium
    private Motorcycle motorcycle;
    public MotorcycleGarage(Motorcycle motorcycle){
        this.motorcycle = motorcycle;
    }
    //kviečiamas repair metodas iš Motorcycle klasės
    public void repairMotorcycle(){
        motorcycle.repair();
    }
}
