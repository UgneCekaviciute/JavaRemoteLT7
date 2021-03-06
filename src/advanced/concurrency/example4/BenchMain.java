package advanced.concurrency.example4;

public class BenchMain {
    //pagrindinė klasė iš kurios bus vykdomas benchThread metodas
    public static void main(String[] args) {
        //sukuriam du objektus abiejų klasių ir paduodam jiems bench kintamąjį
        Bench bench = new Bench(1);

        SeatTakerThread STT1 = new SeatTakerThread(bench);
        SeatTakerThread STT2 = new SeatTakerThread(bench);
        SeatTakerThread STT3 = new SeatTakerThread(bench);
        SeatTakerThread STT4 = new SeatTakerThread(bench);
        SeatTakerThread STT5 = new SeatTakerThread(bench);
        SeatTakerThread STT6 = new SeatTakerThread(bench);

        STT1.start();
        STT2.start();
        STT3.start();
        STT4.start();
        STT5.start();
        STT6.start();
    } //kad visada būtų gaunamas teisingas atsakymas, vykdant medotus vienu metu, reikia
    //naudoti prieraša synchronized Bench klasėje prieš takeASeatSync metodą
    //ir SeatTakerThread klasėje run metode naudosime takeASeatSync metodą
} //sinchronizuoti galima ne tik metodą, bet ir tam tikras jo vietas (žr. Bench klasę)
