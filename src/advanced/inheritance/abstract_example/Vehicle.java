package advanced.inheritance.abstract_example;

public abstract class Vehicle {
    //abstrakčių klasių objektų sukurti ir inicializuoti negalim.
//kuriamas abstraktus kintamasis
    protected int maxSpeed;
    //kuriamas abstraktus konstruktorius
    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
//sukuriamas abstraktus metodas be implementacijos
    //ctrl+alt+l sutvarkyti vaizdui
    public abstract int vehicleMaxSpeed();
}
//Vehicle yra tėvinė klasė, Car ir Ship vaikinės klasės
