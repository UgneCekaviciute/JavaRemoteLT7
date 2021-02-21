package advanced.generics.generic_class.example2;

public class Garage<T extends Vehicle> {
    //vehicle T tipo kintamasis su konstruktorium
    private T vehicle;
    public Garage(T vehicle){
        this.vehicle = vehicle;
    }
    //kviečiamas repair metodas. Kad generic klasės tipas turėtų repair metodą
    //turim paveldėti savybes iš Vehicle klasės viršuj prie T prirašius
    //extends Vehicle (abstrakčios klasės pavadinimas)
    public void repairVehicle(){
        vehicle.repair();
    }
}
