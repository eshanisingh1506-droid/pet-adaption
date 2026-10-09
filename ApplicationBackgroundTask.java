public class ApplicationBackgroundTask extends Thread {

    @Override
    public void run() {

        System.out.println("Checking adoption applications...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Processing application " + i);
        }

        System.out.println("Application checking completed!");
    }
}