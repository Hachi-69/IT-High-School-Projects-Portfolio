package turillolucarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class ClassRettangolo {

    private Integer base, altezza, area, perimetro;

    public ClassRettangolo(Integer base, Integer altezza) {
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

}
