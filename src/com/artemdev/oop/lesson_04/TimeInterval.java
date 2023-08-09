package com.artemdev.oop.lesson_04;

public class TimeInterval {
    private final int seconds;
    private final int minutes;
    private final int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    public TimeInterval sum(TimeInterval seconds) {
        return new TimeInterval(totalSeconds() + seconds.totalSeconds());
    }

    public void showInfo() {
        System.out.println("Hours: " + hours + ", Minutes: " + minutes + ", Seconds: " + seconds);
    }
}
