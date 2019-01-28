package com.company;
import java.util.Scanner;

/**
 * Created by Robin on 1/20/2019.
 */

public class ColorRange {

    public void colorRangeDetector(){
        String inputColor;
        double wavelength = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a wavelength between 0 and 750: ");
        inputColor = scanner.nextLine();

        try {
            wavelength = Double.valueOf(inputColor);
        } catch (Exception e){
            System.out.print("Please only use numbers");
            return;
        }

        if (wavelength < 380 || wavelength >= 750){
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        if (wavelength >= 380 && wavelength < 450){
            System.out.print("The color is Violet");
        }
        if (wavelength >= 450 && wavelength < 495){
            System.out.print("The color is Blue");
        }
        if (wavelength >= 495 && wavelength < 570){
            System.out.print("The color is Green");
        }
        if (wavelength >= 570 && wavelength < 590){
            System.out.print("The color is Yellow");
        }
        if (wavelength >= 590 && wavelength < 620){
            System.out.print("The color is Orange");
        }
        if (wavelength >= 620 && wavelength < 750){
            System.out.print("The color is Red");
        }
    }
}
