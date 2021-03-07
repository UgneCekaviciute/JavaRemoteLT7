package advanced.inheritance.abstract_example;

public class Boat extends Ship{
    public Boat(String type, int maxSpeed){
        super(type, maxSpeed);
    }
    //vaikinė klasė gali paveldėti kitą vaikinę klasę Ship arba Car arba tėvinę klasę Vehicle
}
