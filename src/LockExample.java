import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void safeMethod() {
        lock.lock(); // Захватываем лок
        try {
            System.out.println(Thread.currentThread().getName() + " выполняет работу...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Освобождаем лок
        }
    }

    public static void main(String[] args) {
        LockExample example = new LockExample();

        Thread t1 = new Thread(example::safeMethod);
        Thread t2 = new Thread(example::safeMethod);

        t1.start();
        t2.start();
    }
}

