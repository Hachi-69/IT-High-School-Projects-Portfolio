package turillolucaplaylist;

/**
 *
 * @author Turillo.Luca
 */
public class Playlist {

    private String nome;
    private Double durata;
    private Integer numeroTracce;
    private Integer tracciaAttuale;

    /**
     * Metodo costruttore per assegnare i valore iniziali
     * @param nom
     * @param dur
     * @param nTra
     * @param traAtt 
     */  
    public Playlist(String nom, Double dur, Integer nTra, Integer traAtt) {
        nome = nom;
        durata = dur;
        numeroTracce = nTra;
        tracciaAttuale = traAtt;
    }
/**
 * Metodo get restituisce
 * @return nome
 */
    public String getNome() {
        return nome;
    }
/**
 * Metodo set cambia il valore del parametro
 * @param nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * Metodo get restituisce
 * @return durata
 */
    public Double getDurata() {
        return durata;
    }
/**
 * Metodo set cambia il valore del parametro
 * @param durata 
 */
    public void setDurata(Double durata) {
        this.durata = durata;
    }
/**
 * Metodo get restituisce
 * @return numeroTracce
 */
    public Integer getNumeroTracce() {
        return numeroTracce;
    }
/**
 * Metodo set cambia il valore del parametro
 * @param numeroTracce 
 */
    public void setNumeroTracce(Integer numeroTracce) {
        this.numeroTracce = numeroTracce;
    }
/**
 * Metodo get restituisce
 * @return tracciaAttuale
 */
    public Integer getTracciaAttuale() {
        return tracciaAttuale;
    }
/**
 * Metodo set cambia il valore del parametro
 * @param tracciaAttuale 
 */
    public void setTracciaAttuale(Integer tracciaAttuale) {
        this.tracciaAttuale = tracciaAttuale;
    }
/**
 * Metodo toString() 
 * @return stringa
 */
    @Override
    public String toString() {
        return "nome=" + nome + ", durata=" + durata + ", numeroTracce=" + numeroTracce + ", tracciaAttuale=" + tracciaAttuale;
    }
/**
 * avanza di 1 la traccia attuale
 */
    public void avanzaTraccia() {
        if (tracciaAttuale < numeroTracce) {
            tracciaAttuale += 1;
        }

    }
/**
 * torna indietro di 1 la traccia attuale
 */
    public void indietroTraccia() {
        if (tracciaAttuale > 0) {
            tracciaAttuale -= 1;
        }

    }
/**
 * va alla traccia del parametro
 * @param n
 * @return Boolean
 */
    public Boolean vaiATraccia(Integer n) {
        return n > 0 && n < numeroTracce;

    }
}
