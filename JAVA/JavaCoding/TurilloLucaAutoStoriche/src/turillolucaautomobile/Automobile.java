package turillolucaautomobile;

import java.time.LocalDate;
import mydata.Data;

public class Automobile {

    protected String marca;
    protected String modello;
    protected Integer cilindrata;
    protected String alimentazione;
    protected Data dataImmatricolazione;
    private Data oggi;

    public Automobile(String marca, String modello, Integer cilindrata, String alimentazione, Data dataImmatricolazione) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.alimentazione = alimentazione;
        this.dataImmatricolazione = dataImmatricolazione;

        LocalDate d = LocalDate.now();
        this.oggi = new Data(d.getDayOfMonth(), d.getMonthValue(), d.getYear());
        if (!validaAuto()) {
            annullaAuto();
        }

    }

    protected void annullaAuto() {
        this.marca = null;
        this.modello = null;
        this.cilindrata = null;
        this.alimentazione = null;
        this.dataImmatricolazione = null;
    }

    protected Boolean validaAuto() {
        Boolean valid = true;

        if (this.marca == null || this.modello == null || this.cilindrata == null || this.alimentazione == null || this.dataImmatricolazione.isNull()) {
            valid = false;
        }

        if (this.marca.compareTo("") != 0 || this.modello.compareTo("") != 0 || this.alimentazione.compareTo("") != 0) {
            valid = false;
        }

        if (this.cilindrata <= 0) {
            valid = false;
        }

        if (oggi.compareTo(this.dataImmatricolazione) != 1) {
            valid = false;
        }

        return valid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public Data getDataImmatricolazione() {
        return dataImmatricolazione;
    }

    public void setDataImmatricolazione(Data dataImmatricolazione) {
        this.dataImmatricolazione = dataImmatricolazione;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", alimentazione=" + alimentazione + ", dataImmatricolazione=" + dataImmatricolazione;
    }

    public boolean equals(Automobile automobile) {
        return !(automobile == null || this.marca.compareTo(automobile.getMarca()) != 0 || this.cilindrata != automobile.getCilindrata() || this.modello.compareTo(automobile.getModello()) != 0 || this.alimentazione.compareTo(automobile.getAlimentazione()) != 0 || this.dataImmatricolazione.compareTo(automobile.getDataImmatricolazione()) != 0);
    }

    public Integer compareTo(Automobile automobile) {
        if (this.dataImmatricolazione.compareTo(automobile.getDataImmatricolazione()) < 0) {
            return -1;
        }
        if (this.dataImmatricolazione.compareTo(automobile.getDataImmatricolazione()) > 0) {
            return 1;
        }
        if (this.marca.toLowerCase().compareTo(automobile.getMarca().toLowerCase()) < 0) {
            return -1;
        }
        if (this.marca.toLowerCase().compareTo(automobile.getMarca().toLowerCase()) > 0) {
            return 1;
        }
        if (this.modello.toLowerCase().compareTo(automobile.getModello().toLowerCase()) < 0) {
            return -1;
        }
        if (this.modello.toLowerCase().compareTo(automobile.getModello().toLowerCase()) > 0) {
            return 1;
        }
        if (this.cilindrata < automobile.getCilindrata()) {
            return -1;
        }
        if (this.cilindrata > automobile.getCilindrata()) {
            return 1;
        }
        return 0;
    }

    public Boolean isNull() {
        return marca == null || modello == null || cilindrata == null || alimentazione == null || dataImmatricolazione == null;
    }

    public Integer anzianita() {

        return this.dataImmatricolazione.distanzaDays(oggi);
    }
}
