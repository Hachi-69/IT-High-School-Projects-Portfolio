package turillolucapilarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class Nodo {

    private Computer inf;
    private Nodo next;

    public Nodo(Computer inf) {
        this.inf = inf;
        this.next = null;
    }

    public Computer getInf() {
        return inf;
    }

    public void setInf(Computer cont) {
        this.inf = cont;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
