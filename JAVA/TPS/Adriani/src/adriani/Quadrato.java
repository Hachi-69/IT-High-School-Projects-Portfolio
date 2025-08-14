package adriani;

import java.util.ArrayList;

/**
 *
 * @author Luca
 */
public class Quadrato extends FiguraGeometrica {

    private Integer lato;

    public Quadrato(Integer lato, ArrayList<Integer> lati) {
        super(lati);
        this.lato = lato;
    }
}
