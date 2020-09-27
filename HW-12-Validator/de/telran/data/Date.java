package de.telran.data;

import de.telran.data.Validator;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        if (!Validator.validateDate(day, year, month)){ //Call to a static method validateDate of Validator class
            System.out.println("Date was not validated");
        } else {
            System.out.println("Date was validated");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getDate() {
        return this.year + " "+this.month + " "+this.day;
    }
}
