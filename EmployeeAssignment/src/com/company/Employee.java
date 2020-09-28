package com.company;

public class Employee {
    private int id;
    private String name;
    private int monthlyBasic;

    public Employee(int id, String name, int monthlyBasic) {
        super();
        this.id = id;
        this.name = name;
        this.monthlyBasic = monthlyBasic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMonthlyBasic() {
        return monthlyBasic;
    }

    public int getAnnualBasic() {
        int annualBasic = 12 * getMonthlyBasic();
        return annualBasic;
    }

    public int getMonthlyGrossSalary() {
        int monthlyGrossSalary = (3*getMonthlyBasic())/2 + 2050;
        return monthlyGrossSalary;
    }

    public int getAnnualGrossSalary() {
        int annualGrossSalary= 12 * getMonthlyGrossSalary();
        return annualGrossSalary;
    }

    public int getMonthlyDeductions() {
        float pf = 6500;
        if((10*getMonthlyBasic()/100) < pf )
            pf = (10*getMonthlyBasic()/100);
        float esic = 0;
        if(getMonthlyBasic() <= 5000)
            esic = ((4.75f*getMonthlyBasic()/100));
        int profTax = 100;
        if(getMonthlyGrossSalary() <= 10000)
            profTax=50;
        int monthlyDeductions = (int)(pf + esic + profTax);
        return monthlyDeductions;
    }

    public int getMonthlyTakeHome() {
        int monthlyTakeHome= getMonthlyGrossSalary() - getMonthlyDeductions();
        return monthlyTakeHome;
    }

    public int getAnnualTakeHome() {
        int annualTakeHome = 12 * getMonthlyTakeHome();
        return annualTakeHome;
    }

    public float setPFRate(float f) {
        return f;
    }

    public float getPFRate() {
        float PFRate = (10*getMonthlyBasic()/100);
        return PFRate;
    }
}
