package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,4,5,0,0,7};
        move(array);
    }

    private static void move(int[] array) {
        int j=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]!=0) {
                array[j] = array[i];
                j++;
            }
        }
        for(int z=j;z<array.length;z++) {
            array[j++] = 0;
        }
        System.out.println("Output Array : "+ Arrays.toString(array));
    }
}
