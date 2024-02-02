package com.bridgelabz.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class Game {
    // Roll a Dice
    private static int rolldice(){
        Random r = new Random();
        return r.nextInt(6);
    }
    // Options Generated
    private static String checksfor(){
        String[] arr = {"No play","Ladder","Snake"};
        Random r = new Random();
        int i = r.nextInt(arr.length);
        return arr[i];
    }

    public static void playgame() {
        Scanner scanner = new Scanner(System.in);
        int position = 0, diceVal = 0,no_of_die = 0;
        System.out.println("Initial Position = " + position);
        System.out.println("Enter (roll) to roll dice");
        String ch = scanner.nextLine();
        if (ch.equalsIgnoreCase("roll")) {
            diceVal = rolldice();
            no_of_die++;
            System.out.println("you rolled out " + diceVal + " times");
        }
        // To Check the Option and Move Position till 100
        while (position < 100) {
            String Option = checksfor();
            switch (Option) {
                case "Ladder":
                    position += diceVal;
                    break;
                case "Snake":
                    position -= diceVal;
                    if(position<0)
                        position = 0;
                    break;
                case "No play":
                    break;
                default:
                    System.out.println("U got nothing");
            }
            System.out.println("Your Current Position" + position);
        }
        if(position==100){
            System.out.println("GAME WON \n");
            System.out.println("\n No of positions took to reach : "+no_of_die);
        }
    }
}
