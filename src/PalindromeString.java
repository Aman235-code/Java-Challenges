package src;

import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("String: ");
        String str = ip.next();
        System.out.println(isPalindrome(str)?"Yes":"No");
    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
