package src.in.kgcoding.lambdas;

import java.util.List;

public class OddNo {
    public static void main(String[] args) {
        List<Integer> no = List.of(1,2,3,4,5,6,7,8,9,10);
        no.stream().filter(num -> num%2==1).forEach(num -> System.out.println(num));
    }
}
