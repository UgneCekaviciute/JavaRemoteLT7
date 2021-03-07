package advanced.inheritance.animal_example;

public abstract class Animal {
    protected String voice;
    protected boolean mammal;

    //sukuriamas konstruktorius su pasikartojančiomis reikšmėmis dog ir cat klasėse
    //vėliau iš cat ir dog klasių galima ištrinti tas reikšmes ir
    //paveldėti iš šios klasės nurodytas reikšmes
    public Animal (String voice, boolean mammal){
        this.voice = voice;
        this.mammal = mammal;
    }
    //sukuriam metodą, kuris parodys, ką sako gyvūnas
    public abstract String yieldVoice();

    public void printAnimal(){
        System.out.println(mammal + " " + voice);
    }
}
