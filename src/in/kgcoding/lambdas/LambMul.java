package src.in.kgcoding.lambdas;

import java.util.function.BinaryOperator;

public class LambMul {
    public static void main(String[] args) {
       BinaryOperator<Integer> multi = (a, b) -> a * b;
        System.out.println(multi.apply(4,5));
    }
}
