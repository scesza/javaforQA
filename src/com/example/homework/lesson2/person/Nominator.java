package com.example.homework.lesson2.person;
import com.example.homework.lesson2.award.Award;

public class Nominator {
        private String firstName;
        private String lastName;

        public Nominator(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Object nominate(Object nominee, Object award) {

            System.out.println(nominee.firstName + " "
                    + nominee.lastName + " received ");
            nominee.receiveAward(award);
        }
}
