import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Задача запущена, ждем результат...");

        Integer result = future.get(); // Блокирующий вызов, ждет завершения задачи
        System.out.println("Результат: " + result);

        executor.shutdown();
    }
}

