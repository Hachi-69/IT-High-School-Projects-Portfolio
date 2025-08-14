package turillolucastudente;

import java.util.Arrays;

/**
 *
 * @author Turillo.Luca
 */
public class Studente {

    private String nome;
    private String cognome;
    private Double media;
    private Integer[] voti;

    public Studente(String nome, String cognome, Integer[] voti) {
        this.nome = nome;
        this.cognome = cognome;
        this.voti = voti;
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

    public Integer[] getVoti() {
        return voti;
    }

    public void setVoti(Integer[] voti) {
        this.voti = voti;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Cognome=" + cognome + ", Media=" + media + ", Voti=" + Arrays.toString(voti);
    }

}
