package turillolucamuseo;

/**
 * 
 * @author Turillo.Luca
 */
public class Museo {

    private String nome;
    private Integer costoBiglietto;
    private Integer capacitaMassima;
    private Integer numeroVisitatoriAttuali;
    private Integer numeroVisitatoriDaApertura;
    private Integer incassoDaApertura;
    private Boolean aperto;

    /**
     * Costruttore parametrizzato
     *
     * @param nome
     * @param costoBiglietto
     * @param capacitaMassima
     */
    public Museo(String nome, Integer costoBiglietto, Integer capacitaMassima) {
        this.nome = nome;
        this.costoBiglietto = costoBiglietto;
        this.capacitaMassima = capacitaMassima;
        this.numeroVisitatoriAttuali = 0;
        this.numeroVisitatoriDaApertura = 0;
        this.incassoDaApertura = 0;
        this.aperto = false;
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
     * @return costoBiglietto
     */
    public Integer getCostoBiglietto() {
        return costoBiglietto;
    }

    /**
     * Setta il valore della variabile
     *
     * @param costoBiglietto
     */
    public void setCostoBiglietto(Integer costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return capacitaMassima
     */
    public Integer getCapacitaMassima() {
        return capacitaMassima;
    }

    /**
     * Setta il valore della variabile
     *
     * @param capacitaMassima
     */
    public void setCapacitaMassima(Integer capacitaMassima) {
        this.capacitaMassima = capacitaMassima;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return numeroVisitatoriAttuali
     */
    public Integer getNumeroVisitatoriAttuali() {
        return numeroVisitatoriAttuali;
    }

    /**
     * Setta il valore della variabile
     *
     * @param numeroVisitatoriAttuali
     */
    public void setNumeroVisitatoriAttuali(Integer numeroVisitatoriAttuali) {
        this.numeroVisitatoriAttuali = numeroVisitatoriAttuali;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return numeroVisitatoriDaApertura
     */
    public Integer getNumeroVisitatoriDaApertura() {
        return numeroVisitatoriDaApertura;
    }

    /**
     * Setta il valore della variabile
     *
     * @param numeroVisitatoriDaApertura
     */
    public void setNumeroVisitatoriDaApertura(Integer numeroVisitatoriDaApertura) {
        this.numeroVisitatoriDaApertura = numeroVisitatoriDaApertura;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return incassoDaApertura
     */
    public Integer getIncassoDaApertura() {
        return incassoDaApertura;
    }

    /**
     * Setta il valore della variabile
     *
     * @param incassoDaApertura
     */
    public void setIncassoDaApertura(Integer incassoDaApertura) {
        this.incassoDaApertura = incassoDaApertura;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return aperto
     */
    public Boolean getAperto() {
        return aperto;
    }

    /**
     * Setta il valore della variabile
     *
     * @param aperto
     */
    public void setAperto(Boolean aperto) {
        this.aperto = aperto;
    }

    /**
     * Restituisce il valore della variabile
     *
     * @return valore di tutti gli attributi
     */
    @Override
    public String toString() {
        return "nome=" + nome + ", costoBiglietto=" + costoBiglietto + ", capacitaMassima=" + capacitaMassima + ", numeroVisitatoriAttuali=" + numeroVisitatoriAttuali + ", numeroVisitatoriDaApertura=" + numeroVisitatoriDaApertura + ", incassoDaApertura=" + incassoDaApertura + ", aperto=" + aperto;
    }

    /**
     * Fa entrare un visitatore all'interno del museo
     */
    public void entrataVisitatori() {
        if (aperto) {
            if (numeroVisitatoriAttuali < capacitaMassima) {
                numeroVisitatoriDaApertura++;
                numeroVisitatoriAttuali++;
                incassoDaApertura += costoBiglietto;
            }

        }

    }

    /**
     * Fa uscire un visitatore dal museo
     */
    public void uscitaVisitatori() {
        if (aperto) {
            if (numeroVisitatoriAttuali > 0) {
                numeroVisitatoriAttuali--;
            }

        }

    }

    /**
     * Apre al pubblico il museo
     */
    public void apriMuseo() {
        aperto = true;
    }

    /**
     * Chiude al pubblico il museo
     */
    public void chiudiMuseo() {
        if (numeroVisitatoriAttuali == 0) {
            aperto = false;
        }

    }

}