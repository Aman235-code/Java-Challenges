package src.in.kgcoding.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            PrintNumbers printNumbers = new PrintNumbers();
            executorService.submit(printNumbers);
        }
    }
}
