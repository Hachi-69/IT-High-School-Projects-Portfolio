package turilloluca;

import java.util.Arrays;

/**
 *
 * @author Turillo.Luca
 */
public class StazioneDiServizio {

    private String marca;
    private PuntoRifornimento[] elencoPunti;

    public StazioneDiServizio(String marca, PuntoRifornimento[] elencoPunti) {
        this.marca = marca;
        this.elencoPunti = elencoPunti;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public PuntoRifornimento[] getElencoPunti() {
        return elencoPunti;
    }

    public void setElencoPunti(PuntoRifornimento[] elencoPunti) {
        this.elencoPunti = elencoPunti;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", elencoPunti=" + Arrays.toString(elencoPunti);
    }

    public void erogaCaburanteDaPunto(Integer pos) {
        elencoPunti[pos].erogaCarburante();
    }

    public Integer contaPuntiRifornimentoLiberi() {
        Integer counter = 0;
        for (int i = 0; i < elencoPunti.length; i++) {
            if (elencoPunti[i].getOccupato() == false) {
                counter++;
            }
        }
        return counter;
    }

    public String elencaPuntiRifornimentoLiberi() {
        Integer pos = 0;
        String stringa = "";
        for (int i = 0; i < elencoPunti.length; i++) {
            if (elencoPunti[i].getOccupato() == false) {
                stringa += elencoPunti[i].getNumeroPostazione() + "; ";
            }
        }
        return stringa;
    }

    public Integer calcolaLitriVenduti(Integer pos) {
        return elencoPunti[pos].getNumeroLitriErogatiDaApertura();
    }

    public String trovaMigliorPunto() {
        Integer max = elencoPunti[0].getNumeroLitriErogatiDaApertura();
        Integer pos = 0;
        for (int i = 0; i < elencoPunti.length; i++) {
            if (elencoPunti[i].getNumeroLitriErogatiDaApertura() > max) {
                max = elencoPunti[i].getNumeroLitriErogatiDaApertura();
                pos = elencoPunti[i].getNumeroPostazione();
            }
        }
        return "Postazione migliore: " + pos + " Litri totali erogati: " + max;
    }

    public String trovaPeggiorPunto() {
        Integer min = elencoPunti[0].getNumeroLitriErogatiDaApertura();
        Integer pos = 0;
        for (int i = 0; i < elencoPunti.length; i++) {
            if (elencoPunti[i].getNumeroLitriErogatiDaApertura() < min) {
                min = elencoPunti[i].getNumeroLitriErogatiDaApertura();
                pos = elencoPunti[i].getNumeroPostazione();
            }
        }
        return "Postazione peggiore: " + pos + " Litri totali erogati: " + min;
    }

    public String rabboccaPuntoSottoSoglia() {
        String pos = "";
        for (int i = 0; i < elencoPunti.length; i++) {
            if (elencoPunti[i].getNumeroLitriAttuali() < 20) {
                elencoPunti[i].setNumeroLitriAttuali(elencoPunti[i].getNumeroMaxLitri());
                pos += elencoPunti[i].getNumeroPostazione() + "; ";
            }
        }
        return "Postazioni che sono state rabbocate: " + pos;
    }
}
