package com.artemdev.oop.lesson_02;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.load();
        computer1.printState();

        Computer computer2 = new Computer(1050);
        computer2.printState();

        Computer computer3 = new Computer(10000, 10000);
        computer3.load(true);
        computer3.printState();
    }
}
