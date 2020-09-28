package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Enter 10 elements of array");
	    Scanner scanner= new Scanner(System.in);
	    int array[]= new int[10];
	    for(int i=0;i<10;i++)
        {
            array[i]= scanner.nextInt();
        }
	    Largest3Element.sortArray(array,10);
    }
}
