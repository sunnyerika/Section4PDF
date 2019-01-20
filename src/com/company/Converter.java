package com.company;

/**
 * Created by Sunny on 1/14/2019.
 */
public class Converter {

    public double fahrenheitToCelsius (double fahrenheit){
        double celsius = 5/9*(fahrenheit-32);
        System.out.print("Celsius:" + celsius);
        return celsius;
    }

}
