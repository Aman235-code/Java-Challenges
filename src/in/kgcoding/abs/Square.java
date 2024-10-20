package src.in.kgcoding.abs;

public class Square extends Shape {

    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return sideInCms * sideInCms;
    }
}
