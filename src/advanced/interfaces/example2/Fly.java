package advanced.interfaces.example2;

public interface Fly {
    //kuriamas metodas, kuris skaičiuos maksimalų greitį
    int calculateMaxSpeed();

    //kuriamas metodas, kuris patikrins sąlygą canFly
    boolean canFly(String condition);

}
