package src.in.kgcoding.threads;

public class PrintThread extends Thread{

    private final int threadNumber;

    public PrintThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",getName(),threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread Ended-%d\n",getName(),threadNumber);

    }

    public static void main(String[] args) throws InterruptedException {
        PrintThread t1 = new PrintThread(1);
        PrintThread t2 = new PrintThread(2);
        PrintThread t3 = new PrintThread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
