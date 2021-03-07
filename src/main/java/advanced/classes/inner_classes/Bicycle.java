package advanced.classes.inner_classes;

public class Bicycle { //Bicycle išorinė klasė
    private int maxSpeed;

    public Bicycle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //Inner class
    public class Wheel { //wheel vidinė klasė
        public void damage(){
            maxSpeed *= 0.5;
        }
    }
}
