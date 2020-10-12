package com.company;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String course;
    public Student(int rollNumber, String name, int age, String course) throws NameNotValidException , AgeNotWithinRangeException{
        super();
        if(age>=15 && age<=21) {
            this.rollNumber = rollNumber;
        }
        else {
            throw new AgeNotWithinRangeException("Age is out of range");
        }
        int f=0;
        for(int i=0;i<name.length();i++) {
            char ch = name.charAt(i);
            if((ch<'A'||ch>'Z')  && (ch<'a'||ch>'z')) {
                f =1;
            }
        }
        if(f==0) {
            this.name = name;
        }
        else {
            throw new NameNotValidException("Name is not valid");
        }

        this.age = age;
        this.course = course;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNo(int rollNo) {
        this.rollNumber = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
