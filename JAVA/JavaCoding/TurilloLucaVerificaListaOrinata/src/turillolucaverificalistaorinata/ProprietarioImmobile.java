package turillolucaverificalistaorinata;

import java.util.Objects;

/**
 *
 * @author Turillo.Luca
 */
public class ProprietarioImmobile {

    private String cognome;
    private String nome;
    private String tipoImmobile; //i possibili valori sono terreno, abitazione, capannone
    private Integer annoImmobile;

    public ProprietarioImmobile(String cognome, String nome, String tipoImmobile, Integer annoImmobile) {
        this.cognome = cognome;
        this.nome = nome;
        this.tipoImmobile = tipoImmobile;
        this.annoImmobile = annoImmobile;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoImmobile() {
        return tipoImmobile;
    }

    public void setTipoImmobile(String tipoImmobile) {
        this.tipoImmobile = tipoImmobile;
    }

    public Integer getAnnoImmobile() {
        return annoImmobile;
    }

    public void setAnnoImmobile(Integer annoImmobile) {
        this.annoImmobile = annoImmobile;
    }

    @Override
    public String toString() {
        return "cognome=" + cognome + ", nome=" + nome + ", tipoImmobile=" + tipoImmobile + ", annoImmobile=" + annoImmobile;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProprietarioImmobile other = (ProprietarioImmobile) obj;
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoImmobile, other.tipoImmobile)) {
            return false;
        }
        if (!Objects.equals(this.annoImmobile, other.annoImmobile)) {
            return false;
        }
        return true;
    }

    private boolean equals(ProprietarioImmobile p) {
        return !(p == null || cognome.compareTo(p.getCognome()) != 0 || nome.compareTo(p.getNome()) != 0 || tipoImmobile.compareTo(p.getTipoImmobile()) != 0 || annoImmobile.compareTo(p.getAnnoImmobile()) != 0);
    }

    public Integer compareTo(ProprietarioImmobile p) {
        if (this.cognome.compareTo(p.getCognome()) < 0) {
            return -1;
        }
        if (this.cognome.compareTo(p.getCognome()) > 0) {
            return 1;
        }
        if (this.nome.compareTo(p.getNome()) < 0) {
            return -1;
        }
        if (this.nome.compareTo(p.getNome()) > 0) {
            return 1;
        }
        if (this.tipoImmobile.compareTo(p.getTipoImmobile()) < 0) {
            return -1;
        }
        if (this.tipoImmobile.compareTo(p.getTipoImmobile()) > 0) {
            return 1;
        }
        if (this.annoImmobile < getAnnoImmobile()) {
            return -1;
        }
        if (this.annoImmobile > getAnnoImmobile()) {
            return 1;
        }
        return 0;
    }
}
