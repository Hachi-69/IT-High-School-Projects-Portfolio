package turillolucaprimoprogettoclassi;

/**
 *
 * @author Turillo.Luca
 */
public class Automobile {

// definisco gli attributi della classe che devono essere privati
    private String marca;
    private String modello;
    private Integer cilindrata;
    private Integer velocitaMassima;
    private Integer velocitaAttuale;
    private Boolean accesa;

//definisco i metodi, partendo dall costruttore, che devono essere pubblici
    public Automobile(String mar, String mod, Integer cil, Integer vMax) {
        marca = mar;
        modello = mod;
        cilindrata = cil;
        velocitaMassima = vMax;
        velocitaAttuale = 0;
        accesa = false;
    }

// dato il principio di incapsulamento vado a scrivere
//i metodi GET e SET per ongi attributo
//i meodi GET mi servono a poter leggere il valore dell'attributo
//i metodi SET mi servono per modificare il valore dell'attributo
    public String getMarca() {
        return marca;
    }

    public void setMarca(String mar) {
        marca = mar;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String mod) {
        modello = mod;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cil) {
        cilindrata = cil;
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

    public Boolean getAccesa() {
        return accesa;
    }

    public void setAccesa(Boolean acc) {
        accesa = acc;
    }

//per stampare in un colpa solo il valore degli attributi scrivo il mio metodo to string
    @Override
    public String toString() {
        return "Marca: " + marca + " Modello: " + modello + " Cilindrata: " + cilindrata + " Velocita Massima: " + velocitaMassima + " velocita Attuale: " + velocitaAttuale + " Accesa: " + accesa;
    }
}
