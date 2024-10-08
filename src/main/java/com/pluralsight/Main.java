package com.pluralsight;

public class Main {
    public static void main(String[] args) {
//       create the two instance of Dice object
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        int roll1;
        int roll2;
//        declaration and initialization
        int counters2 = 0;
        int counters4 = 0;
        int counters6 = 0;
        int counters7 = 0;

        roll1 = dice1.roll();
        roll2 = dice2.roll();

//        loop 100 times
        for (int i = 0; i < 100; i++) {

            int sumOfDice = roll1 + roll2;

            System.out.println("Roll #" + i + ":  " + dice1.roll() + "  -  " + dice2.roll() + "   Sum:  " + sumOfDice);

//          Switch Statement
            switch (sumOfDice) {
                case 2:
                    counters2++;
                    break;

                case 4:
                    counters4++;
                    break;
                case 6:
                    counters6++;
                    break;
                case 7:
                    counters7++;
                    break;
            }

//        print out the result
            System.out.println("-----------Results of 100 ROllS-----------");
            System.out.println("2 appeared: " +counters2 + " times");
            System.out.println("4 appeared: "+counters4 + " times");
            System.out.println("6 appeared: "+counters6 + " times");
            System.out.println("7 appeared: "+counters7 + " times");


        }

    }
}