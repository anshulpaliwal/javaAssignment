package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String string= scanner.nextLine();
        int result= FindDuplicates.findDuplicates(string);
    }

}
