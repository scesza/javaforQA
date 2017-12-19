package com.example.homework.lesson2.person;
import com.example.homework.lesson2.award.Award;

public class Nominee {
    private String firstName;
    private String lastName;

    public Nominee(String firstName, String lastName) {
        this.firstName =  firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return  firstName;
    }
    public String getLastName() {
        return  lastName;
    }

    public static void receiveAward(Award awardInstance) {
        System.out.println(awardInstance.getAwardName() + " award " + awardInstance.getAwardCurrency() +
                " " + awardInstance.getAwardValue());
    }
}
