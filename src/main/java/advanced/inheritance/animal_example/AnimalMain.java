package advanced.inheritance.animal_example;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat("ginger", "miau", true);
        Dog dog = new Dog("doberman", "whoof", true);

        String catVoice = cat.yieldVoice(); //galima sukurti kintamąjį,
        //kuris paims metodo reikšmę iš klasės Cat
        System.out.println(catVoice);
        System.out.println(dog.yieldVoice());
    }
}
