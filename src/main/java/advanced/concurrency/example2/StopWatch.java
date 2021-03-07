package advanced.concurrency.example2;
//thread klasę galima paveldėti
public class StopWatch extends Thread {
    //sukuriame metodą run:
    @Override
    public void run() { //Šis metodas perrašytas, nes egzistuoja Thread klasėje
        //sukuriame for ciklą, kuris bus sukamas 10 iteracijų
        for (int i = 0; i < 10; i++){
            System.out.println("Stop watch: " + i); //ciklas bus sukamas 10 sekundžių
            //sustabdome kiekvieną iteraciją sekundei parašom thread.sleep
            try { //ir paspaudžiam per lemputę surround with try/catch
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
