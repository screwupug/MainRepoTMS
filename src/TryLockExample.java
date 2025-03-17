import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void attemptLock() {
        if (lock.tryLock()) { // Пытаемся захватить лок
            try {
                System.out.println(Thread.currentThread().getName() + " захватил лок!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " не смог захватить лок!");
        }
    }

    public static void main(String[] args) {
        TryLockExample example = new TryLockExample();

        Thread t1 = new Thread(example::attemptLock);
        Thread t2 = new Thread(example::attemptLock);

        t1.start();
        t2.start();
    }
}


