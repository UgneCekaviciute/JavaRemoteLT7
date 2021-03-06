package advanced.concurrency.example4;

public class Bench {
    //kuriamas kintamasis availableSeats
    private int availableSeats;
    //kuriamas jo konstruktorius
    //spaudžiam dpk, generate
    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    //sukuriamas metodas, kuris kai bus iškviečiamas kontruktorius
    //availableSeats sumažins reikšmę vienetu
    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat"); //duodam vietą
            availableSeats--; //sumažinam vienu laisvų vietų skaičių
            System.out.println("Available seats: " + availableSeats);//atspausdinam kiek yra laisvų vietų
        } else {
            System.out.println("There are no seats available :/ ");
        }
    }
    public synchronized void takeASeatSync() {
        if (availableSeats > 0) {
            System.out.println("Take a seat"); //duodam vietą
            availableSeats--; //sumažinam vienu laisvų vietų skaičių
            System.out.println("Available seats: " + availableSeats);//atspausdinam kiek yra laisvų vietų
        } else {
            System.out.println("There are no seats available :/ ");
        }
    }
    public void takeASeatSyncBlock() {
        System.out.println("Unsynced part!");
        //sinchronizuojam tik if bloką (sąlygos kodą)
        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Take a seat"); //duodam vietą
                availableSeats--; //sumažinam vienu laisvų vietų skaičių
                System.out.println("Available seats: " + availableSeats);//atspausdinam kiek yra laisvų vietų
            } else {
                System.out.println("There are no seats available :/ ");
            }
        }
    }
}
