package com.company;

public class Main {

    public static void main(String[] args) {
        Distance d1= new Distance();
        d1.set(1,24);
        Distance d2= new Distance();
        d2.set(2,12);
        Distance d3= d1.add(d2);
        d3.display();
    }
}
