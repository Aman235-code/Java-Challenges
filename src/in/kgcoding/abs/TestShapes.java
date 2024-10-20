package src.in.kgcoding.abs;

public class TestShapes {
    public static void main(String[] args) {
//        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Square square = new Square(10.3);
        System.out.println(circle.calculateArea());
        System.out.printf("%2.2f", square.calculateArea());
    }
}
