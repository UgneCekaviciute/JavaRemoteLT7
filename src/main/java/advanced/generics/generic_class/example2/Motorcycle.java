package advanced.generics.generic_class.example2;

public class Motorcycle extends Vehicle{
    //paveldim Vehicle klasę su extends ir override
    @Override
    public void repair() {
        System.out.println("Motorcycle is repaired"); //implementuojamas repair metodas
    }
}
