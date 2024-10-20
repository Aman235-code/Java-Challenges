package src;

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        int num = 5, guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number guessing game");

        do {
            System.out.println("Guess from 0 - 10:   ");
            guess = sc.nextInt();
        } while (num != guess);
        System.out.println("Success");
    }
}
