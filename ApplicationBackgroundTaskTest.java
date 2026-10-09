public class ApplicationBackgroundTaskTest {

    public static void main(String[] args) {

        System.out.println("Main program started.");

        ApplicationBackgroundTask task =
                new ApplicationBackgroundTask();

        task.start();

        System.out.println("Main program continues.");
    }
}