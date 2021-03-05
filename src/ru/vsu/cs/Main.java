package ru.vsu.cs;

public class Main {

    public static void main(String[] args) {

        Time time0 = new Time(3600);
        Time time1 = new Time(3600);
        Time time2 = new Time();
        Time time3 = new Time("15");
        Time time4 = new Time(72);
        Time time5 = new Time(7227);
        Time time6 = new Time(72061);
        Time time7 = new Time(100000000);

        Time time8 = Time.parse("10:00:25");
        System.out.println(time8);
        System.out.println(Time.castToString(time8));

        Time time9 = Time.parse("20:00:25");
        System.out.println(time9);

        System.out.println(Time.castToString(time0));
        System.out.println(Time.castToString(time1));
        System.out.println(Time.castToString(time2));
        System.out.println(Time.castToString(time3));
        System.out.println(Time.castToString(time4));
        System.out.println(Time.castToString(time5));
        System.out.println(Time.castToString(time6));
        System.out.println(Time.castToString(time7));

        System.out.println("Demonstration of how actions work with time :");

        System.out.println(time1.isEqualsThen(time0));
        System.out.println(time2.isGreatherThen(time0));
        System.out.println(time2.isLessThen(time0));

        System.out.println(Time.compare(time1, time2));

        System.out.println(Time.castToString(time1));

        Time.addHour(time1, 5);
        System.out.println(Time.castToString(time1));

        Time.addMinutes(time1, 30);
        System.out.println(Time.castToString(time1));

        Time.addSeconds(time1, 10);
        System.out.println(Time.castToString(time1));

        Time.addTime(time1, time0);
        System.out.println(Time.castToString(time1));

        Time.subtractHour(time1, 5);
        System.out.println(Time.castToString(time1));

        Time.subtractMinutes(time1, 30);
        System.out.println(Time.castToString(time1));

        Time.subtractSeconds(time1, 10);
        System.out.println(Time.castToString(time1));

        Time.subtractTime(time1, time0);
        System.out.println(Time.castToString(time1));
    }
}
