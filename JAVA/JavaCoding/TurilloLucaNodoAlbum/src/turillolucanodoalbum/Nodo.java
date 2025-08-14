package turillolucanodoalbum;

/**
 *
 * @author Turillo.Luca
 */
public class Nodo {

    private Album inf;
    private Nodo next;

    public Nodo(Album inf) {
        this.inf = inf;
        this.next = null;
    }

    public Album getInf() {
        return inf;
    }

    public void setInf(Album inf) {
        this.inf = inf;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
