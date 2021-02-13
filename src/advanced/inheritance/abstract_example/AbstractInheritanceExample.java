package advanced.inheritance.abstract_example;

public class AbstractInheritanceExample {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle (15) neveiks, nes
        // negalim abstraktaus objekto inicializuoti, galim
        // jį tik paveldėti

        //kuriamas car objektas; naviguoti ctrl+kpk (kairysis pelės klavišas)
        Car car1 = new Car("Volvo", 50);
        System.out.println(car1.vehicleMaxSpeed());

        Ship ship1 = new Ship("keltas",80);
        System.out.println(ship1.vehicleMaxSpeed());
    }
}
