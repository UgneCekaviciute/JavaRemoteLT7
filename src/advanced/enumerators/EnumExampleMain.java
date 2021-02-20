package advanced.enumerators;

public class EnumExampleMain {
    public static void main(String[] args) {
        //norint pasiekti enumeratoriaus reikšmę, rašoma enum pavadinimas . ir objekto pavadinimą
        //Coffee.AMERICANO norint atspausdinti jo pavadinimą
        System.out.println(Coffee.AMERICANO.name());

        Coffee coffee = Coffee.valueOf("LATTE"); //sukuriamas enum objektas ir išspausdinamas jo pavadinimas
        System.out.println(coffee.name());

        System.out.println(CarMaker.MB.fullName); //atspausdinama
        //enumeratoriaus MB pilną pavadinimo reikšmę
        System.out.println(CarMaker.BMW.fullName + CarMaker.BMW.establishedIn);
        System.out.println(CarMaker.VOLVO);
    }
}
