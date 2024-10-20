package src;

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements: ");
        int count = sc.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.print(fiboNacci(i)+ " ");
        }
    }

    public static int fiboNacci(int position){
        if(position == 1){
            return 0;
        }
        if(position ==2){
            return 1;
        }
        return fiboNacci(position-1) + fiboNacci(position-2);
    }
}
