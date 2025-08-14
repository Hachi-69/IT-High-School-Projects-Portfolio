package turillolucaesempiovariabiliglobali;

public class RunThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Is Running");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
        }
    }
}
