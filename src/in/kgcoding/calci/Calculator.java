package src.in.kgcoding.calci;

public class Calculator {
    public int add(int first, int second){
        return first + second;
    }

    public int add(int first, int second,int third){
        return first + second + third;
    }

    public double add(double first, double second){
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.add(5,6,7));
        System.out.println(calculator.add(5.9,6.3));
    }
}
