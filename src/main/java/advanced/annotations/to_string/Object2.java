package advanced.annotations.to_string;

public class Object2 {

    @Override //neturės įtakos galutiniam rezultatui, jis yra informacinio pobūdžio
    public String toString(){
        return Object2.class.getSimpleName(); //parašomas metodas, kuris grąžins klasės Object2 pavadinimą
    }
}
