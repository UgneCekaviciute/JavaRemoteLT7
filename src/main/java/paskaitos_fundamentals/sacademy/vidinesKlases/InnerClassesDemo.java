package paskaitos_fundamentals.sacademy.vidinesKlases;

public class InnerClassesDemo {

    // Klasės viduje aprašytos klasės
    // vadinamos vidinėmis (inner) klasėmis:
    public static class SomeInnerClass {
        public void doSth() {

        }
    }

    public static SomeInnerClass init() {
        return new SomeInnerClass();
    }

    public static void main(String[] args) {
        // Vidinės deklaracijos ir inicializacijos taisyklės yra tokios pačios, kaip ir paprastos klasės
        SomeInnerClass someInnerClass = new SomeInnerClass();

        SomeInnerClass someInnerClass1 = init();
    }
}
