package advanced.classes.nested_classes;

public class NestedMainExample {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(5);
        System.out.println(bicycle.getMaxSpeed());

        //kuriam vidinę nested klasę, nereikia išorinės
        // klasės objekto po lygybės. Kviesdami upgrade metodą
        // negausime jokios reikšmės
        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();

        //kviečiam upgrade metodą
        mechanic.upgrade(bicycle); //kaip argumentą reikia paduoti
        // bicycle objektą skliausteliuose
        System.out.println(bicycle.getMaxSpeed());
    }
}
