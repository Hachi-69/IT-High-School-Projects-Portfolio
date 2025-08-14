package turillolucathreadjoin;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaThreadJoin {

    public static void main(String[] args) {
        Thread t1 = new Thread(new CountDown("t1", 10));
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
        }
        System.out.println("SI PARTE!");
    }
}
