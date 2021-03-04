package de.telran;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class TimeCounter {
    public static void main(String[] args) {

        //Создать LocalDate своего рождения.
        LocalDate myBirthday = LocalDate.of(1981, 10, 21);
        System.out.println("date of my Birth is :  " + myBirthday);

        //Вывести день в году.
        LocalDate date = LocalDate.now();
        int dayPerYear = date.getDayOfYear();
        System.out.println("day of the year is : " + dayPerYear);

        //Вывести день недели.
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("day of week is : " + dayOfWeek);

        //Создать LocalDate своего др. в текущем году.
        LocalDate myBirthdayThisYear = LocalDate.parse("1981-10-21");
        LocalDate result = myBirthdayThisYear.withYear(2021);
        System.out.println("The date my birthday with this year is : " + result);

        //Создать сегодняшний день и сравнить, что раньше, ваш др или сегодня, и на сколько дней.
        LocalDate today = LocalDate.now();
        LocalDate myBirthdayInThisYear = LocalDate.of(2021,10,21);
        long numberDaysBetweenMyBirthdayAndToday = DAYS.between(today,myBirthdayInThisYear);
        System.out.println("Earlier today than my birthday: " + numberDaysBetweenMyBirthdayAndToday +" Days");

        //Посчитать, сколько дней осталось до нового года.
        LocalDate thisYear = LocalDate.of(2020, 03, 03);
        LocalDate newYear = LocalDate.of(2020, 12, 31);
        System.out.println(DAYS.between(thisYear, newYear));

    }
}
