package advanced.interfaces.example2;

public class Main {
    //sukuriama main klasė  su main metodu, sukuriam objektus
    //Ballon ir plane ir išspausdinam anksčiau aprašytus
    //metodus calculateMaxSpeed bei canFly, kuris tikrina sąlygas
    public static void main(String[] args) {
        Balloon balloon = new Balloon(50);
        System.out.println(balloon.calculateMaxSpeed());
        System.out.println(balloon.canFly("bad"));

        Plane plane = new Plane(600);
        System.out.println(plane.calculateMaxSpeed());
        System.out.println(plane.canFly("bad"));

        //Polimorfizmas - galima susikurti abstrakčios (tėvinės)
        // klasės objektą pasinaudojus vaikinės klasės
        // konstruktoriumi. arba sukurti interface'o objektą
        // pasinaudojant jį implementuojančių klasių objektais

        AirTransport airTransport = new Balloon(1);
    }
}
