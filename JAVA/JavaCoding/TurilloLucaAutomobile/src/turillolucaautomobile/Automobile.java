package turillolucaautomobile;

/**
 *
 * @author Turillo.Luca
 */
public class Automobile {

    private String marca;
    private String modello;
    private Integer velocitaMassima;
    private Integer velocitaAttuale;
    private Integer numeroMarce;
    private Integer marciaAttuale;
    private Integer capacitaSerbatoio;
    private Integer carburanteAttuale;

    public Automobile(String ma, String mo, Integer vMax, Integer nMarc, Integer capSerb) {
        marca = ma;
        modello = mo;
        velocitaMassima = vMax;
        velocitaAttuale = 0;
        numeroMarce = nMarc;
        marciaAttuale = 0;
        capacitaSerbatoio = capSerb;
        carburanteAttuale = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String mo) {
        modello = mo;
    }

    public Integer getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(Integer vMax) {
        velocitaMassima = vMax;
    }

    public Integer getVelocitaAttuale() {
        return velocitaAttuale;
    }

    public void setVelocitaAttuale(Integer vAtt) {
        velocitaAttuale = vAtt;
    }

    public Integer getNumeroMarce() {
        return numeroMarce;
    }

    public void setNumeroMarce(Integer nMarc) {
        numeroMarce = nMarc;
    }

    public Integer getMarciaAttuale() {
        return marciaAttuale;
    }

    public void setMarciaAttuale(Integer marcAtt) {
        marciaAttuale = marcAtt;
    }

    public Integer getCapacitaSerbatoio() {
        return capacitaSerbatoio;
    }

    public void setCapacitaSerbatoio(Integer capSerb) {
        capacitaSerbatoio = capSerb;
    }

    public Integer getCarburanteAttuale() {
        return carburanteAttuale;
    }

    public void setCarburanteAttuale(Integer carbAtt) {
        carburanteAttuale = carbAtt;
    }

    @Override
    public String toString() {
        return "Marca: " +marca + "; Modello: " + modello + "; Velocita' massima: " + velocitaMassima + "; Velocita' attuale: " + velocitaAttuale + "; Numero marce: " + numeroMarce + "; Marcia attuale: " + marciaAttuale + "; Capacita serbatoio: " + capacitaSerbatoio + "; Carburante attuale: " + carburanteAttuale;
    }

    public void aumentaMarcia() {
        if (marciaAttuale < numeroMarce) {
            marciaAttuale += 1;
        }
    }

    public void scalaMarcia() {
        if (marciaAttuale > 0) {
            marciaAttuale -= 1;
        }

    }

    public void aumentaVelocita() {
        if (velocitaAttuale < velocitaMassima) {
            velocitaAttuale += 1;
        }

    }

    public void diminuisciVelocita() {
        if (velocitaAttuale > 0) {
            velocitaAttuale -= 1;
        }

    }

    public void consumaCarburante() {
        if (carburanteAttuale > 0) {
            carburanteAttuale -= 1;
        }

    }

    public void rifornisciCarburante() {
        if (carburanteAttuale < capacitaSerbatoio) {
            carburanteAttuale += 1;
        }

    }

}
/*turiddu*/
