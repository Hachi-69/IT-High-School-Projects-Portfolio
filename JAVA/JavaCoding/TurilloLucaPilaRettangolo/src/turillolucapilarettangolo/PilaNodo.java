package turillolucapilarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class PilaNodo {

    private Nodo head;

    public PilaNodo() {
        head = null;
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

    public Boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        String stampa = "Pila:\n{\n";
        Nodo temp = head;
        while (temp != null) {
            stampa += temp.getInf() + " \n";
            temp = temp.getNext();
        }
        return stampa + "}" + "\n";
    }

    public Nodo getHead() {
        return head;
    }

}
