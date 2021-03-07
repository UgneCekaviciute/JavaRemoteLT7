package paskaitos_fundamentals.sacademy.ciklai;

public class ForLoopDemo {

    public static void main(String[] args) {
        // for ciklo veikimas:
        // 1) Inicializuojamas kintamasis (šiuo atveju vykdomas: int i = 0)
        // 2) Vykdoma bulio išraiška (šiuo atveju: i < 3)
        // 3) Vykdomas for ciklo kūne/bloke esantis kodas (šiuo atveju: System.out.println("Blah");)
        // 4) Vykdomas atnaujinimo sakinys (update statement) (šiuo atveju: i++)
        // 5) Grįžtama į 2-ąjį žingsnį
        for (int i = 0; i < 3; i++) {
            System.out.println("Blah");
        }
    }
}
