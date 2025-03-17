class VolatileExample {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void start() {
        new Thread(() -> {
            while (running) {
                // Имитация сложной работы
                for (int i = 0; i < 1_000_000; i++);
            }
            System.out.println("Остановлен.");
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();
        Thread.sleep(2000);
        example.stop(); // Может не сработать!
    }
}


