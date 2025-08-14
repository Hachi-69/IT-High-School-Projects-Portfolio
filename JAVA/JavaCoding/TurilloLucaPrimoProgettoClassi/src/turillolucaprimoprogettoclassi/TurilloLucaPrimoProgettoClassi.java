package turillolucaprimoprogettoclassi;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaPrimoProgettoClassi {

    public static void main(String[] args) {
// creo un'oggetto di classe automobile
//LO CREO SPECIFICANDO DIRETTAMENTE NELLA CHIAMATA I VALORI DA ASSEGNARE AGLI ATTRIBUTI
        Automobile a = new Automobile("Lamborghini", "Urus", 6000, 300);
        //System.out.println("dati: " + " " + a.getMarca() + " " + a.getModello() + " " + a.getCilindrata() + " " + a.getVelocitaMassima() + " " + a.getVelocitaAttuale() + " " + a.getAccesa());
        a.setVelocitaAttuale(50);
        //System.out.println("dati: " + " " + a.getMarca() + " " + a.getModello() + " " + a.getCilindrata() + " " + a.getVelocitaMassima() + " " + a.getVelocitaAttuale() + " " + a.getAccesa());
        System.out.println(a.toString());
    }

}
