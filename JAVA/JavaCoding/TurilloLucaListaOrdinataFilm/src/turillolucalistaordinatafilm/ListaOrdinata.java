package turillolucalistaordinatafilm;

/**
 *
 * @author Turillo.Luca
 */
public class ListaOrdinata {

    private Nodo head;

    public ListaOrdinata() {
        this.head = null;
    }

    /**
     * Controllo se la lista e' vuota
     *
     * @return true, se la lista e' vuota, altrimenti false
     */
    public Boolean isEmpty() {
        return head == null;
    }

    /**
     * Conta gli elementi presenti all'interno della lista
     *
     * @return Integer, il numero di elementi presenti all'interno della lista
     */
    public Integer contaElementi() {
        Integer c = 0;
        Nodo tmp = head;
        while (tmp != null) {
            c++;
            tmp = tmp.getNext();
        }
        return c;
    }

    /**
     *
     * @return head
     */
    public Nodo top() {
        return head;
    }

    /**
     * Scorre la lista finche' la lista non e' vuota e finche' il parametro
     * passato "n" e' piu' grande di tmp
     *
     * @param n parametro passato, nodo che si vuole inserire
     * @return Integer, il numero di posizioni attraversate
     */
    private Integer contaPos(Nodo n) {
        Integer c = 0;
        Nodo tmp = head;
        while (tmp != null && n.getInf().compareTo(tmp.getInf()) == 1) {
            tmp = tmp.getNext();
            c++;
        }
        return c;
    }

    /**
     * mette all'interno della lista in modo ordinato il nodo passato, e decide
     * se fare il push in coda, testa oppure quello in posizione
     *
     * @param n, nodo passato che si vuole inserire
     */
    public void pushOrdinato(Nodo n) {
        if (contaPos(n) == 0) {
            pushTesta(n);
        } else if (contaPos(n) == contaElementi()) {
            pushCoda(n);
        } else {
            pushPos(n, contaPos(n));
        }
    }

    /**
     * mette il nodo sopra a tutta la lista
     *
     * @param n, nodo che si vuole inserire
     */
    private void pushTesta(Nodo n) {
        Nodo tmp = head;
        if (isEmpty()) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

    /**
     * mette il nodo sotto a tutta la lista
     *
     * @param n, nodo che si vuole inserire
     */
    private void pushCoda(Nodo n) {
        Nodo tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(n);
    }

    /**
     * mette il nodo nella posizione giusta in mezzo alla lista
     *
     * @param n, nodo che si vuole inserire
     * @param pos, posizione dove si vuole inserire il nodo
     */
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

    /**
     * estrazione di un Film, in testa, coda o in posizione
     *
     * @param f, Film da estrarre
     * @return nodo estratto
     */
    public Nodo pop(Film f) {
        Nodo nodo = new Nodo(f);
        Nodo estratto = null;
        Integer pos = cercaNodo(nodo);
        if (pos == 0) {
            estratto = popTesta();
        } else if (pos == contaElementi()) {
            estratto = popCoda();
        } else if (pos != -1) {
            estratto = popPos(pos + 1);
        }
        return estratto;
    }

    /**
     * estrazione del nodo sopra tutta la lista
     *
     * @return nodo estratto
     */
    private Nodo popTesta() {
        Nodo tmp = head;
        if (!isEmpty()) {
            head = head.getNext();
            tmp.setNext(null);
        }
        return tmp;
    }

    /**
     * estrazione del nodo sotto tutta la lista
     *
     * @return nodo estratto
     */
    private Nodo popCoda() {
        Nodo tmp = head, tmp1 = null;
        while (tmp.getNext() != null) {
            tmp1 = tmp;
            tmp = tmp.getNext();
        }
        tmp1.setNext(null);
        return tmp;
    }

    /**
     * estrazione del nodo in posizione
     *
     * @param pos, posizione dove si vuole estrarre il nodo
     * @return nodo estratto
     */
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

    /**
     * cerca il nodo passato all'interno della lista
     *
     * @param n, nodo passato che si vuole cercare all'interno della lista
     * @return Integer, posizione del nodo cercato, -1 se non trovato
     */
    private Integer cercaNodo(Nodo n) {
        Nodo tmp = head;
        Integer posizioneNodo = 0;
        Boolean trovato = false;
        while (tmp != null && trovato == false) {
            if (n.getInf().equals(tmp.getInf())) {
                trovato = true;
            }
            if (!trovato) {
                tmp = tmp.getNext();
                posizioneNodo++;
            }
            if (tmp.getInf().compareTo(n.getInf()) == 1) {
                tmp = null;
            }
        }
        if (!trovato) {
            posizioneNodo = -1;
        }
        return posizioneNodo;
    }

    /**
     * stampa di tutta la lista
     *
     * @return String, l'intera lista
     */
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
