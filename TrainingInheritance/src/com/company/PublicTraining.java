package com.company;

public class PublicTraining extends Training {
    private int participants;

    public PublicTraining(int fee, String subject, int participants) {
        super(fee, subject);
        this.participants = participants;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    @Override
    public int getOrderValue() {
        return fee*participants;
    }
}
