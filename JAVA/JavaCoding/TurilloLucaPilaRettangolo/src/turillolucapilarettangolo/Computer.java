package turillolucapilarettangolo;

/**
 *
 * @author Turillo.Luca
 */
public class Computer {

    private Integer costo, pezziVenduti;
    private String marca, tipo;

    public Computer(Integer costo, String marca, String tipo, Integer pezziVenduti) {
        this.costo = costo;
        this.pezziVenduti = pezziVenduti;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getPezziVenduti() {
        return pezziVenduti;
    }

    public void setPezziVenduti(Integer pezziVenduti) {
        this.pezziVenduti = pezziVenduti;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Costo=" + costo + ", Pezzi venduti=" + pezziVenduti + ", Marca=" + marca + ", Tipo=" + tipo;
    }

}
