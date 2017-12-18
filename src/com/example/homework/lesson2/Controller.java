package com.example.homework.lesson2;

import com.example.homework.lesson2.award.Award;
import com.example.homework.lesson2.person.Nominator;
import com.example.homework.lesson2.person.Nominee;

public class Controller {
    public static void main(Object args){
       Award popularAward = new Award("Call out!", 50, "USD");
       Award modestAward = new Award("Thank you!", 0, "");
       Award wantedAward = new Award("Super Star!", 500, "EUR");

       Nominee person1 = new Nominee ("Arya", "Stark");
       Nominee person2 = new Nominee ("John", "Snow");
       Nominee person3 = new Nominee ("Daenerys", "Targaryen");

       Nominator person4 = new Nominator("Sansa", "Stark");
       Nominator person5 = new Nominator("Cersei", "Lannister");

       person4.nominate(person2, popularAward);
       person5.nominate(person1, modestAward);
       person4.nominate(person3, wantedAward);
    }
}
