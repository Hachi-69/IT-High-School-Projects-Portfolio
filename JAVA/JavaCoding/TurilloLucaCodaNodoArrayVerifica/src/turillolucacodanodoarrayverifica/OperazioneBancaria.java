package turillolucacodanodoarrayverifica;

/**
 *
 * @author Turillo.Luca
 */
public class OperazioneBancaria {

    private String codiceCliente;
    private Integer importo;
    private String tipo;
    private Integer costoCommissione;

    public OperazioneBancaria(String codiceCliente, Integer importo, String tipo, Integer costoCommissione) {
        this.codiceCliente = codiceCliente;
        this.importo = importo;
        this.tipo = tipo;
        this.costoCommissione = costoCommissione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public Integer getImporto() {
        return importo;
    }

    public void setImporto(Integer importo) {
        this.importo = importo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCostoCommissione() {
        return costoCommissione;
    }

    public void setCostoCommissione(Integer costoCommissione) {
        this.costoCommissione = costoCommissione;
    }

    @Override
    public String toString() {
        return "codiceCliente=" + codiceCliente + ", importo=" + importo + ", tipo=" + tipo + ", costoCommissione=" + costoCommissione;
    }

}
