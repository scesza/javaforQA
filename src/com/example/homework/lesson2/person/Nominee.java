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

    public static void receiveAward(Object awardInstance){
        int value = awardInstance.getAwardValue();
        String name = awardInstance.getAwardName();
        String curr = awardInstance.getAwardCurrency();
        System.out.println(name + " award " + curr + " " + value);
    }
}
