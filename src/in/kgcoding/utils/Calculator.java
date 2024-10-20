package src.in.kgcoding.utils;

import src.in.kgcoding.geometry.Circle;
import src.in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10,5);

        double virArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rec.length * rec.breadth;

        System.out.println(virArea);
        System.out.println(rectArea);
    }
}
