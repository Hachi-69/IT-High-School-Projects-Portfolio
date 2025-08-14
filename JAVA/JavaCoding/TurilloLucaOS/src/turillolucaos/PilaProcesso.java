package turillolucaos;

public class PilaProcesso {

    private Processo[] elements;
    private Integer head;

    public PilaProcesso(Integer dim) {
        elements = new Processo[dim];
        head = -1;
    }

    public Boolean push(Processo num) {
        if (isFull()) {
            return false;
        } else {
            head++;
            elements[head] = num;
            return true;
        }
    }

    public Processo pop() {
        if (isEmpty()) {
            return null;
        } else {
            Processo elem = elements[head];
            elements[head] = null;
            head--;
            return elem;
        }
    }

    public Processo top() {
        if (isEmpty()) {
            return null;
        } else {
            return elements[head];
        }
    }

    public Boolean isFull() {
        return head == elements.length - 1;
    }

    public Boolean isEmpty() {
        return head == -1;
    }

    @Override
    public String toString() {
        String ris = "";
        if (isEmpty()) {
            ris = "La pila e vuota";
        } else {
            for (int i = head; i >= 0; i--) {
                ris += " " + elements[i].toString() + "\n";
            }
        }
        return ris;
    }

    public Processo[] getElements() {
        return elements;
    }

    public void setElements(Processo[] elements) {
        this.elements = elements;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

}
