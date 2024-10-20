package src.in.kgcoding.empclass;

public class TestEmp {
    public static void main(String[] args) {
        Employee employee = new Employee("Aman",89,9000);
        System.out.println(employee.getEmployeeDetails());
        employee.setName("Golu");
        System.out.println(employee.getEmployeeDetails());
    }
}
