package cacioloturilloselviarraylist;

import java.util.Objects;
import mydata.Data;

/**
 *
 * @author Turillo.Luca / Caciolo.Alexander / Selvi.Nicola
 */
public class Animale {

    // attributi della superclasse ereditati dalle sottoclassi \\
    protected String specie;
    protected Integer nZampe;
    protected Data dataNascita;

    /**
     * Construttore della superclasse Animale
     *
     * @param specie, Specie dell'animale
     * @param dataNascita, Data di nascita dell'animale
     */
    public Animale(String specie, Data dataNascita) {
        this.specie = specie;
        this.dataNascita = dataNascita;
        if (dataNascita.isNull()) { // controllo se la data e' stata scritta correttamente
            setNull(); // se non e' stata scritta correttamente setto tutti gli attributi a null
        }
    }

    /**
     * Stampa tutti i valori degli attributi
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Specie: " + specie + ", Data Di Nascita: " + dataNascita + ", Numero Zampe: " + nZampe + "\n";

    }

    /**
     * metodo get
     *
     * @return String della specie
     */
    public String getSpecie() {
        return specie;
    }

    /**
     * metodo get
     *
     * @return String del Numero di Zampe
     */
    public Integer getnZampe() {
        return nZampe;
    }

    /**
     * metodo get
     *
     * @return String della Data di Nascita
     */
    public Data getDataNascita() {
        return dataNascita;
    }

    /**
     * equals specifico di animale
     *
     * @param a, Animale
     * @return true se sono uguali, altrimenti false
     */
    public boolean equals(Animale a) {
        return (!a.isNull() && specie.compareTo(a.getSpecie()) == 0 && dataNascita.equals(a.getDataNascita()));
    }

    /**
     * compareTo specifico di Animale, orndina per prima la specie e dopo la
     * Data di Nascita
     *
     * @param a, Animale
     * @return -1 se questo e' piu' piccolo del parametro passato, 1 se e' piu'
     * grande e 0 se sono uguali
     */
    public Integer compareTo(Animale a) {
        if (this.specie.compareTo(a.getSpecie()) < 0) {
            return -1;
        }
        if (this.specie.compareTo(a.getSpecie()) > 0) {
            return 1;
        }
        if (this.dataNascita.compareTo(a.getDataNascita()) < 0) {
            return -1;
        }
        if (this.dataNascita.compareTo(a.getDataNascita()) > 0) {
            return 1;
        }
        return 0;
    }

    /**
     * controlla se almeno un attributo e' nullo
     *
     * @return true se almeno un attributo e' nullo, altrimenti false
     */
    public Boolean isNull() {
        if (nZampe == null || specie == null || dataNascita == null) {
            setNull();
            return true;
        }
        return false;
    }

    /**
     * setta tutti gli attributi a null
     */
    protected void setNull() {
        nZampe = null;
        specie = null;
        dataNascita = null;
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
     * equals generico
     *
     * @param obj, Object
     * @return true se sono uguali, altrimenti false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animale other = (Animale) obj;
        if (!Objects.equals(this.specie, other.specie)) {
            return false;
        }
        if (!Objects.equals(this.nZampe, other.nZampe)) {
            return false;
        }
        if (!Objects.equals(this.dataNascita, other.dataNascita)) {
            return false;
        }
        return true;
    }
}
