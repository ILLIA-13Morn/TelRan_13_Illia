package de.telran.data;

public class Validator {

    public static boolean validateDate(int day, int year, int month){
        return checkYear(year) && checkMonth(month) && checkDay(day, month, year);
    }

    public static boolean checkYear(int year) {
        if (year > 0) {
            return true;
        }
        return false;
    }


    public static boolean checkMonth(int month) {
        if (month > 0 && month <= 12) {
            return true;
        }
        return false;
    }


    public static boolean checkDay(int day, int month, int year) {
        if (month == 2){
            return checkFebruary(day, year);
        }
        else if ((day <= 30 && month % 2 == 0) || (day <= 31 && month % 2 != 0)) {
            return true;
        }
        return false;
    }


    public static boolean checkFebruary(int day, int year) {
        if (day <= 28 && !isLeapYear(year)) {
            return true;
        } else if (day <= 29 && isLeapYear(year)) {
            return true;
        }
        return false;

    }

    public static boolean isLeapYear(int year){
        if (year % 400 == 0){
            return  true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
}
