package turillolucapilainteripuntatore;

/**
 *
 * @author Turillo.Luca
 */
public class Pila {

    private Nodo head;

    public Pila() {
        this.head = null;
    }

    /**
     * inserisce in cima alla pila il parametro di tipo nodo passato e lo
     * collega con l'elemento precedentemente inserito
     *
     * @param n elemento da inserire in cima alla pila
     */
    public void push(Nodo n) {
        if (head == null) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

    /**
     *
     * @return null se la pila e' vuota, altrimenti restituisce l'elemento
     * estratto di tipo nodo
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
     * @return head, ovvero il prossimo elemento che verra' estratto di tipo
     * nodo
     */
    public Nodo top() {
        return head;
    }

    /**
     *
     * @return stampa una stringa di tutta la pila, in ordine dall'ultimo
     * inserito al primo inserito
     */
    @Override
    public String toString() {
        String stampa = "";
        Nodo temp = head;
        while (temp != null) {
            stampa += temp.getInf() + " ";
            temp = temp.getNext();
        }
        return stampa;
    }
}
