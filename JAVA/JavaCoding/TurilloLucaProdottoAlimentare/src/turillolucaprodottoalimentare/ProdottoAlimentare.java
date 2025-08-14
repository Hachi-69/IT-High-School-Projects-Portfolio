package turillolucaprodottoalimentare;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class ProdottoAlimentare extends Prodotto {

    private Data dataScadenza;
    private Integer giorniAllaScadenza;

    /**
     * costruttore della sottoclasse che richiama il costruttore della
     * superclasse
     *
     * @param dataScadenza
     * @param marca
     * @param costo
     * @param dataProduzione
     */
    public ProdottoAlimentare(Data dataScadenza, String marca, Integer costo, Data dataProduzione) {
        super(marca, costo, dataProduzione);
        this.dataScadenza = dataScadenza;
        this.giorniAllaScadenza = dataProduzione.distanzaDays(dataScadenza);
    }

    /**
     *
     * @return Data della data di scadenza
     */
    public Data getDataScadenza() {
        return dataScadenza;
    }

    /**
     * cambia la data di scadenza al parametro Data passato, solo se la data di
     * produzione viene prima della data di scadenza, e ricalcola i giorni alla
     * scadenza
     *
     * @param dataScadenza, Data della nuova data di scadenza
     */
    public void setDataScadenza(Data dataScadenza) {
        if (dataScadenza != null && dataProduzione.getMese() <= dataScadenza.getMese() && dataProduzione.getAnno() <= dataScadenza.getAnno()
                && dataProduzione.getGiorno() < dataScadenza.getGiorno() && calcolaScadenza(dataScadenza) >= 0) {
            this.dataScadenza = dataScadenza;
            giorniAllaScadenza = calcolaScadenza(dataScadenza);
        }
    }

    /**
     *
     * @return Integer dei giorni rimasti alla scadenza
     */
    public Integer getGiorniAllaScadenza() {
        return giorniAllaScadenza;
    }

    /**
     *
     * @return Stringa di tutti gli attributi
     */
    @Override
    public String toString() {
        return "dataScadenza=" + dataScadenza.toString() + ", giorniAllaScadenza=" + giorniAllaScadenza;
    }

    /**
     * controlla se il parametro di tipo ProdottoAlimentare e' uguale a questo
     * ProdottoAlimentare, e richiama l'equals della superclasse
     *
     * @param p, parametro da mettere al confronto
     * @return true se sono uguali, altrimenti false
     */
    public boolean equals(ProdottoAlimentare p) {
        return (super.equals(p) && !p.isNull() && giorniAllaScadenza.compareTo(p.getGiorniAllaScadenza()) == 0 && dataScadenza.equals(p.getDataScadenza()));
    }

    /**
     * compara il ProdottoAlimentare del parametro passato, ordinando passando
     * per primo dalla data di scadenza, e richiamando il compare to della
     * superclasse
     *
     * @param p, prodotto da comparare
     * @return -1 se questo e' piu' piccolo del parametro passato, 1 se e' piu'
     * grande e 0 se sono uguali
     */
    public Integer compareTo(ProdottoAlimentare p) {
        if (this.dataScadenza.compareTo(p.getDataScadenza()) < 0) {
            return -1;
        }
        if (this.dataScadenza.compareTo(p.getDataScadenza()) > 0) {
            return 1;
        }
        return super.compareTo(p);
    }

    /**
     * controlla se almeno un attributo e' nullo, e se vero richiama il metodo
     * setNull()
     *
     * @return true se sono nulli, false se non sono nulli
     */
    @Override
    public Boolean isNull() {
        if (super.isNull() && giorniAllaScadenza == null || dataScadenza.isNull()) {
            setNull();
            return true;
        }
        return false;
    }

    /**
     * se anche un solo attributo e' nullo, setta tutto a null, richiamando
     * anche il metodo setNull() della superclasse
     */
    @Override
    protected void setNull() {
        super.setNull();
        giorniAllaScadenza = null;
        dataScadenza = null;
    }
}
