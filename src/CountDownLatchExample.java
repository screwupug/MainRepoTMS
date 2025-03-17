import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3); // 3 "отсчета"

        Runnable worker = () -> {
            System.out.println(Thread.currentThread().getName() + " выполняет работу...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown(); // Уменьшаем счетчик
            System.out.println(Thread.currentThread().getName() + " завершил работу.");
        };

        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();

        latch.await(); // Ждем, пока счетчик станет 0
        System.out.println("Все потоки завершили работу. Основной поток продолжает.");
    }
}


