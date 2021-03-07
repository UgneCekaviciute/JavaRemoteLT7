package paskaitos_fundamentals.sacademy.ciklai;

public class ContinueDemo {

    public static void main(String[] args) {
        // continue sakinys praleidžia vieną artimiausio ciklo, kuriame yra, iteraciją
        for (int i = 0; i<5; i++) {
            if (i==2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
