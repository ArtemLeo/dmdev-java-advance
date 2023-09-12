package com.artemdev.oop.lesson_06;

/*
   Написать функцию, принимающую 2-ва параметра (строку и слово), и возвращающую true,
   если строка начинается и заканчивается этим словом;
 */

public class StringTask_02 {
    public static void main(String[] args) {
        String string = "day by day";
        String word = "day";
        System.out.println(findStartAndEnd(string, word));
    }

    private static boolean findStartAndEnd(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }
}
