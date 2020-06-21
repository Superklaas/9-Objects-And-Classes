package be.vdab;

import java.util.GregorianCalendar;

public class Ex95GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.println(calendar.get(GregorianCalendar.MONTH));
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
