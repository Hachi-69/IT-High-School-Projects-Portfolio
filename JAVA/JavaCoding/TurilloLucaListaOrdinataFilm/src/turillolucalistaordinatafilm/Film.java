package turillolucalistaordinatafilm;

/**
 *
 * @author Turillo.Luca
 */
public class Film {

    private String titolo;
    private Integer anno;
    private Integer durata;

    public Film(String titolo, Integer anno, Integer durata) {
        this.titolo = titolo;
        this.anno = anno;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "titolo=" + titolo + ", anno=" + anno + ", durata=" + durata;
    }

    /**
     *
     * @param f, film da controllare
     * @return true, se sono uguali, altrimenti false
     */
    private boolean equals(Film f) {
        return !(f == null || titolo.compareTo(f.getTitolo()) != 0 || anno.compareTo(f.getAnno()) != 0 || durata.compareTo(f.getDurata()) != 0);
    }

    /**
     * controlla tutti gli attributi della classe Film, se sono maggiori o
     * minori dgli attributi del Film passato come parametro
     *
     * @param film, Film che si vuole confrontare
     * @return Integer, 1 se il parametro della classe e' maggiore di quello
     * passato, -1 se e' minore, 0 se sono tutti uguali
     */
    public Integer compareTo(Film film) {
        if (this.anno < film.getAnno()) {
            return -1;
        }
        if (this.anno > film.getAnno()) {
            return 1;
        }
        if (this.durata < film.getDurata()) {
            return -1;
        }
        if (this.durata > film.getDurata()) {
            return 1;
        }
        if (this.titolo.compareTo(film.getTitolo()) < 0) {
            return -1;
        }
        if (this.titolo.compareTo(film.getTitolo()) > 0) {
            return 1;
        }
        return 0;
    }
}
