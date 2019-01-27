package com.company;

/**
 * Created by Sunny on 1/27/2019.
 */
public class AsciiArt {
/*
    int sideA = 0;
    int sideB = 0;
    int leg = 0;

    public AsciiArt (int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public AsciiArt (int leg){
        this.leg = leg;

    }
*/
    public void createRectangle(int sideA, int sideB){

/*
        //testing spaces
        for (int j = 1; j<=sideB; j++) {
            System.out.println();
            for (int i = 1; i <= sideA; i++) {
                if (i == 1 || i == sideA) {
                    System.out.print("*");
                } else {
                    System.out.print("`");
                }
            }
        }
*/
        //(5,4) outer loop = 4
        for (int m = 1; m<=sideB; m++) {
            System.out.println();
            if (m ==1 || m == sideB){
                for (int k = 1; k <= sideA; k++) {
                    System.out.print("*");
                }
            } else {
                for (int n = 1; n <= sideA; n++)
                    if (n == 1 || n == sideA) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
            }
        }


    }

}
