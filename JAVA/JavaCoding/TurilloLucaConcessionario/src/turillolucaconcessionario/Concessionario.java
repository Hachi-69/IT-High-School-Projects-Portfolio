package turillolucaconcessionario;

import java.util.Arrays;

/**
 *
 * @author Turillo Luca
 */
public class Concessionario {

    private String nome;
    private Auto[] elenco;

    public Concessionario(String nome, Auto[] elenco) {
        this.nome = nome;
        this.elenco = elenco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Auto[] getElenco() {
        return elenco;
    }

    public void setElenco(Auto[] elenco) {
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", elenco= " + Arrays.toString(elenco);
    }

    //a piacere\\
    public void vendiAuto(Integer pos) {
        if (elenco[pos].getMarca() != "") {
            elenco[pos].setPrezzo(0);
            elenco[pos].setMarca("");
            elenco[pos].setAnno(0);
            elenco[pos].setCarburante("");
        }
    }

    public void compraAuto(Integer pos, String marca, Integer anno, Integer prezzo, String carburante) {
        if (elenco[pos].getMarca() != "") {
            elenco[pos].setMarca(marca);
            elenco[pos].setAnno(anno);
            elenco[pos].setPrezzo(prezzo);
            elenco[pos].setCarburante(carburante);
        }
    }
}