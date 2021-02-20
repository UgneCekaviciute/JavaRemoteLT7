package advanced.interfaces.example2;

import java.util.Random;

public class Balloon extends AirTransport implements Fly {
    //refaktorinamas kintamasis speed ir konstruktorius su
    // žodžiais extends tėvinės klasės paveldėjimui ir super
    // kintamojo gavimui iš tėvinės klasės AirTransport.
    //tada implementuojame Fly interface su jame esančiu metodu
    // calculateMaxSpeed.

    public Balloon(int speed){
        super (speed);
    }

    @Override
    public int calculateMaxSpeed() {
        //susikuriam random objektą; ir aprašom kaip metodas bus vykdomas
        Random random = new Random();
        return 100 / speed * random.nextInt(10); //greitis bus padaugintas
        //iš bet kokio skaičiaus. Įrašius prie random skaičių, ims skaičių
        // nuo 0 iki nurodyto skaičiaus
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equalsIgnoreCase("good");
    } //implementuojam canFly metodą, nurodydami sąlygą, kad
    //duota sąlyga atitiks žodį good. t.y. jei spausdinant programa
    //pamatys žodį good, tada sąlyga bus tenkinama kaip true, kitu
    //atveju bus false
}
