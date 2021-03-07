package advanced.interfaces.example1;

public class Square implements Shape {
    //žodis implements reikalingas implementavimui interface'o
    //kai nurodysime į savo interface'ą, reikės implementuoti metodą
    //sukuriam vieną double tipo elementą length
    private double length;
    //sukuriam konstruktorių
    public Square(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2); //aprašome kaip implementuosime
        //metodas apskaičiuos plotą figūros

    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
