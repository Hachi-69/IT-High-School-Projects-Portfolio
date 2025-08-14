package turillolucapilarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class Rettangolo {

    private Integer base, altezza, area, perimetro;

    public Rettangolo(Integer base, Integer altezza) {
        this.base = base;
        this.altezza = altezza;
        this.area = base * altezza;
        this.perimetro = (base + altezza) * 2;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltezza() {
        return altezza;
    }

    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Integer perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Base=" + base + " Altezza=" + altezza + ", Perimetro=" + perimetro + " Area=" + area;
    }

}
