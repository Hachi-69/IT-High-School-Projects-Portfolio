package turillolucacoda;

import java.util.Arrays;

/**
 *
 * @author turillo.luca
 */
public class Coda {

    private Integer[] elementi;
    private Integer tail;

    public Coda(Integer dimensione) {
        this.elementi = new Integer[dimensione];
        this.tail = -1;
    }

    public Integer[] getElementi() {
        return elementi;
    }

    public void setElementi(Integer[] elementi) {
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
        return "elementi=" + Arrays.toString(elementi) + ", tail=" + tail;
    }

    public Boolean push(Integer num) {
        if (isFull()) {
            return false;
        } else {
            tail++;
            elementi[tail] = num;
            return true;
        }
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        } else {
            Integer elem = elementi[0];
            elementi[0] = null;
            for (int i = 0; i < elementi.length - 1; i++) {
                elementi[i] = elementi[i + 1];
            }
            elementi[tail] = null;
            tail--;
            return elem;
        }
    }

    public Integer top() {
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
