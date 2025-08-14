package turillolucanodoalbum;

public class PilaArray {

    private Album[] elements;
    private final Integer dim;
    private Integer head;

    public PilaArray(Integer dim) {
        elements = new Album[dim];
        head = -1;
        this.dim = dim;
    }

    public Boolean push(Album num) {
        if (isFull()) {
            return false;
        } else {
            head++;
            elements[head] = num;
            return true;
        }
    }

    public Album pop() {
        if (isEmpty()) {
            return null;
        } else {
            Album elem = elements[head];
            elements[head] = null;
            head--;
            return elem;
        }
    }

    public String top() {
        if (isEmpty()) {
            return null;
        } else {
            String ris = "";
            return " Nome: " + elements[head].getNome() + " Durata: " + elements[head].getDurata() + " Numero tracce: " + elements[head].getnTracce() + " Costo: " + elements[head].getCosto() + "\n";
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
                ris += " Nome: " + elements[i].getNome() + " Durata: " + elements[i].getDurata() + " Numero tracce: " + elements[i].getnTracce() + " Costo: " + elements[i].getCosto() + "\n";
            }
        }
        return ris;
    }

    public Album[] getElements() {
        return elements;
    }

    public void setElements(Album[] elements) {
        this.elements = elements;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

}
