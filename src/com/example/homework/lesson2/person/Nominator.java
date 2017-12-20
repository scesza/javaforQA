package com.example.homework.lesson2.person;
import com.example.homework.lesson2.award.Award;

public class Nominator {
        private String firstName;
        private String lastName;

        public Nominator(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void nominate(Nominee nominee, Award award) {
            System.out.println(nominee.getFirstName() + " " + nominee.getLastName() + " received ");
            nominee.receiveAward(award);
        }
}
