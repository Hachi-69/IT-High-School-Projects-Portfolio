package turillolucapilarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class PilaArray {

    private Computer[] elementi;
    private Integer head, dim;

    public PilaArray(Integer dim) {
        this.elementi = new Computer[dim];
        head = -1;
    }

    public Boolean push(Computer num) {
        if (isFull()) {
            return false;
        } else {
            head++;
            elementi[head] = num;
            return true;
        }
    }

    public Computer pop() {
        if (isEmpty()) {
            return null;
        } else {
            Computer elem = elementi[head];
            elementi[head] = null;
            head--;
            return elem;
        }
    }

    public String top() {
        if (isEmpty()) {
            return null;
        } else {
            return elementi[head].toString();
        }
    }

    public Boolean isEmpty() {
        return head == -1;
    }

    public Boolean isFull() {
        return head == elementi.length - 1;
    }

    @Override
    public String toString() {
        String ris = "Pila:{" + "\n";
        for (int i = head; i >= 0; i--) {
            ris += "" + elementi[i];
            if (i != 0) {
                ris += "," + "\n";
            }
        }
        return ris + "\n" + "}" + "\n";
    }

    public Computer[] getElementi() {
        return elementi;
    }

    public Integer getHead() {
        return head;
    }

}
