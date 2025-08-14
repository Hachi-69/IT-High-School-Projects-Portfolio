package turillolucaos;

/**
 *
 * @author turillo.luca
 */
public class ProcessoCoda {

    private Processo[] elementi;
    private Integer tail;

    public ProcessoCoda(Integer dimensione) {
        this.elementi = new Processo[dimensione];
        this.tail = -1;
    }

    public Processo[] getElementi() {
        return elementi;
    }

    public void setElementi(Processo[] elementi) {
        this.elementi = elementi;
    }

    public Integer getTail() {
        return tail;
    }

    public void setTail(Integer tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        String ris = "";
        if (isEmpty()) {
            ris = "La coda e' vuota";
        } else {
            for (int i = tail; i >= 0; i--) {
                ris += " " + elementi[i].toString() + "\n";
            }
        }
        return ris;
    }

    public Boolean push(Processo num) {
        if (isFull()) {
            return false;
        } else {
            tail++;
            elementi[tail] = num;
            return true;
        }
    }

    public Processo pop() {
        if (isEmpty()) {
            return null;
        } else {
            Processo elem = elementi[0];
            elementi[0] = null;
            for (int i = 0; i < elementi.length - 1; i++) {
                elementi[i] = elementi[i + 1];
            }
            elementi[tail] = null;
            tail--;
            return elem;
        }
    }

    public Processo top() {
        if (isEmpty()) {
            return null;
        } else {
            return elementi[0];
        }
    }

    public Boolean isEmpty() {
        return tail == -1;
    }

    public Boolean isFull() {
        return tail == elementi.length - 1;
    }

}
