package turillolucanodoalbum;

/**
 *
 * @author Turillo.Luca
 */
public class Album {

    private String nome;
    private Integer durata, nTracce;
    private Double costo;

    public Album(String nome, Integer durata, Integer nTracce, Double costo) {
        this.nome = nome;
        this.durata = durata;
        this.nTracce = nTracce;
        this.costo = costo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }

    public Integer getnTracce() {
        return nTracce;
    }

    public void setnTracce(Integer nTracce) {
        this.nTracce = nTracce;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", durata=" + durata + ", nTracce=" + nTracce + ", costo=" + costo + "\n";
    }

}
