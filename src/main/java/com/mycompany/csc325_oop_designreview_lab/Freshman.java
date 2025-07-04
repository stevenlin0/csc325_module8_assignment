package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    // This sets up a Freshman using the Student's constructor
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    // This is the Override toString to provide specific output format for Freshman
    @Override
    public String toString() {
        return "Freshman{name=" + getName() + ", age=" + getAge() +
                ", GPA=" + getGpa() + ", credits=" + getCredits() + "}";
    }
}
