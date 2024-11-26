package src.in.kgcoding.executorService;

public class PrintNumbers implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Number %d\n", i+1);
        }
    }
}
