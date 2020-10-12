package com.company;

public class Rectangle {
    private int length;
    private int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int area() {
        int areaValue= this.length*this.breadth;
        return areaValue;
    }
}
