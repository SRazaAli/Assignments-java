
package com.mycompany.mavenproject2;

import java.time.LocalDateTime;

public class Task2 {
LocalDateTime now = LocalDateTime.now();

    private int year, day, hour, minutes, seconds;
    private String month;
    private final String[] months = {"January","February","March","April","May","June","July", "August","September","October","November","December"};

//    Constructors
    Task2() {
        year = now.getYear();
        day = now.getDayOfMonth();
        month = now.getMonth().toString();
        month = month.substring(0, 1) + month.substring(1).toLowerCase();
        hour = now.getHour();
        minutes = now.getMinute();
        seconds = now.getSecond();
    }
        // parameterized constructor for yr, month, day
    Task2(int year, int month, int day, int hour, int minutes, int seconds) {
         this.year = year;
        this.month = months[month - 1];
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    } // parameterized function for yr, month, day, hour, minute, second
    
    // Getters
    public int getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    
    // Setters
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = months[month - 1];
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minutes) {
        this.minutes = minutes;
    }
    public void setSecond(int seconds) {
        this.seconds = seconds;
    }
    
    public void print() {
        System.out.println(month + " " + day + " " + year + " " + hour + ":" + minutes + ":" + seconds);
    }
}
