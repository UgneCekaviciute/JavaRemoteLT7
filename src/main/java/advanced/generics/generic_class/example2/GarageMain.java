package advanced.generics.generic_class.example2;

public class GarageMain {
    public static void main(String[] args) {
        //kuriami du objektai car ir motorcycle
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        //kuriami carGarage ir motorcycleGarage objektai ir į konstruktorius
        // paduodam klasės objektus car ir motorcycle
        //CarGarage carGarage = new CarGarage(car);
       // MotorcycleGarage motorcycleGarage = new MotorcycleGarage(motorcycle);

        //kviečiam repair metodą:
        //carGarage.repairCar();
       // motorcycleGarage.repairMotorcycle();

        //pasinaudodami generic sukuriam tik vieną klasę Garage vietoj dviejų
        //CarGarage ir MotorcycleGarage ir iškviečiam repair metodą:
        Garage<Car> carGarage = new Garage<>(car); //parašom <Car> iš kokios klasės kuriam generic klasės objektą (car)
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        carGarage.repairVehicle();
        motorcycleGarage.repairVehicle();
        //CarGarage ir MotorcycleGarage klases galima ištrinti, nes jos nereikalingos kai sukuriama generic klasė
    }
}
