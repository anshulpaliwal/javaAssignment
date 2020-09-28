package com.company;

public class Main {

    public static void main(String[] args) {
        Employee emp= new Employee(40,"Anshul Paliwal",30000);

        System.out.println("Id: "+emp.getId());
        System.out.println("Name: "+emp.getName());
        System.out.println("Monthly Basic: "+emp.getMonthlyBasic());
        System.out.println("Annual Basic: "+emp.getAnnualBasic());
        System.out.println("Monthly Gross Salary:"+emp.getMonthlyGrossSalary());
        System.out.println("Annual Gross Salary:"+emp.getAnnualGrossSalary());
        System.out.println("Monthly Deductions: "+emp.getMonthlyDeductions());
        System.out.println("Monthly Takehome: "+emp.getMonthlyTakeHome());
        System.out.println("Annual Takehome: "+emp.getAnnualTakeHome());
    }
}
