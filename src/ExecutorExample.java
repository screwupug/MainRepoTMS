import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Пул на 3 потока

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Выполняется задача " + taskId + " потоком " + Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // Завершаем работу пула
    }
}

