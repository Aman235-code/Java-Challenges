package src;

import java.util.Scanner;

class minNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First num: ");
        int num1 = input.nextInt();
        System.out.println("Second num: ");
        int num2 = input.nextInt();
        minNumbers ternary = new minNumbers();
        int minimum = ternary.min(num1,num2);
        System.out.println(minimum + " is the minimum");

    }

    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }
}
