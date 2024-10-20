package src;

import java.util.Scanner;

class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No: ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println(isPrime?"Prime":"Not Prime");
    }

    public static boolean isPrime(int num){
        for(int i = 2;i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return  true;
    }
}
