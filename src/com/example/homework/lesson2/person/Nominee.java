package com.example.homework.lesson2.person;
import com.example.homework.lesson2.award.Award;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nominee {
    private String firstName;
    private String lastName;
    private List<Award> awards = new ArrayList<>();

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

    public void receiveAward(Award awardInstance) {
        int originalAwardValue = awardInstance.getAwardValue();
        Double soliCoefficient = awardInstance.getAwardSoli();
        String valueMessage = originalAwardValue + " (no soli applied)";

        if (soliCoefficient != null) {
            double updatedAwardValue = originalAwardValue*soliCoefficient;
            double saldo = -(1 - soliCoefficient)*100;
            valueMessage = updatedAwardValue + " (soli " + awardInstance.getAwardSoli() +
                    " applied, initial award value was " + originalAwardValue + ", value changed on " + saldo + "%)";

        }

        System.out.println(awardInstance.getAwardName() + " award " + awardInstance.getAwardCurrency() +
                " " + valueMessage);

        //populate awardsList
        addToAwardsList(awardInstance);
    }

    private void addToAwardsList(Award awardInstance) {
        this.awards.add(awardInstance);
    }

    public List<Award> getAwardsList() {
        return awards;
    }

    //count number awards without soli
    public int getAwardsPopulation() {
        int population = 0;
        for (Award currentAward : getAwardsList()) {
            if (currentAward.getAwardSoli() == null) {
                population++ ;
            }
        }

        return population;
    }

    public void printAwardsQuantity () {
        for (Award currentAward : getAwardsList()) {
            if ( currentAward.getAwardSoli() == null ) {
                System.out.println(countQuantity(currentAward));
            }
        }
    }

    public double countQuantity(Award receivedAward) {
        Random randomGenerator = new Random(100);
        double C = randomGenerator.nextDouble();
        int population =  getAwardsPopulation();
        int Z = randomGenerator.nextInt(100);
        int P = receivedAward.getAwardValue();

        double part1 = (Math.pow(Z,2)*(P)*(1 - P))/(Math.pow(C,2));
        double part2 =  1 + ((part1 - 1)/population);
        double quantity = part1/part2;

        return quantity;
    }


}
