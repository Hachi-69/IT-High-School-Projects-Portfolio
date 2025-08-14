package turillolucasquadra;

/**
 *
 * @author Turillo.Luca
 */
public class Calciatore {

    private String nome;
    private String cognome;
    private Integer eta;
    private Integer numeroMaglia;
    private String ruolo;
    private Integer presenze;
    private Integer goal;

    public Calciatore(String nome, String cognome, Integer eta, Integer numeroMaglia, String ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.numeroMaglia = numeroMaglia;
        this.ruolo = ruolo;
        this.presenze = 0;
        this.goal = 0;
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

    public Integer getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setNumeroMaglia(Integer numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public Integer getPresenze() {
        return presenze;
    }

    public void setPresenze(Integer presenze) {
        this.presenze = presenze;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGol(Integer goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        String r;
        if (ruolo.contains("Portiere")) {
            r = "Goal subiti";
        } else {
            r = "Goal segnati";
        }
        return "Nome=" + nome + ", Cognome=" + cognome + ", Eta=" + eta + ", Numero Maglia=" + numeroMaglia + ", Ruolo=" + ruolo + ", Presenze=" + presenze + ", " + r + "=" + goal;
    }

    public void gioca() {
        presenze++;
    }

    public void cambiaGol(Integer nGoal) {
        goal += nGoal;
    }
}
