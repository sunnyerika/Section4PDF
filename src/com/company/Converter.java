package com.company;

/**
 * Created by Sunny on 1/14/2019.
 */
public class Converter {

    public double fToC (double degreesF){
        double celsius = 5/9*(degreesF-32);
        System.out.println("Celsius: " + celsius);
        return celsius;
    }

}
