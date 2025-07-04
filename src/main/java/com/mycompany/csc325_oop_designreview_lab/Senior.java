package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    // This sets up a Senior using the Student's constructor
    public Senior(String name, short age, int credits) {
        super(name, age, credits);

        // This is to make sure the senior has at least 85 credits
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
    }

    // This is the Override toString to show Senior info
    @Override
    public String toString() {
        return "Senior{name=" + getName() + ", age=" + getAge() +
                ", GPA=" + getGpa() + ", credits=" + getCredits() + "}";
    }
}
