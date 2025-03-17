public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Фоновый поток работает...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        daemonThread.setDaemon(true); // Делаем поток демоном
        daemonThread.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Cycle round " + i);
            Thread.sleep(1000);
        }

        System.out.println("Главный поток завершен");
    }
}
