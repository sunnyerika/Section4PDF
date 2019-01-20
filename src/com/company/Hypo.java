package com.company;


import java.text.DecimalFormat;

/**
 * Created by Sunny on 1/14/2019.
 */
public class Hypo {

    public double hypothenuse (double sideA, double sideB){
        DecimalFormat f = new DecimalFormat("##.00");
        double  hypo = Math.sqrt((sideA*sideA + sideB*sideB));
        System.out.print("Hypothenuse:" + f.format(hypo));
        return hypo;
    }
}
