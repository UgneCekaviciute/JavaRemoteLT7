package paskaitos_fundamentals.sacademy.spausdinimo_metodai_ir_komentarai;

public class PrintingAndCommentingDemo {
    // Vienos eilutes komentaras

    /*
        Daugiau nei vienos
        eilutes komentarai
     */

    // ###################################
    // Automatinio baigimo raktažodžiai:
    // Įveskite main ir paspauskite enter
    // Įveskite sout ir paspauskite enter
    // ###################################
    public static void main(String[] args) {
        // println metodas parašo tai ką jus jam perdavėt ir tada perkelia žymeklį į kitą eilutę
        System.out.println("Hello World!");
        // print metodas parašo tai ką jus jam perdavėt ir palieka žymeklį toj pačioj pozicijoj
        System.out.print("abc");
        System.out.println("Abc");

        // Iškilus poreikiui pasidomėti printf metodu
        // https://www.baeldung.com/java-printstream-printf
        System.out.printf("Gražūs skaičiai: %d, %d", 10, 1);
    }
}
