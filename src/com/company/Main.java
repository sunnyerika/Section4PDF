package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Converter conF2C = new Converter();
        conF2C.fahrenheitToCelsius(32.0);

        System.out.println();

        Hypo hypo = new Hypo();
        hypo.hypothenuse(2, 3);

        System.out.println();

        Dice dice = new Dice();
        dice.roll();
    }
}
