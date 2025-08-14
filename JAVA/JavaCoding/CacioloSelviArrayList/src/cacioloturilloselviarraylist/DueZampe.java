package cacioloturilloselviarraylist;

import java.util.Objects;
import mydata.Data;

/**
 *
 * @author Turillo.Luca / Caciolo.Alexander / Selvi.Nicola
 */
public class DueZampe extends Animale implements Comparable {

    private int compare;// attributo usato per l'ordinamento dell' arrayList<>

    public DueZampe(String specie, Data dataNascita) {
        super(specie, dataNascita);
        nZampe = 2;
        compare = 0;
        if (dataNascita.isNull()) {
            setNull();
        }
    }

    /**
     * metodo set
     *
     * @param compare
     */
    public void setCompare(int compare) {
        this.compare = compare;
    }

    /**
     * Override del metodo get
     *
     * @return
     */
    @Override
    public String getSpecie() {
        return specie;
    }

    /**
     * metodo set
     *
     * @param specie
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    /**
     * Override del metodo toString, con richiamo al toString della superclasse
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * equals specifico della classe DueZampe
     *
     * @param d, DueZampe
     * @return true se sono uguali, altrimenti false
     */
    public boolean equals(DueZampe d) {
        return (!d.isNull() && super.equals(d) && nZampe.compareTo(d.getnZampe()) == 0);
    }

    /**
     * compareTo specifico di DueZampe, orndina per primo il numero di zampe e
     * dopo richiama il metodo compareTo della superclasse
     *
     * @param d, Animale a DueSZampe
     * @return -1 se questo e' piu' piccolo del parametro passato, 1 se e' piu'
     * grande e 0 se sono uguali
     */
    public Integer compareTo(DueZampe d) {
        if (this.nZampe.compareTo(d.getnZampe()) < 0) {
            return -1;
        }
        if (this.nZampe.compareTo(d.getnZampe()) > 0) {
            return 1;
        }
        return super.compareTo(d);
    }

    /**
     * controlla se almeno un attributo e' nullo
     *
     * @return true se almeno un attributo e' nullo, altrimenti false
     */
    @Override
    public Boolean isNull() {
        if (super.isNull() || nZampe == null) {
            setNull();
            return true;
        }
        return false;
    }

    /**
     * setta tutti gli attributi a null
     */
    @Override
    protected void setNull() {
        super.setNull();
        nZampe = null;
        specie = null;
        dataNascita = null;
    }

    /**
     * Override del metodo equals generico, con richiamo all metodo equals della
     * superclasse
     *
     * @param obj, Object
     * @return true se sono uguali, altrimenti false
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * metodo hashCode usato per vedere se due oggetti sono uguali controllando
     * il loro codice hash, e non la cella di memoria
     *
     * @return int dell'hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.specie);
        hash = 11 * hash + Objects.hashCode(this.nZampe);
        hash = 11 * hash + Objects.hashCode(this.dataNascita);
        return hash;
    }

    /**
     * Override del metodo, compareTo specifico della classe DueZampe, usato per
     * ordinare l'arrayList in base alla specie o data di nascita, sia crescente
     * che decrescente, richiamato automaticamente dalla chiamata:
     * Collections.sort(obj);
     *
     * @param o, Object
     * @return -1 se questo e' piu' piccolo del parametro passato, 1 se e' piu'
     * grande e 0 se sono uguali
     */
    @Override
    public int compareTo(Object o) {
        if (compare == 0) {// ordinamento per specie in ordine crescente
            String rollino = ((DueZampe) o).getSpecie();
            return this.specie.compareTo(rollino);
        } else if (compare == 1) {// ordinamento per data di nascita in ordine crescente
            Data rollino = ((DueZampe) o).getDataNascita();
            return this.dataNascita.compareTo(rollino);
        } else if (compare == 2) {// ordinamento per specie in ordine decrescente
            String rollino = ((DueZampe) o).getSpecie();
            return rollino.compareTo(this.specie);
        } else {// ordinamento per data di nascita in ordine decrescente
            Data rollino = ((DueZampe) o).getDataNascita();
            return rollino.compareTo(this.dataNascita);
        }
    }
}
