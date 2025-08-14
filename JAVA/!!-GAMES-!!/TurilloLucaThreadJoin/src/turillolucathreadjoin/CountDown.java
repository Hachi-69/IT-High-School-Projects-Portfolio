package turillolucathreadjoin;

/**
 *
 * @author Turillo.Luca
 */
public class CountDown implements Runnable {

    private Integer countDown;
    private final String id;

    public CountDown(String id, Integer countDown) {
        this.countDown = countDown;
        this.id = id;
    }

    public String Status() {
        if (countDown > 0) {
            return id + ": " + countDown + "\n";
        } else {
            try {
                Thread t2 = new Thread(new CountDown2("t2", 10));
                t2.start();
                t2.join();
            } catch (InterruptedException ex) {
            }
            return "GO! T1" + "\n";
        }
    }

    @Override
    public void run() {
        while (countDown >= 0) {
            System.out.println(Status());
            countDown--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
