package turillolucacodanodoarrayverifica;

/**
 *
 * @author Turillo.Luca
 */
public class CodaArray {

    private OperazioneBancaria[] elementi;
    private Integer tail;

    public CodaArray(Integer dim) {
        this.elementi = new OperazioneBancaria[dim];
        tail = -1;
    }

    /**
     * inserisce in coda il parametro passato di tipo OperazioneBancaria
     *
     * @param num variabile di tipo OperazioneBancaria che voglio inserire in
     * coda
     * @return true se l'operazione e' possibile, altrimenti false
     */
    public Boolean push(OperazioneBancaria num) {
        if (isFull()) {
            return false;
        } else {
            tail++;
            elementi[tail] = num;
            return true;
        }
    }

    /**
     * elimina l'oggetto di tipo OperazioneBancaria in testa
     *
     * @return elem, se la coda non e' vuota restituissce l'oggetto eliminato,
     * altrimenti null
     */
    public OperazioneBancaria pop() {
        if (isEmpty()) {
            return null;
        } else {
            OperazioneBancaria elem = elementi[0];
            elementi[0] = null;
            for (int i = 0; i < elementi.length - 1; i++) {
                elementi[i] = elementi[i + 1];
            }
            elementi[tail] = null;
            tail--;
            return elem;
        }
    }

    /**
     *
     * @return null se la coda e' vuota, altrimenti l'elemento in testa
     */
    public String top() {
        if (isEmpty()) {
            return null;
        } else {
            return elementi[0].toString();
        }
    }

    /**
     *
     * @return true se la coda e' vuota, altrimenti false
     */
    public Boolean isEmpty() {
        return tail == -1;
    }

    /**
     *
     * @return true se la coda e' piena, altrimenti false
     */
    public Boolean isFull() {
        return tail == elementi.length - 1;
    }

    /**
     * stampa l'intera coda
     *
     * @return una stringa contenente l'intera coda
     */
    @Override
    public String toString() {
        String stampa = "Coda:{" + "\n";
        for (int i = 0; i <= tail; i++) {
            stampa += elementi[i] + "," + "\n";
        }
        return stampa + "\n" + "}" + "\n";
    }

    /**
     *
     * @return L'array elementi di tipo OperazioneBancaria[]
     */
    public OperazioneBancaria[] getElementi() {
        return elementi;
    }

    /**
     *
     * @return La coda
     */
    public Integer getTail() {
        return tail;
    }
}
