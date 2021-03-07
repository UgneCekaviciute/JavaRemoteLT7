package paskaitos_fundamentals.sacademy.ciklai;

public class BreakDemo {

    public static void main(String[] args) {
        // break sakinys išveda iš artimiausio ciklo, kuriame yra, bloko
        for (int i = 0; i<4; i++) {
            System.out.println("Fraze");
            if (i==2) {
                break;
            }
        }
    }
}
