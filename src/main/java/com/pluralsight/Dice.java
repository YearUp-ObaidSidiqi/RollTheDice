package com.pluralsight;

public  class Dice {



   public  int roll(){
       int maxValue =7;
       int minValue=1;

       return (int)(Math.random() * maxValue) + minValue;
    }

}
