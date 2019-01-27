package com.company;

import java.util.Scanner;

/**
 * Created by Sunny on 1/27/2019.
 */
public class ValidatePin {
//commit
    int userPin = 1234;

    public ValidatePin (int pin){
        this.userPin = pin;
    }


    public String enterPin() {
        String inputPin;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        inputPin = scanner.nextLine();
        //System.out.print("Entered Pin: "+ inputPin);
        //System.out.println();
        return inputPin;
    }


    public int convertStringToInt(String pinStr) {
        int pinInt = Integer.parseInt(pinStr);
        return pinInt;
    }

    public void validatePin() {

        int enteredPin = convertStringToInt(enterPin());

        while (enteredPin != userPin){
            enteredPin = convertStringToInt(reEnterPin());
        }
        System.out.print("Correct Pin. You have access to your account. ");

    }

    public String reEnterPin() {
        String inputPin;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Wrong Pin, please try again: ");
        System.out.println();
        inputPin = scanner.nextLine();
        return inputPin;

    }


}
