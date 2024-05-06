package dev.klt;

import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        WeekOfTheDay weekDay = WeekOfTheDay.FRI;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomWeekOfTheDay();
            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
        }
    }

    public static void switchDayOfTheWeek(WeekOfTheDay weekDay) {
        int weekDayInteger = weekDay.ordinal();
        switch (weekDay) {
            case
        }
    }

    public static WeekOfTheDay getRandomWeekOfTheDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = WeekOfTheDay.values();
        return allDays[randomInteger];
    }
}
