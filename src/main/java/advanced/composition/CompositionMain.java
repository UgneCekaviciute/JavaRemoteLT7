package advanced.composition;

public class CompositionMain {
    public static void main(String[] args) {
        // sukuriami Tv objektas ir Bed objektas
        Tv tv = new Tv("UHD", 43);
        Bed bed = new Bed("King-size", "sleep-room");

        Room room1 = new Room(tv, bed);

        //arba jei nereikės programavimo eigoje Tv ir Bed objektų
        // galima kurti ir taip:
        Room room2 = new Room(
                new Tv("UHD", 43),
                new Bed("King-size", "sleep-room")
        );
    }
}
