package turillolucacitta;

/**
 *
 * @author Turillo.Luca
 */
public class Citta {

    private String nome;
    private String regione;
    private Integer abitantiAttuali;

    public Citta(String nom, String reg, Integer abitantiAt) {
        nome = nom;
        regione = reg;
        abitantiAttuali = abitantiAt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        nome = nom;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String reg) {
        regione = reg;
    }

    public Integer getAbitantiAattuali() {
        return abitantiAttuali;
    }

    public void setAbitantiAattuali(Integer abitantiAt) {
        abitantiAttuali = abitantiAt;
    }

    @Override
    public String toString() {
        return "Citta': " + nome + "; Regione: " + regione + "; Abitanti attuali: " + abitantiAttuali;
    }

    public void aumentaAbitanti(Integer n) {
        if (n > 0 && n < 999999999) {
            abitantiAttuali += n;
        }
    }

    public void diminuisciAbitanti(Integer n) {
        if (n > 0 && n < 999999999) {
            abitantiAttuali -= n;
        }
    }
}
