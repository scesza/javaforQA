package com.example.homework.lesson2;

import com.example.homework.lesson2.award.Award;
import com.example.homework.lesson2.person.Nominator;
import com.example.homework.lesson2.person.Nominee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainContoroller {
    public static void main(String[] args) {

       Award popularAward = new Award("Call out!", 50, "USD");
       Award modestAward = new Award("Thank you!", 20, "");
       Award wantedAward = new Award("Super Star!", 1000, "EUR");

       Award smallAward = new Award("Star!", 500, "EUR", 0.25);
       Award winnersAward = new Award("Rock Babe!", 500, "EUR", 2.25);

       Nominee person1 = new Nominee ("Arya", "Stark");
       Nominee person2 = new Nominee ("John", "Snow");
       Nominee person3 = new Nominee ("Daenerys", "Targaryen");

       Nominator person4 = new Nominator("Sansa", "Stark");
       Nominator person5 = new Nominator("Cersei", "Lannister");

       person4.nominate(person1, smallAward);
       person4.nominate(person1, popularAward);
       person5.nominate(person1, winnersAward);

       person5.nominate(person2, winnersAward);
       person4.nominate(person2, smallAward);
       person4.nominate(person2, modestAward);

       person5.nominate(person3, winnersAward);
       person4.nominate(person3, wantedAward);
       person4.nominate(person3, popularAward);

       //count quantity for each award without soli
       person1.mapAwardsQuantity();
       person2.mapAwardsQuantity();
       person3.mapAwardsQuantity();

       System.out.println(person1.hashMap.get(smallAward.getAwardName()));
       Double person1Awrd1Q = person1.hashMap.get(smallAward.getAwardName());
       System.out.println(person2.hashMap.get(modestAward.getAwardName()));
       Double person2Awrd1Q = person2.hashMap.get(modestAward.getAwardName());
            //операцию(>, >=, ==, !=, <=, <, &&, ||,!). С комментарием что именно вы хотите отобразить и валидным
       if (person1Awrd1Q == null) {
           System.out.println(person1.getFirstName() + "'s" + " award " + smallAward.getAwardName() + " has soli ");
       } else {
           if (person1Awrd1Q >= 2) {
               System.out.println(person1.getFirstName() + "'s" + " award " + smallAward.getAwardName() +
                       " is not the only he received without soli");
           }
           if (person1Awrd1Q > 1 && person1Awrd1Q < 2) {
               System.out.println(person1.getFirstName() + "'s" + " award " + smallAward.getAwardName() +
                       "the only one he received without soli" + " and has quantity = " + person1Awrd1Q);
           }
       }

       if (person2Awrd1Q != 0 || !(person2Awrd1Q <= 0)) {
           System.out.println(person2.getFirstName() + "'s" + " award " + modestAward.getAwardName() +
                   " has quantity = " + person2Awrd1Q);
       }
    }
}
