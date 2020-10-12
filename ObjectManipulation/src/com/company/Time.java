package com.company;

public class Time {
    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setTime(int hours,int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    public void showTime() {
        System.out.println(hours + "hours and " + minutes + "minutes");
    }
    public Time sum(Time time) {

        Time newTime= new Time();
        newTime.hours= this.hours + time.hours;
        newTime.minutes= this.minutes + time.minutes;
        while(newTime.minutes>= 60){
            newTime.minutes= newTime.minutes - 60;
            newTime.hours++;
        }
        return newTime;
    }
}
