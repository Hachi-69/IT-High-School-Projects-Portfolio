package turillolucasquadra;

import java.util.Arrays;

/**
 *
 * @author Turillo.Luca
 */
public class Squadra {

    private String nome;
    private Calciatore[] rosa;

    public Squadra(String nome, Calciatore[] rosa) {
        this.nome = nome;
        this.rosa = rosa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calciatore[] getRosa() {
        return rosa;
    }

    public void setRosa(Calciatore[] rosa) {
        this.rosa = rosa;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", rosa=" + Arrays.toString(rosa);
    }

    public Integer goalTotali() {
        Integer tot = 0;
        for (int i = 0; i < rosa.length; i++) {
            tot += rosa[i].getGoal();
        }
        return tot;
    }

    public Integer giocatorePiuGoal() {
        Integer max = 0;
        for (int i = 0; i < rosa.length - 1; i++) {
            max = Math.max(rosa[i].getGoal(), rosa[i + 1].getGoal());
        }
        return max;
    }

    public Integer giocatoreMenoGoal() {
        Integer min = 0;
        for (int i = 0; i < rosa.length - 1; i++) {
            min = Math.min(rosa[i].getGoal(), rosa[i + 1].getGoal());
        }
        return min;
    }

    public Integer giocatorePiuPresenze() {
        Integer max = 0;
        for (int i = 0; i < rosa.length - 1; i++) {
            max = Math.min(rosa[i].getPresenze(), rosa[i + 1].getPresenze());
        }
        return max;
    }

    public Integer giocatoreMenoPresenze() {
        Integer min = 0;
        for (int i = 0; i < rosa.length - 1; i++) {
            min = Math.min(rosa[i].getPresenze(), rosa[i + 1].getPresenze());
        }
        return min;
    }

}
