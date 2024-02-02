package com.bridgelabz.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int rolldice(){
        Random r = new Random();
        return r.nextInt(6);
    }
    public static void playgame(){
        Scanner scanner = new Scanner(System.in);
        int position =0;
        System.out.println("Initial Position = "+position);
        System.out.println("Enter (roll) to roll dice");
        String option = scanner.nextLine();
        if(option.equalsIgnoreCase("roll")){
            int diceVal = rolldice();
            System.out.println("you rolled out "+diceVal+" times");
        }
    }
}
