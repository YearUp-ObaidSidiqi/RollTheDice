package com.pluralsight;

public  class Dice {



   public  int roll(){
       int maxValue =7;
       int minValue=1;

        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;
    }

}
