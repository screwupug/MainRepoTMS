import java.util.*;

public class Main {

    public static void main(String[] args) {
        trySynchronized();
    }

    public static void trySynchronized() {
        Counter count = new Counter();
        Counter count2 = new Counter();

        Thread thread1 = new Thread(() -> {
            // Захватывает count и ждет count2, который захватил второй тред
            synchronized (count) {
                for (int i = 0; i < 1000; i++) {
                    synchronized (count2) {
                        count.increment();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            // Захватывает count2 и ждет count, который захватил первый тред
            synchronized (count2) {
                for (int i = 0; i < 1000; i++) {
                    synchronized (count) {
                        count.increment();
                    }
                }
            }
        });

        try {
            thread1.start();
            thread2.start();
            // Вывода не будет, потоки бесконечно будут ожидать друг друга
            System.out.println(count.getCounter());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Counter {

    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCounter() {
        return count;
    }
}


