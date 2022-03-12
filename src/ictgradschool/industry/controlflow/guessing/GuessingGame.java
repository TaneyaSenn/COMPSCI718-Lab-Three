package ictgradschool.industry.controlflow.guessing;

import ictgradschool.Keyboard;

/**
 * A guessing game!
 */

public class GuessingGame {

    public void start() {

        // TODO Write your code here.

            int min = 1;
            int max = 100;
            int goal = (int)(Math.random() * (max-min+1)) + min;

            int guess = 0;
            while (guess != goal) {

                System.out.println("Enter your guess between 1 and 100: ");
                guess = Integer.parseInt(Keyboard.readInput());

                if (guess < goal) {
                    System.out.println("Your number is too low, try again");
                }
                else if (guess > goal) {
                    System.out.println("Your number is too high, try again");
                }
                else {
                    System.out.println("Perfect!");
                }

            }

            System.out.println("Game Over");
        }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
