package src;

import java.util.Scanner;

class PassWordChecker {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String password;
        do{
            System.out.println("Enter password: ");
            password = ip.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks");
    }
    public static boolean isValidPassword(String password){
        return password.length() > 8;
    }
}
