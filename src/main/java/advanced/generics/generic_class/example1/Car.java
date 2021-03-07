package advanced.generics.generic_class.example1;

public class Car {
    //sukuriamas kintamasis ir jo konstruktorius
    private int engine;

    public Car(int engine){
        this.engine = engine;
    }
    //kuriamas toString metodas DPK, generate, toString

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
