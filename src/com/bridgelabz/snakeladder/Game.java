package com.bridgelabz.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int rolldice(){
        Random r = new Random();
        return r.nextInt(6);
    }

    private static String checksfor(){
        String[] arr = {"No play","Ladder","Snake"};
        Random r = new Random();
        int i = r.nextInt(arr.length);
        return arr[i];
    }
    public static void playgame(){
        Scanner scanner = new Scanner(System.in);
        int position =0,diceVal = 0;
        System.out.println("Initial Position = "+position);
        System.out.println("Enter (roll) to roll dice");
        String ch = scanner.nextLine();
        if(ch.equalsIgnoreCase("roll")){
            diceVal = rolldice();
            System.out.println("you rolled out "+diceVal+" times");
        }
        String Option = checksfor();
        switch(Option){
            case "Ladder":
                position += diceVal;
                break;
            case "Snake":
                position -= diceVal;
                break;
            case "No play":
                position = diceVal;
                break;
            default:
                System.out.println("U got nothing");
        }
        System.out.println("Your Current Position"+position);
    }
}
