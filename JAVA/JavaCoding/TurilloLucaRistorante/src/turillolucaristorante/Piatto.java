package turillolucaristorante;

/**
 *
 * @author Turillo.Luca
 */
public class Piatto {

    private String nome;
    private String tipo;
    private Double prezzo;
    private Integer numeroOrdinazioni;

    public Piatto(String nome, String tipo, Double prezzo) {
        this.nome = nome;
        this.tipo = tipo;
        this.prezzo = prezzo;
        this.numeroOrdinazioni = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getNumeroOrdinazioni() {
        return numeroOrdinazioni;
    }

    public void setNumeroOrdinazioni(Integer numeroOrdinazioni) {
        this.numeroOrdinazioni = numeroOrdinazioni;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", tipo=" + tipo + ", prezzo=" + prezzo + ", numeroOrdinazioni=" + numeroOrdinazioni;
    }

    public void ordina() {
        numeroOrdinazioni++;
    }
}
