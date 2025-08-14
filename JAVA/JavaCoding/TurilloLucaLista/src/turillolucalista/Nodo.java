package turillolucalista;

/**
 *
 * @author Turillo.Luca
 */
public class Nodo {

    private Integer inf;
    private Nodo next;

    public Nodo(Integer inf) {
        this.inf = inf;
        this.next = null;
    }

    /**
     *
     * @return inf
     */
    public Integer getInf() {
        return inf;
    }

    /**
     * sostituisce l'attuale inf con il parametro passato
     *
     * @param cont numero che si vuole sostituire all'attuale inf
     */
    public void setInf(Integer cont) {
        this.inf = cont;
    }

    /**
     *
     * @return next, restituisce il nodo collegato
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * sostituisce l'attuale next con il parametro passato di tipo nodo
     *
     * @param next numero che si vuole sostituire all'attuale next di tipo nodo
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

}
