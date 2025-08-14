package turillolucacodanodoarrayverifica;

/**
 *
 * @author Turillo.Luca
 */
public class CodaNodo {

    private Nodo head;

    public CodaNodo() {
        head = null;
    }

    /**
     * inserisce in coda il parametro passato di tipo nodo, e lo collega
     * all'ultimo
     *
     * @param n variabile di tipo nodo che voglio inserire in coda
     */
    public void push(Nodo n) {
        if (head == null) {
            head = n;
        } else {
            Nodo tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
        }
    }

    /**
     * elimina il nodo in testa
     *
     * @return nodo eliminato
     */
    public Nodo pop() {
        Nodo tmp = head;
        if (tmp != null) {
            head = head.getNext();
            tmp.setNext(null);
        }
        return tmp;
    }

    /**
     *
     * @return null se la coda e' vuota, altrimenti il primo nodo inserito,
     * ovvero quello in testa
     */
    public Nodo top() {
        return head;
    }

    /**
     * controlla se la coda e' vuota
     *
     * @return true se la coda e' vuota, altrimenti false
     */
    public Boolean isEmpty() {
        return head == null;
    }

    /**
     * stampa l'intera coda
     *
     * @return una stringa contenente l'intera coda
     */
    @Override
    public String toString() {
        String stampa = "Coda:{" + "\n";
        Nodo temp = head;
        while (temp != null) {
            stampa += temp.getInf() + " \n";
            temp = temp.getNext();
        }
        return stampa + "}" + "\n";
    }
}
