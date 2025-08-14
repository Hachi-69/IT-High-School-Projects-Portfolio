package turillolucaristorante;

import java.util.Arrays;

/**
 *
 * @author Turillo.Luca
 */
public class Ristorante {

    private String nome;
    private Integer numTavoli;
    private Double incasso;
    private Piatto[] menu;

    public Ristorante(String nome, Integer numTavoli, Piatto[] menu) {
        this.nome = nome;
        this.numTavoli = numTavoli;
        this.incasso = 0.0;
        this.menu = menu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumTavoli() {
        return numTavoli;
    }

    public void setNumTavoli(Integer numTavoli) {
        this.numTavoli = numTavoli;
    }

    public Double getIncasso() {
        return incasso;
    }

    public void setIncasso(Double incasso) {
        this.incasso = incasso;
    }

    public Piatto[] getMenu() {
        return menu;
    }

    public void setMenu(Piatto[] menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", numTavoli=" + numTavoli + ", incasso=" + incasso + ", menu=" + Arrays.toString(menu);
    }

    /*
     A PIACERE
     public void UwU(){
    
     }
     */
}
