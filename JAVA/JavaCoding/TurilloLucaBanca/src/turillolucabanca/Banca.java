package turillolucabanca;

/**
 *
 * @author Turillo.Luca
 */
public class Banca {

    private String nome;
    private String indirizzo;
    private ContoCorrente[] conti;

    public Banca(String nome, String indirizzo, ContoCorrente[] conti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.conti = conti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public ContoCorrente[] getConti() {
        return conti;
    }

    public void setConti(ContoCorrente[] conti) {
        this.conti = conti;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", indirizzo=" + indirizzo + ", conti=" + conti;
    }

    public Integer saldoMedio() {
        Integer somma = 0;
        Integer media = 0;

        for (int i = 0; i < conti.length; i++) {
            somma += conti[i].getSaldoAttuale();
        }
        return media = somma / conti.length;
    }

}
