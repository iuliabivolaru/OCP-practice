package ocp.practice;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by iulia on 12/3/2017.
 */
public class FormatNumbers {
    public static void main(String[] args) {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear/12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat ch = NumberFormat.getInstance(Locale.CHINA);
        System.out.println(ch.format(attendeesPerMonth));
    }
}
