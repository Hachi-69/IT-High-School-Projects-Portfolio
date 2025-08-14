package turillolucaconcessionario;

/**
 *
 * @author Turillo Luca
 */
public class Auto {

    private String marca;
    private Integer prezzo;
    private Integer anno;
    private String carburante;

    public Auto(String marca, Integer prezzo, Integer anno, String carburante) {
        this.marca = marca;
        this.prezzo = prezzo;
        this.anno = anno;
        this.carburante = carburante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String getCarburante() {
        return carburante;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    @Override
    public String toString() {
        return "marca= " + marca + ", prezzo= " + prezzo + ", anno= " + anno + ", carburante= " + carburante;
    }
}