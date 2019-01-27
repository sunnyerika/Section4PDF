package com.company;

import java.util.Scanner;

/**
 * Created by Sunny on 1/27/2019.
 */
public class Multiples {

    int number;

    public String enterNumber() {
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextLine();
        //System.out.print("Entered Pin: "+ inputPin);
        //System.out.println();
        return number;
    }

    public int convertStringToInt(String numStr) {
        int number = Integer.parseInt(numStr);
        return number;
    }

    public void printMultiples (){
        int number = convertStringToInt(enterNumber());
        int multiple;

        System.out.print("Multiples of " +number+ ": ");
        for (int i = 1; i <= 12; i++){
            multiple = number*i;
            System.out.print(multiple + " ");
        }

    }




}
