package ocp.practice;

import java.time.*;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by iulia on 11/26/2017.
 */
public class DatesPractice {

    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        System.out.println(daily);
        Period period = Period.ofDays(1);
        LocalDate localDate = LocalDate.of(2016,1,4);
//        localDate.plus(daily);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.of(5,15);
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);
        System.out.println(Locale.getDefault());
    }
}

class ZooOpen {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
        printProperties(france);

    }

    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
        Properties properties = new Properties();
        rb.keySet().stream().forEach(k -> properties.put(k, rb.getString(k)));
        System.out.println(properties.getProperty("he", "1"));
    }
}
