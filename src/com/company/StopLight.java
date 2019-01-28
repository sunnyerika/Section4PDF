package com.company;
import java.util.Scanner;

/**
 * Created by Robin on 1/20/2019.
 */

public class StopLight {

    public void stopLightDetector() {
        String inputColor;
        String nextColor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code (1, 2 or 3): ");
        inputColor = scanner.nextLine();

        switch (inputColor) {
            case "1":
                nextColor = "green";
                System.out.println("Next Traffic Light is " + nextColor);
                break;
            case "2":
                nextColor = "yellow";
                System.out.println("Next Traffic Light is " + nextColor);
                break;
            case "3":
                nextColor = "red";
                System.out.println("Next Traffic Light is " + nextColor);
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}
