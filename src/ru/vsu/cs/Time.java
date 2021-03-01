package ru.vsu.cs;

public class Time {

    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time() {
        seconds = 0;
    }

    public Time(String stringRepresentation) {
        try {
            int seconds = Integer.parseInt(stringRepresentation);
            this.seconds = seconds;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isGreatherThen(Time time) {
        if (getSeconds() > time.getSeconds()) {
            return true;
        }
        return false;
    }

    public boolean isLessThen(Time time) {
        if (getSeconds() < time.getSeconds()) {
            return true;
        }
        return false;
    }

    public boolean isEqualsThen(Time time) {
        if (getSeconds() == time.getSeconds()) {
            return true;
        }
        return false;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds <= 0) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "seconds=" + seconds +
                '}';
    }
}
