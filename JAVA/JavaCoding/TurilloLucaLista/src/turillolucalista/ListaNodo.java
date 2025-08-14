package turillolucalista;

/**
 *
 * @author Turillo.Luca
 */
public class ListaNodo {

    private Nodo head;

    public ListaNodo() {
        head = null;
    }

    public void pushTesta(Nodo n) {
        if (isEmpty()) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

    public void pushCoda(Nodo n) {
        if (isEmpty()) {
            pushTesta(n);
        } else {
            Nodo tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
        }
    }

    public void pushPos(Nodo n, Integer pos) {
        Nodo tmp = head;
        Integer posAttraversate = 0;
        while (posAttraversate < pos) {
            tmp = tmp.getNext();
            posAttraversate++;
        }
        n.setNext(tmp.getNext());
        tmp.setNext(n);
    }

    public Nodo popTesta() {
        Nodo tmp = head;
        if (!isEmpty()) {
            head = head.getNext();
            tmp.setNext(null);
        }
        return tmp;
    }

    public Nodo popCoda() {
        Nodo tmp = head, tmp1 = null;
        if (isEmpty()) {
            if (length() == 1) {
                tmp = popTesta();
            } else {
                while (tmp.getNext() != null) {
                    tmp1 = tmp;
                    tmp = tmp.getNext();
                }
                tmp1.setNext(null);
            }
        }
        return tmp;
    }

    public Nodo popPos(Integer pos) {
        Nodo tmp = head, tmp1 = null;
        Integer posAttraversate = 0;
        if (isEmpty()) {
            while (posAttraversate < pos) {
                tmp1 = tmp;
                tmp = tmp.getNext();
            }
            tmp1.setNext(tmp.getNext());
            tmp.setNext(null);
        }
        return tmp1;
    }

    public Nodo top() {
        return head;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public Integer length() {
        Nodo temp = head;
        Integer c = 0;
        while (temp != null) {
            temp = temp.getNext();
            c++;
        }
        return c;
    }

    @Override
    public String toString() {
        String stampa = "Lista:{" + "\n";
        Nodo temp = head;
        while (temp != null) {
            stampa += temp.getInf() + "\n";
            temp = temp.getNext();
        }
        return stampa + "}" + "\n";
    }
}
