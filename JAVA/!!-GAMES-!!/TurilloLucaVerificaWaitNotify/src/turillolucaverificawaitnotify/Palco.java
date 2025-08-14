package turillolucaverificawaitnotify;

import javax.swing.JTextArea;

/**
 *
 * @author turillo.luca
 */
public class Palco {

    private Integer yoyo;
    private Integer postiPalco;
    private final JTextArea atx;

    public Palco(JTextArea atx) {
        this.yoyo = 3;
        this.postiPalco = 1;
        this.atx = atx;
    }

    public synchronized void prendiYoyo() {
        try {
            atx.append(Thread.currentThread().getName() + " vuole prendere lo yoyo \n \n");
            while (yoyo == 0) {
                wait();
            }
            yoyo--;
            atx.append(Thread.currentThread().getName() + " ha preso lo yoyo e sono rimasti: " + yoyo + " yoyo \n \n");
        } catch (Exception e) {
        }
    }

    public synchronized void lasciaYoyo() {
        yoyo++;
        atx.append(Thread.currentThread().getName() + " ha lasciato lo yoyo e sono rimasti: " + yoyo + " yoyo \n \n");
        notifyAll();
    }

    public synchronized void saliPalco() {
        try {
            atx.append(Thread.currentThread().getName() + " vuole salire sul palco \n \n");
            while (postiPalco == 0) {
                wait();
            }
            postiPalco--;
            atx.append(Thread.currentThread().getName() + " e' salito sul palco e sono rimasti: " + postiPalco + " posti sul palco \n \n");
        } catch (Exception e) {
        }
    }

    public synchronized void scendiPalco() {
        postiPalco++;
        atx.append(Thread.currentThread().getName() + " e' sceso dal palco e sono rimasti: " + postiPalco + " posti sul palco \n \n");
        notifyAll();
    }
}
