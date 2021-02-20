package advanced.interfaces.example1;

public class Rectangle implements Shape{
    //aprašome du double tipo elementus
    private double height;
    private double width;

    //parašome konstruktorių
    public Rectangle(double height, double width){
        this.height = height;
        this.width =width;
    }

    @Override
    public double getArea() {
        return height*width; //aprašome kaip implementuosime
    } //metodas apskaičiuos plotą figūros

    @Override
    public double getPerimeter() {
        return (2 * height)+(2 * width);
    }
}
