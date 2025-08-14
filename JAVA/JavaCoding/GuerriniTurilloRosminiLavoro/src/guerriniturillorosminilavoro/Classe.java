package guerriniturillorosminilavoro;

import java.util.Arrays;

public class Classe {
    private Double mediaPerMateria;
    private Double mediaTotale;
    private Integer nDebitiPerMateria;
    private Integer numBocciati;
    private Studente[] elenco;

    public Classe(Double mediaPerMateria, Integer nDebitiPerMateria, Studente[] elenco) {
        this.mediaPerMateria = mediaPerMateria;
        this.nDebitiPerMateria = nDebitiPerMateria;
        this.elenco = elenco;
    }

    public Double getMediaPerMateria() {
        return mediaPerMateria;
    }

    public void setMediaPerMateria(Double mediaPerMateria) {
        this.mediaPerMateria = mediaPerMateria;
    }

    public Double getMediaTotale() {
        return mediaTotale;
    }

    public void setMediaTotale(Double mediaTotale) {
        this.mediaTotale = mediaTotale;
    }

    public Integer getnDebitiPerMateria() {
        return nDebitiPerMateria;
    }

    public void setnDebitiPerMateria(Integer nDebitiPerMateria) {
        this.nDebitiPerMateria = nDebitiPerMateria;
    }

    public Integer getNumBocciati() {
        return numBocciati;
    }

    public void setNumBocciati(Integer numBocciati) {
        this.numBocciati = numBocciati;
    }

    public Studente[] getElenco() {
        return elenco;
    }

    public void setElenco(Studente[] elenco) {
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        return "Classe{" + "mediaPerMateria=" + mediaPerMateria + ", mediaTotale=" + mediaTotale + ", nDebitiPerMateria=" + nDebitiPerMateria + ", numBocciati=" + numBocciati + ", elenco=" + Arrays.toString(elenco) + '}';
    }
    
    
}
