package guerriniturillorosminilavoro;

public class Studente {
    private String nome;
    private String cognome;
    private Double media;
    private Double mediaTot;

    public Studente(String nome, String cognome, Double media) {
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
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

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getMediaTot() {
        return mediaTot;
    }

    public void setMediaTot(Double mediaTot) {
        this.mediaTot = mediaTot;
    }

    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", media=" + media + ", mediaTot=" + mediaTot + '}';
    }
    
    
}
