package turillolucapartita;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class Partita {

    protected String squadraCasa;
    protected String squadraOspite;
    protected Data dataPartita;

    public Partita(String squadraCasa, String squadraOspite, Data dataPartita) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.dataPartita = dataPartita;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        if (squadraCasa != null) {
            this.squadraCasa = squadraCasa;
        }
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        if (squadraOspite != null) {
            this.squadraOspite = squadraOspite;
        }
    }

    public Data getDataPartita() {
        return dataPartita;
    }

    public void setDataPartita(Data dataPartita) {
        if (dataPartita != null) {
            this.dataPartita = dataPartita;
        }
    }

    @Override
    public String toString() {
        return "squadraCasa=" + squadraCasa + ", squadraOspite=" + squadraOspite + ", dataPartita=" + dataPartita.toString();
    }

    public boolean equals(Partita p) {
        return (squadraCasa.compareTo(p.getSquadraCasa()) == 0 && squadraOspite.compareTo(p.getSquadraOspite()) == 0 && dataPartita.equas(p.getDataPartita()));
    }

    public Integer compareTo(Partita p) {
        if (this.dataPartita.compareTo(p.getDataPartita()) < 0) {
            return -1;
        }
        if (this.dataPartita.compareTo(p.getDataPartita()) > 0) {
            return 1;
        }
        if (this.squadraCasa.compareTo(p.getSquadraCasa()) < 0) {
            return -1;
        }
        if (this.squadraCasa.compareTo(p.getSquadraCasa()) > 0) {
            return 1;
        }
        if (this.squadraOspite.compareTo(p.getSquadraOspite()) < 0) {
            return -1;
        }
        if (this.squadraOspite.compareTo(p.getSquadraOspite()) > 0) {
            return 1;
        }
        return 0;
    }

    public Boolean isNull() {
        if (dataPartita == null || squadraOspite == null || squadraCasa == null
                || squadraOspite.equals(squadraCasa) || squadraCasa.trim().isEmpty()
                || squadraOspite.trim().isEmpty()) {
            setNull();
            return true;
        }
        return false;
    }

    protected void setNull() {
        dataPartita = null;
        squadraOspite = null;
        squadraCasa = null;
    }
}
