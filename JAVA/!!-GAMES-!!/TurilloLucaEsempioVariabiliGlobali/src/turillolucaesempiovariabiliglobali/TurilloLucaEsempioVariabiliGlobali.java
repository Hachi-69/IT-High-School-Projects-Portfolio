package turillolucaesempiovariabiliglobali;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaEsempioVariabiliGlobali {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Is running ");
        Thread alpha = new Thread(new RunThread());
        Thread beta = new Thread(new RunThread());
        alpha.setName("Alpha Thread");
        beta.setName("Beta Thread");
        alpha.start();
        beta.start();
        System.out.println(Thread.currentThread().getName() + " Stops running");
    }
}
