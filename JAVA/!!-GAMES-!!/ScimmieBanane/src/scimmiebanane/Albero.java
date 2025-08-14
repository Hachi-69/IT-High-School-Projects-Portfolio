package scimmiebanane;

/**
 *
 * @author turil
 */
public class Albero {

    private Integer banane;
    private final Integer max;
    private Integer att;

    public Albero() {
        this.banane = 18;
        this.max = 3;
        this.att = 0;
    }

    public synchronized void faiSalireScimmia() {
        try {
            System.out.println(Thread.currentThread().getName() + " vuole salire");
            while (att == max) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " sta salendo");
            att++;
            banane -= 2;
            System.out.println("scimmie sull'albero: " + att);
            System.out.println("banane rimaste: " + banane);
            notifyAll();
        } catch (InterruptedException e) {
        }
    }

    public synchronized void liberaAlbero() {
        System.out.println(Thread.currentThread().getName() + " libera l'albero");
        att--;
        System.out.println("scimmie sull'albero: " + att);
        notifyAll();
    }

    public Integer getBanane() {
        return banane;
    }

}
