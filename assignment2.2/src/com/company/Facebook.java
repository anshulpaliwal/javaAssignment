package com.company;

public class Facebook {
    public static String likes(String[] str){
        int like = str.length;
        if(like==0) {
            return "no one likes this";
        }
        else if(like==1) {
            return str[0]+" likes this";
        }
        else if(like==2) {
            return str[0] + " and "  + str[1] + " likes this";
        }
        else if(like==3) {
            return str[0] + ", "  + str[1] + " and " + str[2] + " likes this";
        }
        else {
            return str[0] + ", "  + str[1] + " and " + (like-2) + " others likes this";
        }
    }
}
