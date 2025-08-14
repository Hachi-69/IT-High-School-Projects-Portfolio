package turillolucacapoabbigliamento;

/**
 *
 * @author Turillo.Luca
 */
public class CapoAbbigliamento {

    private String marca;
    private Double prezzo;
    private Integer quantitaDisponibileMagazzino;
    private Integer quantitaMinimaDaAvereInMagazzino;

    public CapoAbbigliamento(String marca, Double prezzo, Integer quantitaDisponibileMagazzino, Integer quantitaMinimaDaAvereInMagazzino) {
        this.marca = marca;
        this.prezzo = prezzo;
        this.quantitaDisponibileMagazzino = quantitaDisponibileMagazzino;
        this.quantitaMinimaDaAvereInMagazzino = quantitaMinimaDaAvereInMagazzino;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getQuantitaDisponibileMagazzino() {
        return quantitaDisponibileMagazzino;
    }

    public void setQuantitaDisponibileMagazzino(Integer quantitaDisponibileMagazzino) {
        this.quantitaDisponibileMagazzino = quantitaDisponibileMagazzino;
    }

    public Integer getQuantitaMinimaDaAvereInMagazzino() {
        return quantitaMinimaDaAvereInMagazzino;
    }

    public void setQuantitaMinimaDaAvereInMagazzino(Integer quantitaMinimaDaAvereInMagazzino) {
        this.quantitaMinimaDaAvereInMagazzino = quantitaMinimaDaAvereInMagazzino;
    }

    @Override
    public String toString() {
        return "Marca=" + marca + ", Prezzo=" + prezzo + ", Quantita disponibile magazzino=" + quantitaDisponibileMagazzino + ", Quantita minima da avere in magazzino=" + quantitaMinimaDaAvereInMagazzino;
    }

    public void vendita(Integer nV) {
        if (quantitaDisponibileMagazzino - nV >= 0) {
            quantitaDisponibileMagazzino -= nV;
        }
        if (quantitaDisponibileMagazzino < quantitaMinimaDaAvereInMagazzino) {
            ordinaDaFornitore();
        }

    }

    public void faiReso(Integer nR) {
        quantitaDisponibileMagazzino += nR;
    }

    public void ordinaDaFornitore() {
        quantitaDisponibileMagazzino += 10;

    }
}
