package advanced.optional;

import java.util.Optional;

public class OptionalExample {
    // bus kuriama generic optional klasė, ji gali turėti objektus,
    // primityvius kintamuosius ir ji nemes null pointer exception klaidos
    //optional klasė naudojama, kai nežinom, ar reikšmė bus inicializuota ar ne

    public static void main(String[] args) {
        //daroma null pointer exception klaida, kad vėliau būtų galima ją išspręsti
        //String text = null; //sukuriamas kintamasis, ir inicializuojam
        //bandom gauti 4 simbolio reikšmę
        //text.charAt(4); //kadangi bandom iš null (nieko) paimti reikšmę, gaunam NullPointException
        //panaikinam šią klaidą su Optional kintamuoju:
        //Optional<String> text = Optional.ofNullable(null);

      //  if (text.isPresent()){
      //      text.get().charAt(4);
      //  } else {
      //      System.out.println("Text is not initialized");
      //  }

        //Sukuriami trys kintamieji
        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("World");
        Optional<String> stringOptional3 = Optional.ofNullable(null);
        //Lambda expression - kai paduodam gautą atsakymą iš ifPresent metodo į kintamojo reikšmę
        stringOptional1.ifPresent(variable -> System.out.println(variable)); //jei kintamasis
        //stringOptional1 yra inicializuotas, jis pavadinamas nauju vardu variable ir išspausdinama
        // jo reikšmė po rodyklės -> ženklo
        String text = stringOptional2.orElse("Tekstas");
        String value = stringOptional3.orElse("Hello World"); //patikrina ar kintamasis stringOptional3
        //yra inicializuotas su reikšme, jei taip tai ją grąžina, jei ne, tada gaunama nauja reikšmė

        System.out.println(text); //text kintamojo reikšmė bus World, nes kintamasis stringOptional2
        //buvo inicializuotas su reikšme World
        System.out.println(value); //value kintamojo reikšmė bus Hello World, nes kintamasis stringOptional3
        //nebuvo inicializuotas. Jo rteikšmė buvo null, reiškia jos nebuvo.
    }
}
