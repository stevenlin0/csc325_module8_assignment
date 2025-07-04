package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private double gpa;
    private String address;
    protected int credits;

    // This is the constructor that sets name, age, and credits
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // This is the GPA getter and setter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // This is the Credit getter and setter
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // This is to implement abstract method from Human
    @Override
    public String getAddress() {
        return address;
    }

    // This is to implement abstract method from Human
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{name=" + getName() + ", age=" + getAge() +
                ", GPA=" + gpa + ", credits=" + credits + "}";
    }
}
