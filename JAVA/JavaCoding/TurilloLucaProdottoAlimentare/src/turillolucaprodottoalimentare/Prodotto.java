package turillolucaprodottoalimentare;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class Prodotto {
    //attributi protected per essere passati alla sottoclasse\\

    protected String marca;
    protected Integer costo;
    protected Data dataProduzione;

    /**
     * costruttore della superclasse
     *
     * @param marca
     * @param costo
     * @param dataProduzione
     */
    public Prodotto(String marca, Integer costo, Data dataProduzione) {
        this.marca = marca;
        this.costo = costo;
        this.dataProduzione = dataProduzione;
    }

    /**
     *
     * @return Stringa della marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * cambia la marca al parametro passato
     *
     * @param marca, Stringa della nuova marca
     */
    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
    }

    /**
     *
     * @return Integer del costo
     */
    public Integer getCosto() {
        return costo;
    }

    /**
     * cambia il costo al parametro passato
     *
     * @param costo, Integer del nuovo costo
     */
    public void setCosto(Integer costo) {
        if (costo != null) {
            this.costo = costo;
        }
    }

    /**
     *
     * @return Data della data di produzione
     */
    public Data getDataProduzione() {
        return dataProduzione;
    }

    /**
     * cambia la data di produzione al parametro passato
     *
     * @param dataProduzione, Data della nuova data
     */
    public void setDataProduzione(Data dataProduzione) {
        if (dataProduzione != null) {
            this.dataProduzione = dataProduzione;
        }
    }

    /**
     *
     * @return Stringa di tutti gli attributi
     */
    @Override
    public String toString() {
        return "marca=" + marca + ", costo=" + costo + ", dataProduzione=" + dataProduzione.toString();
    }

    /**
     * controlla se il parametro di tipo Prodotto e' uguale a questo Prodotto
     *
     * @param p, parametro da mettere al confronto
     * @return true se sono uguali, altrimenti false
     */
    public boolean equals(Prodotto p) {
        return (!p.isNull() && marca.compareTo(p.getMarca()) == 0 && costo.compareTo(p.getCosto()) == 0 && dataProduzione.equals(p.getDataProduzione()));
    }

    /**
     * compara il Prodotto del parametro passato, ordinando passando per primo
     * dalla marca, e successivamente costo
     *
     * @param p, prodotto da comparare
     * @return -1 se questo e' piu' piccolo del parametro passato, 1 se e' piu'
     * grande e 0 se sono uguali
     */
    public Integer compareTo(Prodotto p) {
        if (this.marca.compareTo(p.getMarca()) < 0) {
            return -1;
        }
        if (this.marca.compareTo(p.getMarca()) > 0) {
            return 1;
        }
        if (this.costo.compareTo(p.getCosto()) < 0) {
            return -1;
        }
        if (this.costo.compareTo(p.getCosto()) > 0) {
            return 1;
        }
        return 0;
    }

    /**
     * controlla se almeno un attributo e' nullo o la marca e' vuota, e se vero
     * richiama il metodo setNull()
     *
     * @return true se sono nulli, false se non sono nulli
     */
    public Boolean isNull() {
        if (marca == null || costo == null || dataProduzione.isNull()
                || marca.trim().isEmpty()) {
            setNull();
            return true;
        }
        return false;
    }

    /**
     * se anche un solo attributo e' nullo, setta tutto a null
     */
    protected void setNull() {
        marca = null;
        costo = null;
        dataProduzione = null;
    }

    /**
     * calcola la distanza in giorni dalla data di produzione alla data di
     * scadenza
     *
     * @param d1, Data di scadenza
     * @return Integer, numero di giorni
     */
    protected Integer calcolaScadenza(Data d1) {
        return this.getDataProduzione().distanzaDays(d1);
    }
}
