import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptiblyExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void safeMethod() {
        try {
            lock.lockInterruptibly(); // Поток может быть прерван во время ожидания
            try {
                System.out.println(Thread.currentThread().getName() + " выполняет работу...");
                Thread.sleep(5000);
            } finally {
                lock.unlock();
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " был прерван!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockInterruptiblyExample example = new LockInterruptiblyExample();

        Thread t1 = new Thread(example::safeMethod);
        Thread t2 = new Thread(example::safeMethod);

        t1.start();
        Thread.sleep(1000); // Даем время t1 захватить лок
        t2.start();

        Thread.sleep(2000);
        t2.interrupt(); // Прерываем t2
    }
}

