package threadmain;

/**
 *
 * @author Turillo.Luca
 */
public class MiaClasseRunnable implements Runnable {

    private String nome;
    private Integer num;

    MiaClasseRunnable(String n, Integer num) {
        nome = n;
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nome + ": " + i + " From Thread: " + num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println(nome + ": DONE! " + " From Thread: " + num);
    }
}
