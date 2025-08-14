package turillolucapartita;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class PartitaGiocata extends Partita {

    private Integer golCasa;
    private Integer golTrasferta;
    private Integer puntiCasa;
    private Integer puntiTrasferta;
    private Integer durata;

    public PartitaGiocata(Integer golCasa, Integer golTrasferta, Integer durata, String squadraCasa, String squadraOspite, Data dataPartita) {
        super(squadraCasa, squadraOspite, dataPartita);
        this.golCasa = golCasa;
        this.golTrasferta = golTrasferta;
        this.puntiCasa = 0;
        this.puntiTrasferta = 0;
        this.durata = durata;
        calcolaPunti();
    }

    public Integer getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(Integer golCasa) {
        if (golCasa != null) {
            this.golCasa = golCasa;
            calcolaPunti();
        }
    }

    public Integer getGolTrasferta() {
        return golTrasferta;
    }

    public void setGolTrasferta(Integer golTrasferta) {
        if (golTrasferta != null) {
            this.golTrasferta = golTrasferta;
            calcolaPunti();
        }
    }

    public Integer getPuntiCasa() {
        return puntiCasa;
    }

    public void setPuntiCasa(Integer puntiCasa) {
        if (puntiCasa != null) {
            this.puntiCasa = puntiCasa;
        }
    }

    public Integer getPuntiTrasferta() {
        return puntiTrasferta;
    }

    public void setPuntiTrasferta(Integer puntiTrasferta) {
        if (puntiTrasferta != null) {
            this.puntiTrasferta = puntiTrasferta;
        }
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        if (durata != null) {
            this.durata = durata;
        }
    }

    @Override
    public String toString() {
        return "golCasa=" + golCasa + ", golTrasferta=" + golTrasferta + ", puntiCasa=" + puntiCasa + ", puntiTrasferta=" + puntiTrasferta + ", Durata=" + durata;
    }

    public boolean equals(PartitaGiocata p) {
        return (golCasa.compareTo(p.getGolCasa()) == 0 && golTrasferta.compareTo(p.getGolTrasferta()) == 0
                && puntiCasa.compareTo(p.getPuntiCasa()) == 0 && puntiTrasferta.compareTo(p.getPuntiTrasferta()) == 0
                && durata.compareTo(p.getDurata()) == 0);
    }

    @Override
    public Integer compareTo(Partita p) {
        return super.compareTo(p);
    }

    @Override
    public Boolean isNull() {
        if (super.isNull() || puntiCasa == null || puntiTrasferta == null || golCasa == null || golTrasferta == null || durata == null) {
            setNull();
            return true;
        }
        return false;
    }

    @Override
    protected void setNull() {
        super.setNull();
        puntiCasa = null;
        puntiTrasferta = null;
        golCasa = null;
        golTrasferta = null;
        durata = null;
    }

    private void calcolaPunti() {
        if (golCasa > golTrasferta) {
            puntiCasa++;
        } else if (golCasa < golTrasferta) {
            puntiTrasferta++;
        }
    }
}
