package turillolucaverificawaitnotify;

/**
 *
 * @author turillo.luca
 */
public class Atleta implements Runnable {

    private final Palco p;

    /*prova a recuperare uno Yo-Yo
     una volta recuperato uno yo-yo,
     sale sul palco per la performance(durata performance 60sec)
     scende dal palco
     riconsegna lo Yo-Yo
     */
    public Atleta(Palco p) {
        this.p = p;
    }

    @Override
    public void run() {
        try {
            p.prendiYoyo();
            p.saliPalco();
            Thread.sleep(6);
            p.scendiPalco();
            p.lasciaYoyo();
        } catch (InterruptedException e) {
        }

    }
}
