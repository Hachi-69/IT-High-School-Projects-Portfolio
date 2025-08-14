package turillolucalistaordinatafilm;

/**
 *
 * @author Turillo.Luca
 */
public class Nodo {

    private Film inf;
    private Nodo next;

    public Nodo(Film inf) {
        this.inf = inf;
        this.next = null;
    }

    /**
     *
     * @return inf
     */
    public Film getInf() {
        return inf;
    }

    /**
     * sostituisce l'attuale inf con il parametro passato
     *
     * @param cont numero che si vuole sostituire all'attuale inf
     */
    public void setInf(Film cont) {
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

    @Override
    public String toString() {
        return "Nodo: " + inf;
    }
}
