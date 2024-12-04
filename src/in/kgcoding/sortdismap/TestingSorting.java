package src.in.kgcoding.sortdismap;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employeeList= List.of(
                new Employee("Aman",100),
                new Employee("Mohan",1000),
                new Employee("Ram",10000),
                new Employee("Shyam",1),
                new Employee("Ayan",5)
        );
        employeeList.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary()).forEach(System.out::println);
    }
}
