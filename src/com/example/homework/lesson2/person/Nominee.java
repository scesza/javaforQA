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
        int originalAwardValue = awardInstance.getAwardValue();
        double soliCoeficient = awardInstance.getAwardSoli();
        String valueMessage;
        if (soliCoeficient != 0) {
            double updatedAwardValue = originalAwardValue*soliCoeficient;
            double saldo = -(1 - soliCoeficient)*100;
            valueMessage = updatedAwardValue + " (soli " + awardInstance.getAwardSoli() +
                    " applied, initial award value was " + originalAwardValue + ", value changed on " + saldo + "%)";

        } else {
            valueMessage = originalAwardValue + " (no soli applied)";
        }
        System.out.println(awardInstance.getAwardName() + " award " + awardInstance.getAwardCurrency() +
                " " + valueMessage);
    }
}
