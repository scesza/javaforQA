package com.example.homework.lesson2;

import com.example.homework.lesson2.award.Award;
import com.example.homework.lesson2.person.Nominator;
import com.example.homework.lesson2.person.Nominee;

public class MainContoroller {
    public static void main(String[] args) {
       System.out.println(args.length);
       Award popularAward = new Award("Call out!", 50, "USD");
       Award modestAward = new Award("Thank you!", 0, "");
       Award wantedAward = new Award("Super Star!", 500, "EUR");

       Award smallAward = new Award("Super Star!", 500, "EUR", 0.25);

       Nominee person1 = new Nominee ("Arya", "Stark");
       Nominee person2 = new Nominee ("John", "Snow");
       Nominee person3 = new Nominee ("Daenerys", "Targaryen");

       Nominator person4 = new Nominator("Sansa", "Stark");
       Nominator person5 = new Nominator("Cersei", "Lannister");

       person4.nominate(person2, smallAward);
       person5.nominate(person1, modestAward);
       person4.nominate(person3, wantedAward);
    }
}
