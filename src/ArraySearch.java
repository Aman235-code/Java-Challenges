package src;

import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Size:");
        int size = sc.nextInt();
        int[] num = new int[size];
        int i = 0;
        while(i < size){
            System.out.println("Enter "+ i+ " Number");
            num[i] = sc.nextInt();
            i++;
        }
        System.out.println("No Search");
        int elem = sc.nextInt();
        int occ = countOccurances(num,elem);
        System.out.println(occ);
    }

    public static int countOccurances(int[] nums, int elem){
        int occ = 0;
        for(int num: nums){
            if(num == elem){
                occ++;
            }
        }
        return occ;
    }
}
