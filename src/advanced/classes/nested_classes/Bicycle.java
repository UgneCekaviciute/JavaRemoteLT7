package advanced.classes.nested_classes;

public class Bicycle { //išorinė klasė Bicycle
    private int maxSpeed; //apsaugom kintamąjį maxSpeed

    public Bicycle(int maxSpeed){ //sukuriam klasę išorinę
        this.maxSpeed = maxSpeed; //sukuriam klasės kintamąjį
    }

    public int getMaxSpeed() { //sukuriam getterį kintamojo grąžinimui
        return maxSpeed;
    }

    //Nested class. Į upgrade metodą paduodam išorinės
    // klasės objektą
    public static class Mechanic { //parašius static žodį, vidinė ir
        // išorinė klasės veiks nepriklausomai viena nuo kitos; vidinė klasė Mechanic
        public void upgrade(Bicycle bicycle) {
            bicycle.maxSpeed *=2;
        }
    }
}
