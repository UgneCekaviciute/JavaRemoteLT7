package advanced.composition;

public class Room {
    //Room klasė gaunasi kaip kompozicija, nes susideda iš
    //kitų klasių objektų
    private Tv tv;
    private Bed bed;

    public Room(Tv tv, Bed bed){
        this.tv = tv;
        this.bed = bed;
    }
}
