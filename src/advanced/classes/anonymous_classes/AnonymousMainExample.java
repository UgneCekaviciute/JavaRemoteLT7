package advanced.classes.anonymous_classes;

public class AnonymousMainExample {
    //skiriasi nuo lokalios tuo, kad yra iškelta į atskirą failą.
    //labai retai naudojama.

    public static void main(String[] args) {

        //rašom sukurtos klasės pavadinimą

        HttpExecutor executor = new HttpExecutor() { //implementuosim objektus,
            // uždėję riestinius skliaustus

            @Override
            public String executeRequest() {
                return "Siandien sviecia saule";
            } //metodo implementacija buvo perrašyta kitos klasės mėlynas rutuliukas su rodykle
        }; //kviečiam objekte executor sukurtą metodą executeRequest
        System.out.println(executor.executeRequest());
    }
}
