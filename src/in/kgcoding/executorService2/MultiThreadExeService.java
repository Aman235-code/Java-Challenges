package src.in.kgcoding.executorService2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExeService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {
            for (int i = 0; i < 10; i++) {
                SleepTask sleepTask = new SleepTask();
                service.submit(sleepTask);
            }

            if(!service.awaitTermination(15, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
