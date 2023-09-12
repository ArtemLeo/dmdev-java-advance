package com.artemdev.oop.lesson_06;

/*
   Посчитать количество всех точек, запятых и восклицательных знаков в строке.
 */

public class StringTask_04 {
    public static void main(String[] args) {
        String value = "string.,!string.,?string!";
        System.out.println(countSymbols(value));
    }

    private static int countSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
