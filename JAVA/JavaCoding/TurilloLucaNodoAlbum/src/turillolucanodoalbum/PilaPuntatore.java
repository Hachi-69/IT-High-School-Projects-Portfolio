package turillolucanodoalbum;

/**
 *
 * @author Turillo.Luca
 */
public class PilaPuntatore {

    private Nodo head;

    public PilaPuntatore() {
        this.head = null;
    }

    public void push(Nodo n) {
        if (head == null) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

    public Nodo pop() {
        Nodo tmp = head;
        if (tmp != null) {
            head = head.getNext();
            tmp.setNext(null);
        }
        return tmp;
    }

    public Nodo top() {
        return head;
    }

    @Override
    public String toString() {
        String stampa = "";
        Nodo temp = head;
        while (temp != null) {
            stampa += temp.getInf();
            temp = temp.getNext();
        }
        return stampa;
    }
}
