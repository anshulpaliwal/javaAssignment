package com.company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        System.out.print(currentDate.getDayOfWeek()+", "+currentDate.getMonth()+" "+currentDate.getDayOfMonth()+", "+currentDate.getYear());
    }
}
