package turillolucarettangolo;

public class PilaArray {

    private ClassRettangolo[] elements;
    private final Integer dim;
    private Integer head;

    public PilaArray(Integer dim) {
        elements = new ClassRettangolo[dim];
        head = -1;
        this.dim = dim;
    }

    public Boolean push(ClassRettangolo num) {
        if (isFull()) {
            return false;
        } else {
            head++;
            elements[head] = num;
            return true;
        }
    }

    public ClassRettangolo pop() {
        if (isEmpty()) {
            return null;
        } else {
            ClassRettangolo elem = elements[head];
            elements[head] = null;
            head--;
            return elem;
        }
    }

    public String top() {
        if (isEmpty()) {
            return null;
        } else {
            return " Altezza: " + elements[head].getAltezza() + " Base: " + elements[head].getBase() + " Perimetro: " + elements[head].getPerimetro() + " Area: " + elements[head].getArea() + "\n";
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
            for (int i = 0; i < dim; i++) {
                ris += "Rettangolo N=" + i + " Altezza: " + elements[i].getAltezza() + " Base: " + elements[i].getBase() + " Perimetro: " + elements[i].getPerimetro() + " Area: " + elements[i].getArea() + "\n";
            }
        }
        return ris;
    }

    public ClassRettangolo[] getElements() {
        return elements;
    }

    public void setElements(ClassRettangolo[] elements) {
        this.elements = elements;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

}
