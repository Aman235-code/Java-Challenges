package src.in.kgcoding.arrs;

public class TestArr {
    public static void main(String[] args) {
        ArrayOpe arrayOpe = new ArrayOpe(new int[] {1,4,5,7,8,3});
        ArrayOpe.Statistics statistics = arrayOpe.new Statistics();
        System.out.println(statistics.mean());
    }
}
