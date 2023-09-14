package java8;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class LocalDateDemo {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
        System.out.println(dateTimeFormatter.format(localDate1));
        System.out.println(localDate1.plusDays(4));
        System.out.println(localDate1.minusDays(2));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getNano());

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        System.out.println(zoneId);
        LocalDate localDate2 = LocalDate.now(zoneId);
        System.out.println(localDate2);

        LocalTime localTime1 = LocalTime.now(zoneId);
        System.out.println(localTime1);

        LocalDate localDate3 = LocalDate.of(2000,9,21);
        LocalDate localDate4 = LocalDate.of(2000,9,1);

       Period duration = Period.between(localDate3,localDate4);
        System.out.println(duration);

        LocalTime localTime2 = LocalTime.of(14,2,4);
        LocalTime localTime3 = LocalTime.of(14,23,4);
        Duration period = Duration.between(localTime2,localTime3);
        System.out.println(period);

    }
}
//Spring
//ioc
//dependencies
