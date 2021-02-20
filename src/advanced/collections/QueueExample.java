package advanced.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        //įdedam reikšmes į eilę, naudodami žodį offer
        pokemons.offer("Charmander");
        pokemons.offer("Pikachu");

        //pažiūrime kuris elementas yra pirmas, naudojant .peek()
        System.out.println(pokemons.peek());
        //išimamas elementas iš eilės naudojant .poll()
        //System.out.println(pokemons.poll()); //išima ir atspausdina ką išima,
        // galima ir nespausdint, tada nerašom sout
        pokemons.poll();
        System.out.println(pokemons.peek());
    }
}
