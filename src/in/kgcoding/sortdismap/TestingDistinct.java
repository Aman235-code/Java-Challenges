package src.in.kgcoding.sortdismap;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,5,3,4,6,2);
        List<Integer> disnumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(disnumbers);
    }
}
