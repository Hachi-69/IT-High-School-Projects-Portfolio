package threadmain;

/**
 *
 * @author Turillo.Luca
 */
public class ThreadMain {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MiaClasseRunnable ja = new MiaClasseRunnable("Jamaica",i);
            Thread mioThread = new Thread(ja);
            mioThread.start();
        }

    }

}
