package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.print("Enter the date in 8 digits format (ddmmyyyy) : ");
            Scanner scanner=new Scanner(System.in);
            String dt=scanner.nextLine();
            if(dt.length()!=8) {
                throw new Exception("Wrong input");
            }
            String formattedDate = ""+dt.charAt(0)+dt.charAt(1)+"/"+dt.charAt(2)+dt.charAt(3)+"/"+dt.charAt(4)+dt.charAt(5)+dt.charAt(6)+dt.charAt(7);
            System.out.println("Date in dd/mm/yyyy format = " + formattedDate);
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date=LocalDate.parse(formattedDate,formatter);
          System.out.println("Date in dd, month name, yyyy format : "+date.getDayOfMonth()+" "+date.getMonth()+", " + date.getYear());
        }
        catch(Exception e) {
            System.out.print(e.getMessage());
        }

    }
    }

