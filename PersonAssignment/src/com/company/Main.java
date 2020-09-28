package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ram",5,6,1980);
        person1.display();
        Person person2 = new Person("Shyam",2,3,1987);
        person2.display();
        System.out.println(person1.olderOne(person2));
    }
}
