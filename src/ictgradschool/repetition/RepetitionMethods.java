package ictgradschool.repetition;

import ictgradschool.Keyboard;

import java.security.Key;

public class RepetitionMethods {

//    1. Write a method that prints the average of all even numbers between 1 and 20 (inclusive).
        private void evenAveraged() {
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    sum += 1;
                    count ++;
                }
            }
            int average = sum / count;
            System.out.println(average);
        }
//    2. Write a method that prompts the user to type Y or N. If they type anything else, the user should be re-prompted.
        private void promptYN() {
            while (true) {
                System.out.println("Please type Y or N");
                String response = Keyboard.readInput();
                if (response.equals("Y") || response.equals("N")) {
                    break;
                }
            }
        }
//    3. Write a method that prompts the user to enter two integers. Then, print all odd numbers between the two given values (inclusive).
        private void oddIntsBetweenValues() {
            System.out.println("Choose your first number: ");
            int valueOne = Integer.parseInt(Keyboard.readInput());

            System.out.println("Choose your second number: ");
            int valueTwo = Integer.parseInt(Keyboard.readInput());

            int max = Math.max(valueOne, valueTwo);
            int min = Math.min(valueOne, valueTwo);

            for (int i = min; i <= max; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
//    4. Write a method that prints all the factorials from 1! To 10! (where n! = n * (n-1) * (n-2) * … * 2 * 1).
        private void printFactorials() {
            int factorial = 1;
            for (int n = 1; n < 10; n++) {
                factorial = factorial * n;
                System.out.println(factorial);
            }
        }


        public void main(String[] args) {
            evenAveraged();
            promptYN();
            oddIntsBetweenValues();
            printFactorials();
        }
}
