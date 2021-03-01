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

        Time time8 = TimeUtils.parse("10:00:25");
        System.out.println(time8);
        System.out.println(TimeUtils.castToString(time8));

        Time time9 = TimeUtils.parse("20:00:25");
        System.out.println(time9);

        System.out.println(TimeUtils.castToString(time0));
        System.out.println(TimeUtils.castToString(time1));
        System.out.println(TimeUtils.castToString(time2));
        System.out.println(TimeUtils.castToString(time3));
        System.out.println(TimeUtils.castToString(time4));
        System.out.println(TimeUtils.castToString(time5));
        System.out.println(TimeUtils.castToString(time6));
        System.out.println(TimeUtils.castToString(time7));

        System.out.println("Demonstration of how actions work with time :");

        System.out.println(time1.isEqualsThen(time0));
        System.out.println(time2.isGreatherThen(time0));
        System.out.println(time2.isLessThen(time0));

        System.out.println(TimeUtils.compare(time1, time2));

        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.addHour(time1, 5);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.addMinutes(time1, 30);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.addSeconds(time1, 10);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.addTime(time1, time0);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.subtractHour(time1, 5);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.subtractMinutes(time1, 30);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.subtractSeconds(time1, 10);
        System.out.println(TimeUtils.castToString(time1));

        TimeUtils.subtractTime(time1, time0);
        System.out.println(TimeUtils.castToString(time1));
    }
}
