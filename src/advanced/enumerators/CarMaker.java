package advanced.enumerators;

public enum CarMaker {
    //enumeratorius kiekviename savo kintamojo viduje gali turėti papildomų reikšmių. Norint pasiekti tas reikšmes
    //reikia sukurti ir kintamuosius (final) ir konstruktorių CarMaker
    BMW("bymer", 1850),
    VOLVO("volvo", 2020),
    MB("mercedes-benz", 1920);

    final String fullName;
    final int establishedIn;

    CarMaker(String fullName, int establishedIn){
        this.fullName = fullName;
        this.establishedIn = establishedIn;
    }
}
