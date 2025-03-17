import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Разрешаем максимум 2 потока одновременно

        Runnable worker = () -> {
            try {
                semaphore.acquire(); // Захватываем разрешение
                System.out.println(Thread.currentThread().getName() + " получил доступ к ресурсу.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " освободил ресурс.");
                semaphore.release(); // Освобождаем разрешение
            }
        };

        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
    }
}
