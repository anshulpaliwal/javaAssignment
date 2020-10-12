package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter any integer");
        int n = scanner.nextInt();
        int newN= Rearrange.highestNumber(n);
        System.out.print(newN);
    }
}
