package Lesson21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDate futureDate = localDate.plusDays(447);
        System.out.println(futureDate);

        LocalDate next = LocalDate.of(2019, 10, 14);
        System.out.println(next.isAfter(localDate));

        String RuTime = localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("RU")));
        System.out.println(RuTime);

        String cambodiaTime = localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("Cambodia")));
        System.out.println(cambodiaTime);

    }
}
