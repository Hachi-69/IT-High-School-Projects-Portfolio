package turillolucapersone;

/**
 *
 * @author Turillo.Luca
 */
public class Persona {

    private String nome;
    private String cognome;
    private Integer eta;

    public Persona(String nom, String cogn, Integer ett) {
        nome = nom;
        cognome = cogn;
        eta = ett;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        nome = nom;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cogn) {
        cognome = cogn;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer ett) {
        eta = ett;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "; Cognome: " + cognome + "; Eta: " + eta;
    }

    public void invecchia() {
        eta++;
    }

    public Boolean isMaggiorenne() {
        Boolean magg = false;
        if (eta >= 18) {
            magg = true;
        }
        return magg;
    }

}
