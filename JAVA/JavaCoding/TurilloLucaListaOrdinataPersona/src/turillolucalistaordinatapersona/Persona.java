package turillolucalistaordinatapersona;

import java.util.Objects;

/**
 *
 * @author Turillo.Luca
 */
public class Persona {

    private Integer eta;
    private String cognome;

    public Persona(Integer eta, String cognome) {
        this.eta = eta;
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "eta=" + eta + ", cognome=" + cognome;
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.eta, other.eta)) {
            return false;
        }
        return true;
    }

    private boolean equals(Persona p) {
        return !(p == null || cognome.compareTo(p.getCognome()) != 0 || eta.compareTo(p.getEta()) != 0);
    }

}
