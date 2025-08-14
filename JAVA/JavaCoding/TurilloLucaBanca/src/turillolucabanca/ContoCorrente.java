package turillolucabanca;

/**
 *
 * @author Turillo.Luca
 */
public class ContoCorrente {
    private String numeroConto;
    private Integer saldoAttuale;
    private Double fido;

    public ContoCorrente(String nC, Integer sA, Double fid) {
        numeroConto = nC;
        saldoAttuale = sA;
        fido = fid;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(String nC) {
        numeroConto = nC;
    }

    public Integer getSaldoAttuale() {
        return saldoAttuale;
    }

    public void setSaldoAttuale(Integer sA) {
        saldoAttuale = sA;
    }

    public Double getFido() {
        return fido;
    }

    public void setAbitantiAattuali(Double fid) {
        fido = fid;
    }

    @Override
    public String toString() {
        return "Numero conto: " + numeroConto + " Saldo attuale: " + saldoAttuale + " Fido: " + fido;
    }

    public void preleva(Integer num) {
        if (num <= saldoAttuale + fido) {
            saldoAttuale -= num;
        } else {
            System.out.println("Non puoi prelevare cosi' tanto");
        }

    }

    public void versa(Integer num) {
        saldoAttuale += num;
    }
}
