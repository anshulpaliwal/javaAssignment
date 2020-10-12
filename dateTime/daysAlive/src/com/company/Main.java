package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1997, Month.JUNE, 9);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        long aliveDays = ChronoUnit.DAYS.between(birthDate, currentDate);
        System.out.println(aliveDays);
    }
}

