package paskaitos_fundamentals.sacademy.local_time;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println(localTime);

        System.out.println(localTime.plusMinutes(16));
    }
}
