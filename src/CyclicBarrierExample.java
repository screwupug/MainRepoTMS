import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("Все потоки достигли барьера! Продолжаем...");
        });

        Runnable worker = () -> {
            System.out.println(Thread.currentThread().getName() + " выполняет работу...");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " ждет на барьере...");
                barrier.await(); // Ждет, пока все потоки дойдут до барьера
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " продолжает работу.");
        };

        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
    }
}
