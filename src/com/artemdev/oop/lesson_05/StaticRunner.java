package com.artemdev.oop.lesson_05;

import com.artemdev.oop.lesson_03.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        Computer computer1 = new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        System.out.println(Computer.getCounter());

        Class<? extends Computer> clazz1 = computer1.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        System.out.println(clazz2 == clazz1);
        System.out.println(computer1 == computer2);
    }
}
