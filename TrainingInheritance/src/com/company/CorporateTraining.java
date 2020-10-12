package com.company;

public class  CorporateTraining extends Training {
    private int days;

    public CorporateTraining(int fee, String subject, int days) {
        super(fee, subject);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public int getOrderValue() {
        return fee*days;
    }
}
