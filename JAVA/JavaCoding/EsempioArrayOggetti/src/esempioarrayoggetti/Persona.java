package esempioarrayoggetti;

/**
 *
 * @author Tassi Francesco
 */
public class Persona {

    private String nome;
    private Integer eta;

    /**
     * Costruttore parametrizzato
     *
     * @param nome
     * @param eta
     */
    public Persona(String nome, Integer eta) {
        this.nome = nome;
        this.eta = eta;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setta il valore della variabile
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return eta
     */
    public Integer getEta() {
        return eta;
    }

    /**
     * Setta il valore della variabile
     *
     * @param eta
     */
    public void setEta(Integer eta) {
        this.eta = eta;
    }

    /**
     * Stampa il valore di tutti gli attributi
     *
     * @return nome,eta
     */
    @Override
    public String toString() {
        return "nome= " + nome + ", eta= " + eta;
    }

    /**
     * Controlla se la persona e' maggiorenne
     *
     * @return true se e' maggiorenne, false se e' minorenne
     */
    public Boolean isMaggiorenne() {
        if (eta >= 18) {
            return true;
        }
        return false;
    }
}
