package advanced.generics.generic_interface;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(150);
        Car car2 = new Car (50);

        if (car1.compareTo(car2) > 0){ //galima lyginti ir taip if (car1.compareTo(new Car(greitis nurodomas))>0)
            System.out.println("car1 is faster"); //return this.maxSpeed - object.maxSpeed;
            // mūsų atveju this bus car1 maxSpeed = 150,
            //o object bus car2 maxSpeed = 50. 150-50>0 todėl if sąlyga tenkinama
        } //galima lyginti ir du parametrus, bet antro parametro, pvz weight lyginimui
        // turi būti sukurtas kitas metodas Car klasėje compareWeight
        // public int compareWeight(Car object){return this.weight - object.weight;}
        // , o objektas turi būti su dviem parametrais maxSpeed ir weight.
        // public Car (int maxSpeed, int weight) {this.maxSpeed = maxSpeed; this.weight = weight;}
        // Tada compareTo lygins greičius, o compareWeight svorius
    }
}
