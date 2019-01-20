package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Sunny on 1/14/2019.
 */
public class Dice {

    ArrayList<Integer> dice = new ArrayList<>();

    public int roll (){
        for (int i = 1; i<=6; i++){
            dice.add(i);
        }

         int roll = new Random().nextInt(dice.size());
        System.out.println("Roll: " + roll);
        return roll;

    }

}
