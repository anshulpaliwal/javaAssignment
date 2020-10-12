package com.company;

public abstract class Training {
    public  int id;
    public int fee;
    public String subject;

    public Training(int fee, String subject) {
        this.fee = fee;
        this.subject = subject;
    }
    public abstract int getOrderValue();

    public int getId() {
        return id;
    }

    public int getFee() {
        return fee;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
