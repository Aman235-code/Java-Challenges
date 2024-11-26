package src.in.kgcoding.threads;

public class ThreadState extends Thread{



    @Override
    public void run()  {
        try {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside the run %s",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreated the thread %s",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread finished %s",t1.getState());
    }
}
