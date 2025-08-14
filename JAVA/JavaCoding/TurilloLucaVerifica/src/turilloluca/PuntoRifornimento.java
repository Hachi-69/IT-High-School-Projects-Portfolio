package turilloluca;

/**
 *
 * @author Turillo.Luca
 */
public class PuntoRifornimento {

    private Integer numeroPostazione;
    private String tipoCrburante;
    private Integer costoAlLitro;
    private Integer numeroMaxLitri;
    private Integer numeroLitriAttuali;
    private Integer numeroLitriErogatiDaApertura;
    private Boolean occupato;

    public PuntoRifornimento(Integer numeroPostazione, String tipoCrburante, Integer costoAlLitro, Integer numeroMaxLitri) {
        this.numeroPostazione = numeroPostazione;
        this.tipoCrburante = tipoCrburante;
        this.costoAlLitro = costoAlLitro;
        this.numeroMaxLitri = numeroMaxLitri;
        this.numeroLitriAttuali = numeroMaxLitri;
        this.numeroLitriErogatiDaApertura = 0;
        this.occupato = false;
    }

    public Integer getNumeroPostazione() {
        return numeroPostazione;
    }

    public void setNumeroPostazione(Integer numeroPostazione) {
        this.numeroPostazione = numeroPostazione;
    }

    public String getTipoCrburante() {
        return tipoCrburante;
    }

    public void setTipoCrburante(String tipoCrburante) {
        this.tipoCrburante = tipoCrburante;
    }

    public Integer getCostoAlLitro() {
        return costoAlLitro;
    }

    public void setCostoAlLitro(Integer costoAlLitro) {
        this.costoAlLitro = costoAlLitro;
    }

    public Integer getNumeroMaxLitri() {
        return numeroMaxLitri;
    }

    public void setNumeroMaxLitri(Integer numeroMaxLitri) {
        this.numeroMaxLitri = numeroMaxLitri;
    }

    public Integer getNumeroLitriAttuali() {
        return numeroLitriAttuali;
    }

    public void setNumeroLitriAttuali(Integer numeroLitriAttuali) {
        this.numeroLitriAttuali = numeroLitriAttuali;
    }

    public Integer getNumeroLitriErogatiDaApertura() {
        return numeroLitriErogatiDaApertura;
    }

    public void setNumeroLitriErogatiDaApertura(Integer numeroLitriErogatiDaApertura) {
        this.numeroLitriErogatiDaApertura = numeroLitriErogatiDaApertura;
    }

    public Boolean getOccupato() {
        return occupato;
    }

    public void setOccupato(Boolean occupato) {
        this.occupato = occupato;
    }

    @Override
    public String toString() {
        return "numeroPostazione=" + numeroPostazione + ", tipoCrburante=" + tipoCrburante + ", costoAlLitro=" + costoAlLitro + ", numeroMaxLitri=" + numeroMaxLitri + ", numeroLitriAttuali=" + numeroLitriAttuali + ", numeroLitriErogatiDaApertura=" + numeroLitriErogatiDaApertura + ", occupato=" + occupato;
    }

    public void occupaPuntoRifornimento() {
        occupato = true;
    }

    public void liberaPuntoRifornimento() {
        occupato = false;
    }

    public void erogaCarburante() {
        if (numeroLitriAttuali > 0 && occupato) {
            numeroLitriAttuali--;
            numeroLitriErogatiDaApertura++;
        }
    }

    public void rifornisciPunto() {
        if (numeroLitriAttuali < numeroMaxLitri && !occupato) {
            numeroLitriAttuali++;
        }
    }
}
