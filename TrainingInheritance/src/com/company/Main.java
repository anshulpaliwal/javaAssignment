package com.company;

public class Main {

    public static void main(String[] args) {
        PublicTraining publicProgram= new PublicTraining(5000,"Java",50);
        int costOfPublicTraining= publicProgram.getOrderValue();
        System.out.println("Cost of public training= " + costOfPublicTraining);
        CorporateTraining corporateProgram= new CorporateTraining(35000,"Big Data",4);
        int costOfCorporateTraining= corporateProgram.getOrderValue();
        System.out.println("Cost of corporate training= " + costOfCorporateTraining);
	}
}
