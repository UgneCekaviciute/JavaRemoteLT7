package advanced.inheritance.animal_example;

public class Dog extends Animal{
    //sukuriami trys kintamieji
    private String breed;
    //private String voice;
    //private boolean mammal; //nereikia, nes sukūrėm tėvinę klasę
    //sukuriamas konstruktorius
    public Dog (String breed, String voice, boolean mammal){
        super (voice, mammal);
        this.breed = breed;
        //this.voice = voice; nereikalingi, nes sukūrėm tėvinę klasę Animal
        //this.mammal = mammal; nereikalingi, nes sukūrėm tėvinę klasę Animal
    }

    @Override
    public String yieldVoice() {
        return "Dog voice: " + voice;
    }
}
