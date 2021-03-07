package advanced.concurrency.example4;

public class SeatTakerThread extends Thread{
    //turime paveldėti Thread klasę
    //nurodom, kad klasė turės Bench tipo atributą
    private Bench bench;

    //sugeneruojam konstruktorių Alt+insert arba dpk, generate, constructor

    public SeatTakerThread(Bench bench) {
        this.bench = bench;
    }
    //perrašom run metodą dpk, generate, override
    @Override
    public void run() {
 //       bench.takeASeat(); //run metode kviesime bench.takeASeat metodą
 //       bench.takeASeatSync();
        bench.takeASeatSyncBlock();
    }
}
