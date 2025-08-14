package turillolucathreadjoin;

/**
 *
 * @author Turillo.Luca
 */
public class CountDown2 implements Runnable {

    private Integer countDown2;
    private final String id;

    public CountDown2(String id, Integer countDown2) {
        this.countDown2 = countDown2;
        this.id = id;
    }

    public String Status() {
        if (countDown2 > 0) {
            return id + ": " + countDown2 + "\n";
        } else {
            try {
                CountDown3 c = new CountDown3("t3", 10);
                Thread t3 = new Thread(c);
                t3.start();
                t3.join();
            } catch (InterruptedException ex) {
            }
            return "GO! T2" + "\n";
        }
    }

    @Override
    public void run() {
        while (countDown2 >= 0) {
            System.out.println(Status());
            countDown2--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
