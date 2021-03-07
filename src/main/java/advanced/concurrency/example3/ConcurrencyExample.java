package advanced.concurrency.example3;

public class ConcurrencyExample {
    public static void main(String[] args) {
        //iš esmės thread'as eina iš viršaus į apačią ir skaito eilutes po vieną
        System.out.println("Main thread starts!");
        //sukuriam 2 StopWatch klasės objektus sw1 ir sw2
        advanced.concurrency.example3.StopWatch sw1 = new advanced.concurrency.example3.StopWatch("SW1");
        advanced.concurrency.example3.StopWatch sw2 = new StopWatch("SW2");

        sw1.start(); //pradedam objekto sw1 ciklą iš StopWatch klasės

        try { //metodas, kuris sustabdys thread'ą esantį main metode
            Thread.sleep(2000); //naudojamas metodas, kuris priima vieną kintamąjį
            sw2.start(); //pradedam objekto sw2 ciklą iš StopWatch klasės (prasidės po sekundės)
            System.out.println("Main thread is still running");
            //sistema sustos ir atspausdins tekstą tik po 2, kitą tekstą po 3 sekundžių
            Thread.sleep(3000);
            System.out.println("Main thread ends :/ ");
        } catch (InterruptedException e){ //parašomas klaidos pranešimas (jei metodas nesuveiktų)
            System.out.println("Thread was interrupted on sleep");
        }
    } //paleidus programą, vienu metu veiks ir main thread metodas ir stopwatch thread klasės 2 metodai
} //aplikacija baigia darbą, kai visi thread'ai baigti
