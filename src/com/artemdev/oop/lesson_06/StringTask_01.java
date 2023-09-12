package com.artemdev.oop.lesson_06;

// Заменить все грустные смайлы в строке на веселые;

public class StringTask_01 {
    public static void main(String[] args) {
        String value = "smile :( smile :( smile :) smile :(";
        String result = replace(value);
        System.out.println("String before: " + value);
        System.out.println("String after :" + result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
