package ru.vsu.cs;

public class TimeUtils {

    // сравнение по количеству прошедшего времени в секундах
    public static int compare(Time time1, Time time2) {
        if (time1.getSeconds() > time2.getSeconds()) {
            return 1;
        }
        if (time1.getSeconds() < time2.getSeconds()) {
            return -1;
        }
        return 0;
    }


    public static String castToString(Time time) {
        int value = time.getSeconds();

        int hours = value / 3600 % 24;
        int minutes = value % 3600 / 60;
        int seconds = value % 3600 % 60;

        String hoursRepresentation = format(hours);
        String minutesRepresentation = format(minutes);
        String secondsRepresentation = format(seconds);

        return hoursRepresentation + ":" + minutesRepresentation + ":" + secondsRepresentation;
    }

    private static String format(int value) {
        if (value < 10) {
            return String.valueOf(0) + value;
        }
        return String.valueOf(value);
    }

    public static Time parse(String time) {

        String[] timeValues = time.split(":");
        int[] timeNumberValues = new int[3];

        for (int i = 0; i < 3; i++) {
            timeNumberValues[i] = Integer.parseInt(timeValues[i]);
        }

        int hours = timeNumberValues[0];
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException();
        }

        int minutes = timeNumberValues[1];
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException();
        }

        int seconds = timeNumberValues[2];
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException();
        }

        int value = hours * 3600 + minutes * 60 + seconds;
        return new Time(value);
    }

    public static void addHour(Time time, int hour){
        int currentValue = time.getSeconds();
        int newValue = currentValue + 3600 * hour;
        time.setSeconds(newValue);
    }

    public static void addMinutes(Time time, int minutes){
        int currentValue = time.getSeconds();
        int newValue = currentValue + 60 * minutes;
        time.setSeconds(newValue);
    }

    public static void addSeconds(Time time, int seconds){
        int currentValue = time.getSeconds();
        int newValue = currentValue + seconds;
        time.setSeconds(newValue);
    }

    public static void addTime(Time time1, Time time2){
        int currentValue = time1.getSeconds();
        int newValue = currentValue + time2.getSeconds();
        time1.setSeconds(newValue);
    }

    public static void subtractHour(Time time, int hour){
        int currentValue = time.getSeconds();
        int newValue = currentValue - 3600 * hour;
        time.setSeconds(newValue);
    }

    public static void subtractMinutes(Time time, int minutes){
        int currentValue = time.getSeconds();
        int newValue = currentValue - 60 * minutes;
        time.setSeconds(newValue);
    }

    public static void subtractSeconds(Time time, int seconds){
        int currentValue = time.getSeconds();
        int newValue = currentValue - seconds;
        time.setSeconds(newValue);
    }

    public static void subtractTime(Time time1, Time time2){
        int currentValue = time1.getSeconds();
        int newValue = currentValue - time2.getSeconds();
        time1.setSeconds(newValue);
    }
}
