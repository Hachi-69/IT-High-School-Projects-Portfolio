package testserializzazione;

/**
 *
 * @author Turillo.Luca
 */
import java.io.Serializable;

public class Prodotto implements Serializable {

    private String cod;
    private String nome;

    public Prodotto(String cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "COD: " + cod + " , Nome: " + nome;
    }

}
