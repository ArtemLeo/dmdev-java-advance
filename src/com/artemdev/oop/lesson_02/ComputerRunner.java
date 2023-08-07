package com.artemdev.oop.lesson_02;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.load();
        System.out.println("Ram: " + computer.ram);
        System.out.println("SSD: " + computer.ssd);
    }
}
