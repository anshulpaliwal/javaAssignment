package com.company;

public class Complex {
    private float realValue;
    private float imaginaryValue;

    public float getRealValue() {
        return realValue;
    }

    public float getImaginaryValue() {
        return imaginaryValue;
    }

    public void setRealValue(float realValue) {
        this.realValue = realValue;
    }

    public void setImaginaryValue(float imaginaryValue) {
        this.imaginaryValue = imaginaryValue;
    }

    public void display() {
        System.out.println(realValue+"+ "+ imaginaryValue+ "i");
    }
    public Complex sum(Complex c) {
        Complex sumValue = new Complex();
        sumValue.imaginaryValue = this.imaginaryValue + c.imaginaryValue;
        sumValue.realValue = this.realValue + c.realValue;
        return sumValue;
    }
}
