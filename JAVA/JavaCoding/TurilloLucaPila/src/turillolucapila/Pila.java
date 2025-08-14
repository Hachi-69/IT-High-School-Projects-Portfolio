package turillolucapila;

import java.util.Arrays;

public class Pila {

    private final Integer[] elementi;
    private Integer head;

    public Pila(Integer dimensione) {
        elementi = new Integer[dimensione];
        head = -1;
    }

    public Boolean push(Integer num) {
        if (isFull()) {
            return false;
        } else {
            head++;
            elementi[head] = num;
            return true;
        }
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        } else {
            Integer elem = elementi[head];
            elementi[head] = null;
            head--;
            return elem;
        }
    }

    public Integer top() {
        if (isEmpty()) {
            return null;
        } else {
            return elementi[head];
        }
    }

    public Boolean isFull() {
        if (head == elementi.length - 1) {
            return true;
        }
        return false;
    }

    public Boolean isEmpty() {
        if (head == -1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "elementi =" + Arrays.toString(elementi);
    }

}
