package paskaitos_fundamentals.sacademy.overloading;

//(lietuviškai: metodų perkrova)
public class MethodOverloadingDemo {


    void doSth() {

    }

    // Nekompiliuos:
    //    int doSth() {
    //        return 0;
    //    }
    // #############

    void doSth(int a) {

    }

    void doSth(String a) {

    }

    void doSth(int a, int b) {

    }

    void doSth(int a, String b) {

    }

    void doSth(String a, int b) {

    }
}
