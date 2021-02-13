package homework.nd3;

public class Rectangle {
    private int a = 2;
    private int b = 3;
    private int area = a * b;
    private int perimeter = (a + b)*2;

    public Rectangle() {
        this.a = a;
        this.b = b;
        this.area = area;
        this.perimeter = perimeter;
    }

    void setA (int a) {
        this.a = a;
    }
    void setB (int b) {
        this.b = b;
    }
    int getA() {
        return this.a;
    }
    int getB() {
        return this.b;
    }
    void setArea (int area) {
        this.area = area;
    }
    void setPerimeter (int perimeter) {
        this.perimeter = perimeter;
    }
    int getArea() {
        return this.area;
    }
    int getPerimeter() {
        return this.perimeter;
    }
}
