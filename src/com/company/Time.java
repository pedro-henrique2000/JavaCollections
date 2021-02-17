package com.company;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if(hours > 24 || hours < 0)
            throw new IllegalArgumentException("Hour out of range");

        if(minutes > 60 || minutes < 0)
            throw new IllegalArgumentException("Minute out of range");

        if(seconds > 60 || seconds < 0)
            throw new IllegalArgumentException("Seconds out of range");

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time() {}

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d ", getHours(), getMinutes(), getSeconds());
    }
}
