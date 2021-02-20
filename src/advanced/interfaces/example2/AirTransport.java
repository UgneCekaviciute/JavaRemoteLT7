package advanced.interfaces.example2;

public abstract class AirTransport {
    //kadangi baloon ir plane klasės turi tą patį kintamąjį, mes jį
    //refaktorinsim, sukurdami abstrakčią tėvinę klasę
    protected  int speed;

    public AirTransport(int speed){
        this.speed = speed;
    }
}
