package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionExamples {
    //kuriamas testinis metodas, tikrinantis Calculator klasės sudėties metodą
    @Test
    public void testAssertEquals() {
        //given
        //negalime pasiekti add metodo, nesukūrę calculator objekto
        Calculator calculator = new Calculator();
        //when
        //išsisaugom rezultatą iš turimo metodo add į int kintamąjį result
        int result = calculator.add(5, 115);
        //then
        //kviečiame AssertEquals metodą
        // Assertions.assertEquals(3, result); mes test failed
        assertEquals(120, result); //testas bus praeitas
    }
    @Test //testas, tikrinantis atimtį
    public void testCalculatorSubtraction() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtract(5, 115);
        //then
        assertEquals(-110, result); //testas bus praeitas
    }
    @Test //testas tikrinantis daugybą
    public void testCalculatorMultiplication() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(2, 5);
        //then
        assertEquals(10, result); //testas bus praeitas
    }
    @Test //testas tikrinantis dalybą
    public void testCalculatorDivision() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(25, 5);
        //then
        assertEquals(5, result); //testas bus praeitas
    }
    //tikrinam ar vienas skaičius lygus kitam
    @Test
    public void testAssertTrueFalse() {
        // given
        int firstNum = 5;
        int secondNum = 15;
        //when
        boolean condition = firstNum == secondNum;
        //then
        assertTrue(firstNum != secondNum);
        assertFalse(condition);
    }
    @Test
    public void testAssertNullOrNotNull() {
        //given
        String emptyText = null;
        String text = "sekmadienis";
        //when
        //nėra kaip kitaip tikrinti, tai nieko nerašom
        //then
        assertNull(emptyText);
        assertNotNull(text);
    }
    //palyginam ar masyvai vienodi. Tikrina visas masyvo reikšmes
    @Test
    public void testArrayEquals() {
        //given
        int[] firstArr = {1,2,3};
        //int[] secondArr = {4,5,6}; //nesutaps
        int[] secondArr = {1,2,3};
        //when

        //then
        assertArrayEquals(firstArr, secondArr);
    }
    //tikrinam ar vienodi String'ai
    @Test
    public void testSameOrNotSame() {
        //given
        String text1 = "abc"; //String pool
        String text2 = "abc"; //String pool
        String text3 = new String("abc"); //ši reikšmė ne String pool'e, o heap'e
        //when

        //then
        assertSame(text1, text2);
        assertNotSame(text2, text3); //nesutaps adresai, todėl testas praeis
    }
}
