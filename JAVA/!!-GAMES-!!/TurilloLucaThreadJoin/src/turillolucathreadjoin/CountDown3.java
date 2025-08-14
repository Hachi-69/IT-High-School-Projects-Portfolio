package turillolucathreadjoin;

/**
 *
 * @author Turillo.Luca
 */
public class CountDown3 implements Runnable {

    private Integer countDown3;
    private final String id;

    public CountDown3(String id, Integer countDown3) {
        this.countDown3 = countDown3;
        this.id = id;
    }

    public String Status() {
        return id + ": " + (countDown3 > 0 ? countDown3 : "GO! T3") + "\n";
    }

    @Override
    public void run() {
        while (countDown3 >= 0) {
            System.out.println(Status());
            countDown3--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
