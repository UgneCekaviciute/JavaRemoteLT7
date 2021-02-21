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
    //galima lyginti ir du parametrus, bet antro parametro, pvz weight lyginimui
    // turi būti sukurtas kitas metodas Car klasėje compareWeight
    // public int compareWeight(Car object){return this.weight - object.weight;}
    // , o objektas turi būti su dviem parametrais maxSpeed ir weight.
    // public Car (int maxSpeed, int weight) {this.maxSpeed = maxSpeed; this.weight = weight;}
    // Tada compareTo lygins greičius, o compareWeight svorius

    @Override
    public Car getObject() {
        return null;
    }


}
