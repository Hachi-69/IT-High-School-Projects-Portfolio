package turillolucarubrica;

import java.util.Objects;

/**
 *
 * @author Turillo.Luca
 */
public class Contatto implements Comparable {

    private String nome, cognome, tel, mail;

    public Contatto(String cognome, String nome, String tel, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.tel = tel;
        this.mail = mail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cognome=" + cognome + ", Nome=" + nome + ", Tel=" + tel + ", Mail=" + mail + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cognome);
        hash = 47 * hash + Objects.hashCode(this.tel);
        hash = 47 * hash + Objects.hashCode(this.mail);
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
        final Contatto other = (Contatto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        return Objects.equals(this.mail, other.mail);
    }

    public Integer compareTo(Contatto c) {
        if (this.cognome.compareTo(c.getCognome()) < 0) {
            return -1;
        }
        if (this.cognome.compareTo(c.getCognome()) > 0) {
            return 1;
        }
        if (this.nome.compareTo(c.getNome()) < 0) {
            return -1;
        }
        if (this.nome.compareTo(c.getNome()) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        int comp;
        String Cognome = ((Contatto) o).getCognome();
        comp = this.cognome.compareTo(Cognome);
        if (comp == 0) {
            String Nome = ((Contatto) o).getNome();
            comp = this.nome.compareTo(Nome);
        }
        return comp;
    }
}
