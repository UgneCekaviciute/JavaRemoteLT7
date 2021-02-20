package advanced.polymorphism;

public class PolymorphismExampleMain {
    public static void main(String[] args) {
        //kuriamas interface'o objektas, pasinaudojant jį
        //implementuojančių klasių konstruktoriais (polimorfizmas)
        RemoteController remote = new TvRemoteController();
        remote.enable(true); //nurodoma sąlyga
        System.out.println(remote.getClass().getSimpleName());
        //atspausdinamas klasės pavadinimas, iš kurios tikrinta sąlyga

        remote = new AcRemoteController(); //objekto remote reikšmę pakeičiam
        //į AcRemoteController
        System.out.println(remote.getClass().getSimpleName());

        //sukuriami paprasti objektai
        TvRemoteController tvRemoteController = new TvRemoteController();
        AcRemoteController acRemoteController = new AcRemoteController();

        // nespausdina, kai bandoma paduoti į vieną objektą kito objekto info
        //printTvObject(acRemoteController);
        //printAcObject(tvRemoteController);

        printRemoteControllerObject(tvRemoteController);
        printRemoteControllerObject(acRemoteController);
        printRemoteControllerObject(remote);
    }
    // metodai, kurie atspausdina TvRemoteController
    // ir AcRemoteController objektų pavadinimus

    private static void printTvObject(TvRemoteController tv){
        System.out.println(tv.getClass().getSimpleName()); //galima naikinti
        //nes sukurtas printRemoteControllerObject metodas, skaitantis abu objektus
    }
    private static void printAcObject(AcRemoteController ac){
        System.out.println(ac.getClass().getSimpleName()); //galima naikinti
        //nes sukurtas printRemoteControllerObject metodas, skaitantis abu objektus
    }
    //KISS - keep it simple stupid. Juo vadovaujantis galima pasirašyti
    // metodą, kuris priims abejų klasių objektus (naudojamas vietoj dviejų
    //aukščiau naudotų metodų)

    private static void printRemoteControllerObject(RemoteController remote){
        System.out.println(remote.getClass().getSimpleName());
    }
}
