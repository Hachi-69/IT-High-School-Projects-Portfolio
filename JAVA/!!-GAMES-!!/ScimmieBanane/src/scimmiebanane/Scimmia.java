package scimmiebanane;

/**
 *
 * @author turil
 */
public class Scimmia implements Runnable {

    private final Albero albero;

    public Scimmia(Albero albero) {
        this.albero = albero;
    }

    @Override
    public void run() {
        try {
            albero.faiSalireScimmia();
            Thread.sleep(1000);
            albero.liberaAlbero();
        } catch (InterruptedException ex) {
        }
    }
}
