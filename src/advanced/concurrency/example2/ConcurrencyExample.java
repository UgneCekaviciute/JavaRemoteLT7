package advanced.concurrency.example2;

public class ConcurrencyExample {
    public static void main(String[] args) {
        //iš esmės thread'as eina iš viršaus į apačią ir skaito eilutes po vieną
        System.out.println("Main thread starts!");
        //sukuriam objektą StopWatch
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); //kviečiame start metodą, nes jis pradės run metodą, kurį perrašėme savaip
        //programuojant paraleliai, reikia visada kurti try ir catch
        try { //metodas, kuris sustabdys thread'ą esantį main metode
            Thread.sleep(2000); //naudojamas metodas, kuris priima vieną kintamąjį
            System.out.println("Main thread is still running");
            //sistema sustos ir atspausdins tekstą tik po 2, kitas tekstas po 3 sekundžių
            Thread.sleep(3000);
            System.out.println("Main thread ends :/ ");
        } catch (InterruptedException e){ //parašomas klaidos pranešimas (jei metodas nesuveiktų)
            System.out.println("Thread was interrupted on sleep");
        }
    } //paleidus programą, vienu metu veiks ir main thread ir stopwatch thread klasės
}
