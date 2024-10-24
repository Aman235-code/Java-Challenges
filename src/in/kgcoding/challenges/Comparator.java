package src.in.kgcoding.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aman","Bear","Lion","Ant","Zebra");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> stringList){
//        Collections.sort(stringList);
//        Collections.reverse(stringList);
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.printf("%s %s ",o1,o2);
                System.out.println();
                if(o1.equals(o2)){
                    System.out.println("if");
                    return 0;
                }
                else if(o1.charAt(0) < o2.charAt(0)){
                    System.out.println("Else if");
                    System.out.printf("%s %s",o1.charAt(0),o2.charAt(0));
                    System.out.println();
                    return 1;
                }
                else {
                    System.out.println("else");
                    return -1;
                }
            }
        });
    }
}
