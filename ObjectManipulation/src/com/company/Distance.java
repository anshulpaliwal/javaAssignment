package com.company;

public class Distance {
    private int feet;
    private float inches;
    public int getFeet() {
        return feet;
    }
    public float getInches() {
        return inches;
    }

    public void set(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }
    public void display() {
        System.out.println(feet + " feet and " + inches + " inches");
    }

    public Distance add(Distance distance) {
        Distance newDistance = new Distance();
        newDistance.inches = this.inches + distance.inches;
        newDistance.feet = this.feet + distance.feet;
        while (newDistance.inches >= 12.0) {
            newDistance.inches = newDistance.inches - 12.0f;
            newDistance.feet++;
        }
        return newDistance;
    }
}
