/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import java.util.*;

/**
 *
 * @author Jan
 */
public class NumberGuess {

    public static void main(String args[]) {
        System.out.println("Guess the number! It is between 1 and 100 inclusive.");
        Random numGen = new Random();
        Scanner input = new Scanner(System.in);
        int secretNum = numGen.nextInt(99) + 1;
        int guess = input.nextInt();
        boolean keepPlaying = true;
        boolean won = false;
        if (guess > 100 || guess < 1) {
            System.out.println("error");
            keepPlaying = false;
        }

        while (keepPlaying) {
            while (!won) {
                if (guess == secretNum) {
                    System.out.println("Congratulations, you win!");
                    won = true;
                } else {
                    System.out.println("Sorry,wrong. Try again.");
                    if (guess > secretNum) {
                        System.out.println("Too high!");
                    }
                    if (guess < secretNum) {
                        System.out.println("Too low!");
                    }
                    guess = input.nextInt();
                }
                if (guess > 100) {
                    System.out.println("error");
                    keepPlaying = false;
                }
                if (guess < 1) {
                    System.out.println("error");
                    keepPlaying = false;
                }
            }
            System.out.println("Would you like to play again?");
            String tryagain = input.next();
            tryagain.toLowerCase();
            if (tryagain.equals("yes")) {
                secretNum = numGen.nextInt(99) + 1;
                System.out.println("You are now playing again.");
                guess = input.nextInt();
                won = false;
            } else {
                keepPlaying = false;
            }
        }

    }
}
