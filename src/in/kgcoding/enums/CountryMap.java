package src.in.kgcoding.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("China","Beijing");
        map.put("Pakistan","Islamabad");
        map.put("SriLanka","Columbo");
        map.put("Bangladesh","Dhaka");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Country Name: ");
        String country = scanner.next();

        if(map.containsKey(country)){
            System.out.println(country);
            System.out.println(map.get(country));
        } else {
            System.out.println("Sorry! we don't know the capital");
        }
    }
}
