package advanced.classes.local_classes;

public class LocalMainExample {
    //kuriama metodo viduj. Galima naudoti cikle. Egzistuoja tik tam tikro matomumo rėžiuose šiuo atveju for ciklo

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
            class Pair { //Pair yra lokali klasė
                String key;
                int value;

                public Pair(String key, int value) {
                    this.key = key;
                    this.value = value;
                }

                public void print() {
                    System.out.println(value);
                }
            }

            Pair pair = new Pair("key", i);
            pair.print();
        }
       // Pair pair = new Pair("key", 0); //neras Pair klasės, nes ji yra vidinė ir naudojama for cikle
        //norint, kad su Pair klase būtų galima dirbti viso main metodo viduj, tada reikia iškelti iš for ciklo ribų
    }

}
