package src.in.kgcoding.executorService2;

public class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started: Current Thread: %s\n", current.getName());
        try {
            Thread.sleep(getRandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended: Current Thread: %s\n", current.getName());
    }

    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
