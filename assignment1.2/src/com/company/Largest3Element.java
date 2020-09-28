package com.company;

public class Largest3Element {
    public static void sortArray(int arr[],int n) {
        for(int i=0;i<n;i++) {
            for(int j=0 ; j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[9]);
        System.out.println(arr[8]);
        System.out.println(arr[7]);
    }

}
