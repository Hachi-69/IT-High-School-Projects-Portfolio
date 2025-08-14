package turillolucaevento;

import mydata.Data;

/**
 *
 * @author Turillo.Luca
 */
public class Evento {

    protected String nome;
    protected String luogo;
    protected Data dataPub;
    protected String genere;

    public Evento(String nome, String luogo, Data dataPub, String genere) {
        this.nome = nome;
        this.luogo = luogo;
        this.dataPub = dataPub;
        this.genere = genere;
        if (isNull()) {
            setNull();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }

    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        if (luogo != null) {
            this.luogo = luogo;
        }
    }

    public Data getDataPub() {
        return dataPub;
    }

    public void setDataPub(Data dataPub) {
        if (dataPub != null) {
            this.dataPub = dataPub;
        }
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        if (genere != null) {
            this.genere = genere;
        }
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Luogo=" + luogo + ", Data Pubblicazione=" + dataPub.toString() + ", Genere=" + genere + "\n";
    }

    public boolean equals(Evento e) {
        return (nome.compareTo(e.getNome()) == 0 || luogo.compareTo(e.getLuogo()) == 0 || dataPub.compareTo(e.getDataPub()) == 0 || genere.compareTo(e.getGenere()) == 0);
    }

    public Integer compareTo(Evento e) {
        if (this.nome.compareTo(e.getNome()) < 0) {
            return -1;
        }
        if (this.nome.compareTo(e.getNome()) > 0) {
            return 1;
        }
        if (this.luogo.compareTo(e.getLuogo()) < 0) {
            return -1;
        }
        if (this.luogo.compareTo(e.getLuogo()) > 0) {
            return 1;
        }
        if (this.dataPub.compareTo(e.getDataPub()) < 0) {
            return -1;
        }
        if (this.dataPub.compareTo(e.getDataPub()) > 0) {
            return 1;
        }
        if (this.genere.compareTo(e.getGenere()) < 0) {
            return -1;
        }
        if (this.genere.compareTo(e.getGenere()) > 0) {
            return 1;
        }
        return 0;
    }

    public Boolean isNull() {
        return (nome == null || luogo == null || dataPub == null || genere == null);
    }

    protected void setNull() {
        nome = null;
        luogo = null;
        dataPub = null;
        genere = null;
    }
}
