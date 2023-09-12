package com.artemdev.oop.lesson_06;

/*
   Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы (Ф.И.О.)
   Входные данные могут быть в любом регистре, а результирующая строка - в верхнем.
 */

public class StringTask_03 {
    public static void main(String[] args) {
        String firstName = "andrey";
        String lastName = "Andreev";
        String patronymicName = "Andreevich";

        String result = displayUppercaseLetters(firstName, lastName, patronymicName);
        System.out.println(result);

        String result2 = displayUppercaseLetters2(firstName, lastName, patronymicName);
        System.out.println(result2);
    }

    private static String displayUppercaseLetters2(String firstName, String lastName, String patronymicName) {
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
        return String.format("%s.%s.%s.", firstNameChar, lastNameChar, patronymicNameChar);
    }

    private static String displayUppercaseLetters(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = firstName.toUpperCase().charAt(0);
        char patronymicNameChar = firstName.toUpperCase().charAt(0);
        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
    }
}
