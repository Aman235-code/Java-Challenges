package src.in.kgcoding.lambdas;

import java.util.List;

public class StreamList {
    public static void main(String[] args) {
        List<String> names = List.of("Aman","Bangu","Loki");
        names.stream().forEach(nsme -> System.out.println(nsme));
    }
}
