package paskaitos_fundamentals.sacademy.classes_and_objects;

// Importuota mūsų klasė
import paskaitos_fundamentals.sacademy.access_modifiers_demo.Car;

// Jeigu norime importuoti visas pakete esančia klases, po paketo pavadinimo reikia
// padėti tašką ir žvaigždutę:

// Importavimo pavyzdys, kuomet naudojamos daugiau nei viena klasės iš to pačio paketo


public class Main {
    public static void main(String[] args) {
        // reference (nuorodos) kintamojo deklaracija (atrodo taip pat kaip ir primityvaus kintamojo deklaracija)
        Dog dog1;
        // reference (nuorodos) kintamojo inicializacija (nuorodos kintamajame patalpiniama nuorodą į objektą)
        dog1 = new Dog(); // po "new Dog();" kodo įvykdymo JVM (Java virtuali mašina) heap'e
                          // (duomenų struktūra esanti JVM'e) sukuria vieną Dog objektą

        // Nuorodos kintamasis yra tarsi distancinis pultas, kurio mygtukus spaudant liepiame televizoriui atlikti tam
        // tikrus veiksmus
        // Pastaba: taip pasiekti kintamuosius nėra taisyklinga, taip jis pasiekiamas tik demonstravimo tikslais:
        System.out.println(dog1.weight);

        // Pastaba: tiesioginis reikšmių priskyrimas objekto kintamajam yra NETAISYKLINGAS,
        // nes tai irgi pažeidžia tvarkos taisykles,
        // tačiau demonstraciniais tikslais aš pateikiu šį pavyzdį:
        dog1.height = 10;

        dog1.run();

        dog1.atneskKamuoliuka("Raudonas kamuoliukas");

        Dog dog2 = new Dog(10, 12, "Mišrūnas");

        System.out.println(dog2.veisle);


        ProperDog properDog = new ProperDog();

        properDog.setHeight(1235);
        System.out.println(properDog.getHeight());

        //######################################

        Car car = new Car();
        // Leidžia pasiekti, nes šis kintamasis ir metodas
        // turi public access modifier'į:
        car.spalva = "žalia";
        car.pypsek();

        //######################################

        paskaitos_fundamentals.sacademy.example2.Car carKitoPaketo = new paskaitos_fundamentals.sacademy.example2.Car();
        carKitoPaketo.spalva = "žalia";
        carKitoPaketo.pypsek();
    }
}
