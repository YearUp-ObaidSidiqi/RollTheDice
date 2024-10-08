package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create the two instances of Dice object
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        // Declaration and initialization of counters
        int counters2 = 0;
        int counters4 = 0;
        int counters6 = 0;
        int counters7 = 0;

        // Loop 100 times
        for (int i = 0; i < 100; i++) {
            // Roll the dice for each iteration
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();
            int sumOfDice = roll1 + roll2;

            // Print each roll
            System.out.println("Roll #" + i + ": " + roll1 + " - " + roll2 + " Sum: " + sumOfDice);

            // Switch statement to count the number of occurrences of 2, 4, 6, and 7
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
        }

        // Print out the results after the loop
        System.out.println("-----------Results of 100 Rolls-----------");
        System.out.println("2 appeared: " + counters2 + " times");
        System.out.println("4 appeared: " + counters4 + " times");
        System.out.println("6 appeared: " + counters6 + " times");
        System.out.println("7 appeared: " + counters7 + " times");
    }
}
