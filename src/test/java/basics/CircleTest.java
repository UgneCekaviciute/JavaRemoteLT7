package basics;

import fundamentals_testing.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void shouldCalculateCircleLenght() {
        //given
        //sukuriamas circle klasės objektą
        Circle circle = new Circle(10);
        //when
        int result = circle.calculateCircleLength();
        //then
        Assertions.assertEquals(62, result);
    }
    @Test
    public void shouldCalculateCircleArea() {
        //given
        Circle circle = new Circle(5);
        //when
        int result = circle.calculateCircleArea();
        //then
        Assertions.assertEquals(78, result);
    }
}
