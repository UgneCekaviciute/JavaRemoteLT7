package advanced.interfaces.example1;

public interface Shape {

    double getArea(); //rašomas duomenų tipas kas bus grąžinta ir metodo pavadinimas
    double getPerimeter();

    //galima sukurti tokius metodus, kurie bus naudojami
    // visose klasėse, jose metodo neaprašius (nereikėjo implementuoti
    // su override
    //sukursim metodą, kuris atspausdins klasės pavadinimą
    //default metodai privalo turėti implementaciją
    default void printShape(){
        System.out.println("Shape: " + this.getClass().getSimpleName());
    }
}
