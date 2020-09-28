package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        int array[] =  new int[10];
        for(int i=0;i<10;i++) {
            array[i] =sc.nextInt();
        }
        int missingValue = findValue(array);
        System.out.println("missing value :"+ missingValue);
    }

    private static int findValue(int[] array) {
        int total =0;
        for(int i=0;i<10;i++) {
            total+=array[i];
        }
        int answer = 66 - total;
        return answer;
    }
}
