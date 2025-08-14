package turillolucalistaordinata;

/**
 *
 * @author Turillo.Luca
 */
public class ListaOrdinata {

    private Nodo head;

    public ListaOrdinata() {
        this.head = null;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public Integer contaElementi() {
        Integer c = 0;
        Nodo tmp = head;
        while (tmp != null) {
            c++;
            tmp = tmp.getNext();
        }
        return c;
    }

    public Nodo top() {
        return head;
    }

    private Integer contaPos(Nodo n) {
        Integer c = 0;
        Nodo tmp = head;
        while (tmp != null && n.getInf() > tmp.getInf()) {
            tmp = tmp.getNext();
            c++;
        }
        return c;
    }

    public void pushOrdinato(Nodo n) {
        if (contaPos(n) == 0) {
            pushTesta(n);
        } else if (contaPos(n) == contaElementi()) {
            pushCoda(n);
        } else {
            pushPos(n, contaPos(n));
        }
    }

    private void pushTesta(Nodo n) {
        Nodo tmp = head;
        if (isEmpty()) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

    private void pushCoda(Nodo n) {
        Nodo tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(n);
    }

    private void pushPos(Nodo n, Integer pos) {
        Nodo tmp = head;
        Integer c = 0;
        while (c < pos - 1) {
            c++;
            tmp = tmp.getNext();
        }
        n.setNext(tmp.getNext());
        tmp.setNext(n);
    }

    public Nodo pop(Integer n) {
        Nodo nodo = new Nodo(n);
        Nodo estratto = null;
        Integer pos = cercaNodo(nodo);
        if (pos == 0) {
            estratto = popTesta();
        } else if (pos == contaElementi()) {
            estratto = popCoda();
        } else if (pos != 1) {
            estratto = popPos(pos + 1);
        }
        return estratto;
    }

    private Nodo popTesta() {
        Nodo tmp = head;
        if (!isEmpty()) {
            head = head.getNext();
            tmp.setNext(null);
        }
        return tmp;
    }

    private Nodo popCoda() {
        Nodo tmp = head, tmp1 = null;
        while (tmp.getNext() != null) {
            tmp1 = tmp;
            tmp = tmp.getNext();
        }
        tmp1.setNext(null);
        return tmp;
    }

    private Nodo popPos(Integer pos) {
        Nodo tmp = head, tmp1 = null;
        Integer c = 0;
        while (c < pos - 1) {
            c++;
            tmp1 = tmp;
            tmp = tmp.getNext();
        }
        tmp1.setNext(tmp.getNext());
        tmp.setNext(null);
        return tmp;
    }

    private Integer cercaNodo(Nodo n) {
        Nodo tmp = head;
        Integer posNodo = -1;
        Boolean trovato = false;
        while (tmp != null && tmp.getInf() <= n.getInf()) {
            if (tmp.getInf() == n.getInf()) {
                trovato = true;
            }
            tmp = tmp.getNext();
            posNodo++;
        }
        if (!trovato) {
            posNodo = -1;
        }
        return posNodo;
    }

    @Override
    public String toString() {
        String s = "";
        Nodo tmp = head;
        while (tmp != null) {
            s += tmp.toString() + "\n";
            tmp = tmp.getNext();
        }
        return s;
    }

}
