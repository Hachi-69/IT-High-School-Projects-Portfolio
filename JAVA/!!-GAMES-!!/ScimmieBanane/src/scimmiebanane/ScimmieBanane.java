package scimmiebanane;

/**
 *
 * @author turil
 */
public class ScimmieBanane {

    /**
     * 10 scimmie cercano di salire su un albero per mangiare le banane(l'albero
     * contiene 18 banane). Sull'albero possono salire solo 3 scimmie per volta.
     * Ogni scimmia che arriva in cima mangia 2 banane. Simulare tale situazione
     * in Java utilizzando Thread e Monitor con Wait e Notify
     *
     * @param args
     */
    public static void main(String[] args) {
        Albero a = new Albero();
        for (int i = 0; i < 10; i++) {
            Thread s = new Thread(new Scimmia(a));
            s.start();
        }
    }

}
