package turillolucaautomobile;

import mydata.Data;

public class AutoStorica extends Automobile {

    private Data dataIscrizioneAsi;
    private String provinciaAsi;

    public AutoStorica(String marca, String modello, Integer cilindrata, String alimentazione, Data dataImmatricolazione, Data dataIscrizioneAsi, String provinciaAsi) {
        super(marca, modello, cilindrata, alimentazione, dataImmatricolazione);
        this.dataIscrizioneAsi = dataIscrizioneAsi;
        this.provinciaAsi = provinciaAsi.toLowerCase();
        if (validaIscrizione()) {
            anullaIscrizione();
        }

    }

    private void anullaIscrizione() {
        this.dataImmatricolazione = null;
        this.provinciaAsi = null;
    }

    private Boolean validaIscrizione() {
        Boolean valid = true;

        if (provinciaAsi == "" || provinciaAsi == null || provinciaAsi.length() != 2) {
            valid = false;
        }

        if (super.anzianita() / 365 < 30) {
            valid = false;
        }

        return valid;
    }

    public Data getDataIscrizioneAsi() {
        return dataIscrizioneAsi;
    }

    public void setDataIscrizioneAsi(Data dataIscrizioneAsi) {
        this.dataIscrizioneAsi = dataIscrizioneAsi;
    }

    public String getProvinciaAsi() {
        return provinciaAsi;
    }

    public void setProvinciaAsi(String provinciaAsi) {
        this.provinciaAsi = provinciaAsi;
    }

    public Boolean isNull() {
        return provinciaAsi == null || dataIscrizioneAsi == null;
    }

    public boolean equals(AutoStorica autoStorica) {
        return !(autoStorica == null || this.dataIscrizioneAsi.compareTo(autoStorica.getDataIscrizioneAsi()) != 0 || this.provinciaAsi.compareTo(autoStorica.getProvinciaAsi()) != 0 || super.equals(autoStorica));
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
        return super.compareTo(automobile);
    }

    public Integer anzianitaAsi() {
        if (this.dataIscrizioneAsi == null) {
            return -1;
        }
        return super.anzianita() - (365 * 30);
    }

}
