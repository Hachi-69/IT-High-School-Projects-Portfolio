package turillolucaevento;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class EventoSvolto extends Evento {

    private Data dataSvolgimento;
    private Integer nPartecipanti;
    private Integer distPub;

    public EventoSvolto(Data dataSvolgimento, Integer nPartecipanti, String nome, String luogo, Data dataPub, String genere) {
        super(nome, luogo, dataPub, genere);
        this.dataSvolgimento = dataSvolgimento;
        this.nPartecipanti = nPartecipanti;
        this.distPub = dataSvolgimento.distanzaDays(dataPub);
        if (isNull()) {
            setNull();
        }
    }

    public Data getDataSvolgimento() {
        return dataSvolgimento;
    }

    public void setDataSvolgimento(Data dataSvolgimento) {
        if (nome != null) {
            this.dataSvolgimento = dataSvolgimento;
        }
    }

    public Integer getnPartecipanti() {
        return nPartecipanti;
    }

    public void setnPartecipanti(Integer nPartecipanti) {
        if (nPartecipanti != null) {
            this.nPartecipanti = nPartecipanti;
        }
    }

    public Integer getDistPub() {
        return distPub;
    }

    public void setDistPub(Integer distPub) {
        if (distPub != null) {
            this.distPub = distPub;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Data Svolgimento=" + dataSvolgimento.toString() + ", Numero Partecipanti=" + nPartecipanti + ", Dist Pubblicazione=" + distPub;
    }

    public boolean equals(EventoSvolto e) {
        return (super.equals(e) && dataSvolgimento.compareTo(e.getDataSvolgimento()) == 0 || nPartecipanti.compareTo(e.getnPartecipanti()) == 0 || distPub.compareTo(e.getDistPub()) == 0);
    }

    public Integer compareTo(EventoSvolto e) {
        if (this.dataSvolgimento.compareTo(e.getDataSvolgimento()) < 0) {
            return -1;
        }
        if (this.dataSvolgimento.compareTo(e.getDataSvolgimento()) > 0) {
            return 1;
        }
        if (this.nPartecipanti.compareTo(e.getnPartecipanti()) < 0) {
            return -1;
        }
        if (this.nPartecipanti.compareTo(e.getnPartecipanti()) > 0) {
            return 1;
        }
        if (this.distPub.compareTo(e.getDistPub()) < 0) {
            return -1;
        }
        if (this.distPub.compareTo(e.getDistPub()) > 0) {
            return 1;
        }
        return super.compareTo(e);
    }

    @Override
    public Boolean isNull() {
        return (dataSvolgimento == null || nPartecipanti == null || distPub == null);
    }

    @Override
    protected void setNull() {
        super.setNull();
        dataSvolgimento = null;
        nPartecipanti = null;
        distPub = null;
    }
}
