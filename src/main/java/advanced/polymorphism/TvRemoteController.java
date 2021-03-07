package advanced.polymorphism;

public class TvRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) { //implementuojam metodą
        if (action){
            System.out.println("Turning TV on");
        } else {
            System.out.println("Turning TV off");
        }
    }
}
