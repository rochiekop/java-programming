package pzn.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        Calendar calendar = Calendar.getInstance();

        /**
         * Calendar Manipulation
         *
         */

        calendar.add(Calendar.YEAR,-10);
        calendar.set(Calendar.YEAR,2026);
        calendar.set(Calendar.DATE,20);
        calendar.set(Calendar.MONTH,Calendar.AUGUST);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
