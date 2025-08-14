package turillolucatxt;

/**
 *
 * @author Turillo.Luca
 */
public class Persona {

    private String nome, cognome;
    private Integer eta;

    public Persona(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta;
    }

}
