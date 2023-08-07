package com.artemdev.oop.lesson_02;

public class Computer {
    int ssd = 500;
    long ram = 0;

    public Computer() {
        System.out.println("Я был создан!");
    }

    public Computer(int ssd) {
        this.ssd = ssd;
    }

    public Computer(int ssd, long ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился!");
    }

    void load(boolean value) {
        System.out.println("Я загрузился с одним параметром!");
    }

    void printState() {
        System.out.println("SSD: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println("------------");
    }
}
