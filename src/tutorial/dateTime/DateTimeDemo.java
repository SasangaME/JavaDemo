package tutorial.dateTime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo {
    public static void demo()
    {
        LocalDate d = LocalDate.now();
        LocalDate dt = LocalDate.of(1990, Month.APRIL, 14);
        System.out.println(d);
        System.out.println(dt);
    }
}
