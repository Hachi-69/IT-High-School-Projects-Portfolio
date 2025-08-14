package adriani;

import java.util.ArrayList;

/**
 *
 * @author Luca
 */
public abstract class FiguraGeometrica {

    private ArrayList<Integer> lati;

    public FiguraGeometrica(ArrayList<Integer> lati) {
        this.lati = lati;
    }

    public Double perimetro() {
        Double somma = 0.0;
        for (Integer lati1 : lati) {
            somma += lati1;
        }
        return somma;
    }
}
