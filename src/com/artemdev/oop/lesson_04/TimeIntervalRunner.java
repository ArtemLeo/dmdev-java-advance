package com.artemdev.oop.lesson_04;

/*
   Создать класс, описывающий промежуток времени.
   Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
   Создать метод для получения полного количества секунд в объекте.
   Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
   Создать метод для вывода данных.
 */

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = createTimeInterval();


        TimeInterval timeInterval2 = new TimeInterval(timeInterval1.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());

        timeInterval1.showInfo();
        timeInterval2.showInfo();

        TimeInterval sumIntervals = timeInterval1.sum(timeInterval2);
        sumIntervals.showInfo();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval1 = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval1.totalSeconds());
        return timeInterval1;
    }
}
