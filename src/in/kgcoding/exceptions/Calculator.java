package src.in.kgcoding.exceptions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No 1: ");
        int num1 = scanner.nextInt();
        System.out.println("No 2: ");
        int num2 = scanner.nextInt();

        try{
            int res = num1 / num2;
            System.out.println(res);
        }
        catch (ArithmeticException arithmeticException){
            if(arithmeticException.getMessage().equals("/ by zero")){
                System.out.println("Divide by 0 occured");
            }else{
                throw  arithmeticException;
            }
        }
    }
}
