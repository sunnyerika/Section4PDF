package com.company;


import java.text.DecimalFormat;

/**
 * Created by Sunny on 1/14/2019.
 */
public class Hypo {

    public double hypotenuse (double a, double b){
        DecimalFormat f = new DecimalFormat("##.00");
        double  hypo = Math.sqrt((a*a + b*b));
        System.out.println("Hypothenuse: " + f.format(hypo));
        return hypo;
    }
}
