package src.in.kgcoding.lambdas;

import java.util.List;

public class StrConcat {
    public static void main(String[] args) {
        List<String> name = List.of("Im aman alok ahamed","is teaching java","good","om youtube channel","lok","how");
        String res = name.stream().filter(str -> str.length()>10)
                .reduce("",(a,b)-> a + " "+ b);
        System.out.println(res);
    }
}
