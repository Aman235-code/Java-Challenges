package src.in.kgcoding.arrs;

public class ArrayOpe {
    private int[] numbers;

    public ArrayOpe(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
        double mean(){
            double sum = 0;
            for (int number : numbers) {
               sum += number;
            }
            return sum / numbers.length;
        }
        double median(){
            return 0;
        }
    }
}
