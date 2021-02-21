package advanced.generics.generic_class.example2;

public class Car extends Vehicle{
    //paveldim Vehicle klasę su extends ir override
    @Override
    public void repair() {
        System.out.println("Car is repaired"); //implementuojamas repair metodas
    }
}
