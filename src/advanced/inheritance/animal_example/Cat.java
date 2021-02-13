package advanced.inheritance.animal_example;

public class Cat extends Animal{
    //sukuriami trys kintamieji
    private String color;
    //private String voice; //nebereikalinga, nes sukūrėm tėvinę klasę Animal
    //private boolean mammal;
    //sukuriamas konstruktorius
    public Cat (String color, String voice, boolean mammal){
        super(voice, mammal);
        this.color = color;
        //this.voice = voice; nereikia, nes sukurta abstrakti tėvinė klasė Animal
        //this.mammal = mammal; ir įdėta su žodžiu extends
    }

    @Override
    public String yieldVoice() {
        return "Cat voice: " + voice;
    }
}
