package com.company;
import java.time.*;

public class Person {
    private String name;
    private Date DOB;

    class Date {
        private int dd;
        private int mm;
        private int yy;

        public Date(int dd, int mm, int yy) {
            super();
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        public int getDd() {
            return dd;
        }

        public int getMm() {
            return mm;
        }

        public int getYy() {
            return yy;
        }
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return DOB;
    }

    public Person(String name, int dd, int mm, int yy) {
        super();
        this.name = name;
        this.DOB = new Date(dd, mm, yy);
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Date of Birth: " + getDob().getDd() + "-" + getDob().getMm() + "-" + getDob().getYy());
        LocalDate present = LocalDate.now();
        LocalDate birthdate = LocalDate.of(getDob().getYy(), getDob().getMm(), getDob().getDd());
        Period p = Period.between(birthdate, present);

        System.out.println(p.getYears() + " Years, " + p.getMonths() + " Months, " + p.getDays() + " Days ");
    }

    public String olderOne(Person p) {
        int y= this.getDob().getYy();
        int m= this.getDob().getMm();
        int d= this.getDob().getDd();
        int pd= p.getDob().getDd();
        int pm= p.getDob().getMm();
        int py= p.getDob().getYy();
        LocalDate bday1 = LocalDate.of(y, m, d);
        LocalDate bday2 = LocalDate.of(py, pm, pd);
        Period period = Period.between(bday1, bday2);


        if (y > py) {
            return (p.getName() + " is older than " + this.getName() + " by " + period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days").toString();
        } else if (y < py) {
            return (this.getName() + " is older than " + p.getName() + " by " + period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days").toString();
        } else {
            if (m > pm) {
                return (p.getName() + " is older than " + this.getName() + " by " + period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days").toString();
            } else if (m < pm) {
                return (this.getName() + " is older than " + p.getName() + " by " + period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days").toString();
            } else {
                if (d > pd) {
                    return (p.getName() + " is older than " + this.getName() + " by " + period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days").toString();
                } else if (d < pd) {
                    return (this.getName() + " is older than " + p.getName() + " by " + period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days").toString();
                } else {
                    return "Both persons are of equal age.";
                }
            }
        }
    }
}