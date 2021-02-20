package advanced.interfaces.example2;

public class Plane extends AirTransport implements Fly {
    //refaktorinamas kintamasis speed ir konstruktorius su
    // žodžiais extends tėvinės klasės paveldėjimui ir super
    // kintamojo gavimui iš tėvinės klasės AirTransport.
    //tada implementuojame Fly interface su jame esančiu metodu
    // calculateMaxSpeed.

    public Plane(int speed){
        super(speed);
    }

    @Override
    public int calculateMaxSpeed() {
        return speed + 50;
    }

    @Override
    public boolean canFly(String condition) {
        return true; //visada grąžins true
    }
}
