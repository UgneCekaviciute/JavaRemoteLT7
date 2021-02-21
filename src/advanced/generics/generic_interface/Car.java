package advanced.generics.generic_interface;

public class Car implements Comparable<Car>{
    //implementuojamas Car klasėje Comparable interface'as su metodais
    //compareTo ir getObject. Prie interface pavadinimo reikia parašyti klasę
    //kurios duomenų tipą imsime <Car>

    private int maxSpeed; //sukuriamas kintamasis maxSpeed ir Car objekto konstruktorius su maxSpeed
    public Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    @Override
    public int compareTo(Car object) {
        return this.maxSpeed - object.maxSpeed; //mūsų atveju this bus car1 maxSpeed = 150,
        //o object bus car2 maxSpeed = 50. 150-50>0 todėl Main klasėj if sąlyga tenkinama
    }

    @Override
    public Car getObject() {
        return null;
    }


}
