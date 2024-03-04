package az.edu.turing.module02.lesson10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeApp {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalDate.ofEpochDay(0));
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(ZoneId.of("UTC+04"));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().plusMinutes(15));

        System.out.println(LocalDateTime.now());
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-03-04T20:11");
        System.out.println(parsedDateTime);

        System.out.println(parsedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(parsedDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(parsedDateTime.format(DateTimeFormatter.ofPattern("dd+++MM---yyyy===HH::mm;;ss")));

        System.out.println("====");
        LocalDate date = LocalDate.of(2024, 2, 27);
        System.out.println(date);
        System.out.println(date.plusDays(2));
        System.out.println(date.plusDays(3));

        LocalDate date2 = LocalDate.of(2023, 2, 27);
        System.out.println(date2);
        System.out.println(date2.plusDays(2));
        System.out.println(date2.plusDays(3));

        LocalDate now = LocalDate.now();
        LocalDate start = LocalDate.parse("07-01-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        long epochDayNow = now.toEpochDay();
        long startEpochDay = start.toEpochDay();
        long diff = epochDayNow - startEpochDay;
        System.out.println(LocalDate.ofEpochDay(diff));

        System.out.println(new Date());
        Date date1 = new Date(); //pis date
        date1.setTime(21);
        System.out.println(date1);
    }
}
