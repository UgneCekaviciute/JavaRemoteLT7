package basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAnnotations {
    //kuriamas metodas, panaudojant anotaciją BeforeAll
    @BeforeAll //veikia prieš paleidžiant visus testus, naudojama static ir setUp metodą
    public static void setUp() {
        System.out.println("This message will be displayed once before executing all test methods");
    } //pasikeliam duomenų bazę

    //metodas su BeforeEach
    @BeforeEach
    public void init() {
        System.out.println("This message will be shown before each test method");
    } //ištrinam duomenų bazės lentelę

    @AfterAll //turi būti statinis. Bus paleistas vieną kartą po visų testų.
    public static void tearDown() {
        System.out.println("This message will be displayed once after executing all test methods");
    } //BeforeAll ir AfterAll anotacijomis aprašyti metodai nieko netestuoja,
    // jie tik paleidžia ir uždaro programas, duombazes ar kt.

    //metodas su AfterEach
    @AfterEach
    public void tear() {
        System.out.println("This message will be shown after each test method");
    }

    //Pagrindinė anotacija @Test

    @Test //parašoma anotacija ir metodas
    public void firstTest(){
        System.out.println("Executing first test...");
    }
    //kuriamas dar vienas metodas
    @Test
    public void secondTest () {
        System.out.println("Executing second test...");
    }
    //kuriamas metodas, su dviem anotacijom prieš jį
    @Test
    @DisplayName("Third test") //testų rezultato lauke rodo čia parašytą pavadinimą
    public void thirdTest () {
        System.out.println("Executing third test...");
    }
    //kuriamas metodas su anotacija test ir disabled
    @Test
    @Disabled //nurodo, kad testo metodas yra išjungtas ir jo vykdyti nereikia
    //kai paleidžiam visus testus nuo klasės lygio, paleidus tik metodą, jis veiks
    public void fourthTest () {
        System.out.println("Executing fourth test...");
    }
}
