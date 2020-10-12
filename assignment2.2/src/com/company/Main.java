package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = scanner1.nextInt();
        System.out.println("Enter the elements of array");
        String[] str= new String[size];
        for(int i=0;i<size;i++)
            str[i]=scanner2.nextLine();
        System.out.println(Facebook.likes(str));

    }
}
