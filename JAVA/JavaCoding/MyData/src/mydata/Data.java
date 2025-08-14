package mydata;

import java.util.Arrays;
import java.util.Objects;

public class Data {

    private Integer giorno;
    private Integer mese;
    private Integer anno;
    private final Integer[] giorniMese = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Data(Integer giorno, Integer mese, Integer anno) {
        if (anno != null && mese != null && giorno != null) {
            this.giorno = giorno;
            this.mese = mese;
            this.anno = anno;
            if (anno >= 0) {
                isBisestile();
                if (!validaData()) {
                    annullaData();
                }
            } else {
                annullaData();
            }
        } else {
            annullaData();
        }
    }

    public Boolean isNull() {
        return anno == null || mese == null || giorno == null;
    }

    private void annullaData() {
        this.giorno = null;
        this.mese = null;
        this.anno = null;
    }

    private Boolean isBisestile() {
        if (anno % 400 == 0) {
            giorniMese[2] = 29;
            return true;
        } else if (anno % 4 == 0 && anno % 100 != 0) {
            giorniMese[2] = 29;
            return true;
        }
        giorniMese[2] = 28;
        return false;
    }

    private Boolean validaData() {
        if (anno >= 0) {
            if (mese >= 1 && mese <= 12) {
                if (giorno >= 1 && giorno <= giorniMese[mese]) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean equals(Data d) {
        return (Objects.equals(this.mese, d.mese) && Objects.equals(this.anno, d.anno) && Objects.equals(this.giorno, d.giorno));
    }

    public Integer compareTo(Data d) {
        return ((this.anno + "-" + this.mese + "-" + this.giorno).compareTo(d.anno + "-" + d.mese + "-" + d.giorno));
    }

    public void nextDay() {
        isBisestile();
        giorno++;
        if (this.giorno > this.giorniMese[mese]) {
            giorno = 1;
            mese++;
        }
        if (this.mese > 12) {
            mese = 1;
            anno++;
        }
    }

    public void nextDays(Integer nGiorni) {
        for (int i = 0; i < nGiorni; i++) {
            nextDay();
        }
    }

    /**
     * restituisce la distanza di giorni in integer
     *
     * @param d
     * @return
     */
    public Integer distanzaDays(Data d) {
        Integer c = 0;
        Data temp2 = new Data(d.giorno, d.mese, d.anno);
        Data temp = new Data(this.giorno, this.mese, this.anno);
        if (temp.compareTo(temp2) < 0) {
            while (temp.compareTo(temp2) != 0) {
                c++;
                temp.nextDay();
            }
        } else {
            while (temp2.compareTo(temp) != 0) {
                c++;
                temp2.nextDay();
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return "giorno=" + giorno + ", mese=" + mese + ", anno=" + anno;
    }

    /**
     * restituisce i giorni, mesi, anni di distanza in una stringa
     *
     * @param d
     * @return
     */
    public String distanzaDate(Data d) {
        isBisestile();
        Integer g = this.giorniMese[mese] - this.giorno;
        g += d.giorno;
        Integer m = 0;
        if (!Objects.equals(this.mese, d.mese)) {
            m = 11 - this.mese;
            m += d.mese;
        }
        Integer a = Math.abs(this.anno - d.anno);
        if (g >= giorniMese[this.mese]) {

            g -= giorniMese[this.mese];
            m++;
        }
        if (m >= 12) {
            m -= 12;
        } else {
            a -= 1;
        }
        return g + "/" + m + "/" + a;
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) {
        this.giorno = giorno;
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) {
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.giorno);
        hash = 83 * hash + Objects.hashCode(this.mese);
        hash = 83 * hash + Objects.hashCode(this.anno);
        hash = 83 * hash + Arrays.deepHashCode(this.giorniMese);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Data other = (Data) obj;
        if (!Objects.equals(this.giorno, other.giorno)) {
            return false;
        }
        if (!Objects.equals(this.mese, other.mese)) {
            return false;
        }
        if (!Objects.equals(this.anno, other.anno)) {
            return false;
        }
        if (!Arrays.deepEquals(this.giorniMese, other.giorniMese)) {
            return false;
        }
        return true;
    }

}
