package com.company;

import java.util.Scanner;

/**
 * Created by Robin on 1/20/2019.
 */

public class NameProcessor {

    public void processName(){
        String inputName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        inputName = scanner.nextLine();

        String[] lastName = inputName.split(" ");
        int nameLength = lastName.length;

        System.out.print("Your name is: " + lastName[nameLength-1] + ", ");
        for (int i = 0; i < nameLength - 1; i++) {
            System.out.print(lastName[i].charAt(0)+".");
        }
    }
}
