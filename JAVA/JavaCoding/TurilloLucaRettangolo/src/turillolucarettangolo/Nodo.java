package turillolucarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class Nodo {

    private ClassRettangolo inf;
    private Nodo next;

    public Nodo(ClassRettangolo inf) {
        this.inf = inf;
        this.next = null;
    }

    public ClassRettangolo getInf() {
        return inf;
    }

    public void setInf(ClassRettangolo inf) {
        this.inf = inf;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
