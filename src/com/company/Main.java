package com.company;

public class Main {


    public static void main(String[] args) {

        //Problem 1.1
        System.out.println("Problem 1.1");
        Converter conF2C = new Converter();
        conF2C.fToC(32.0);
        System.out.println();

        //Problem 1.2
        System.out.println("Problem 1.2");
        Hypo hypo = new Hypo();
        hypo.hypotenuse(2, 3);
        System.out.println();

        //Problem 1.3
        System.out.println("Problem 1.3");
        Dice dice = new Dice();
        dice.roll();
        System.out.println();

        //Problem 2 - Robin
        System.out.println("Problem 2");
        NameProcessor nameProcessor = new NameProcessor();
        nameProcessor.processName();
        System.out.println();

        //Problem 6.1 Validate pin - erika
        System.out.println("Problem 1 Section 6: Validate Pin");
        ValidatePin validatePin = new ValidatePin(1234);
        validatePin.validatePin();
        System.out.println();

        //Problem 6.2 Multiples - erika
        System.out.println("Problem 2 Section 6: Displaying Multiples of a number");
        Multiples multiples = new Multiples();
        multiples.printMultiples();
        System.out.println();

        //Problem 6.3 ASCII Art - erika
        System.out.println("Problem 3 Section 6: Programmatic ASCII Art");
        AsciiArt asciiArt = new AsciiArt();
        asciiArt.createRectangle(9,8);
        asciiArt.createTrangle(9);
        System.out.println();

        //Problem 5.1 - Robin
        System.out.println("Problem 5.1");
        ColorRange cr = new ColorRange();
        cr.colorRangeDetector();
        System.out.println();

        //Problem 5.2 + 5.3 - Robin
        System.out.println("Problem 5.2 + 5.3");
        StopLight sl = new StopLight();
        sl.stopLightDetector();
        System.out.println();

    }
}
