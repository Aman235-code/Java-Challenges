package src.in.kgcoding.overriding;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        vehicle.service();
        car.service();
    }
}
