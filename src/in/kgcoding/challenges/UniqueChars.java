package src.in.kgcoding.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("String enter: ");
        String user = scanner.next();

        for (char c : user.toCharArray()) {
            set.add(c);
        }

        System.out.println(set.size());
    }
}
