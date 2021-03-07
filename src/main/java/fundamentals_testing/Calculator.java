package fundamentals_testing;

public class Calculator {
    //kuriamas metodas, apskaičiuojantis sumą skaičių, kuris vėliau bus testuojamas
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    //kuriamas metodas, atimantis skaičius
    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
    //kuriamas metodas, dauginantis skaičius
    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    //kuriamas metodas, dalinantis skaičius
    public int divide(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
