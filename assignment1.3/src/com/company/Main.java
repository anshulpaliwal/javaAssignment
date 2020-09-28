package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int array1[] = {1, 5, 10, 20, 40, 80};
        int array2[] = {6, 7, 20, 80, 100};
        int array3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> arr  = common(array1,array2,array3);
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(" "+arr.get(i));
        }
    }

    private static ArrayList<Integer> common(int[] array1, int[] array2, int[] array3) {
        ArrayList<Integer> common = new ArrayList<Integer>();
        int i=0 , j= 0 , k=0;
        while(i<array1.length && j<array2.length && k<array3.length) {
            if(array1[i]==array2[j]&&array2[j]==array3[k]) {
                int x = array1[i];
                common.add(x);
                i++;
                j++;
                k++;

            }
            else if(array1[i]<array2[j]) {
                i++;
            }
            else if(array2[j]<array3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
        return common;
    }
}
