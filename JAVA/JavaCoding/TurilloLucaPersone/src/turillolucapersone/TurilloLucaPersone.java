package turillolucapersone;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaPersone {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persona persone = new Persona("nome", "cognome", 69);

        persone.invecchia();
        Boolean magg = persone.isMaggiorenne();
        if (magg == true) {
            System.out.println("La persona e' maggiornenne: " + persone.getEta());
        } else {
            System.out.println("La persona NON e' maggiornenne: " + persone.getEta());
        }

        System.out.println("Se si desidera cambiare nome cliccare il tasto 1; Se invece si vuole cambiare cognome 2; Se si vuole cambiare l'eta' 3; "
                + "altrimenti se si vuole lasciare invariato qualsiasi altro numero");
        Integer numero = input.nextInt();
        aggiungi(numero, persone, input);
    }

    public static void aggiungi(Integer numero, Persona persone, Scanner input) {

        if (numero > 0 && numero < 4) {

            switch (numero) {
                case 1:
                    System.out.println("Inserisci il nome: ");
                    persone.setNome(input.next());
                    break;
                case 2:
                    System.out.println("Inserisci il Cognome: ");
                    persone.setCognome(input.next());
                    break;
                case 3:
                    System.out.println("Inserisci l'eta': ");
                    persone.setEta(input.nextInt());
                    break;
            }
        }
        System.out.println(persone.toString());

    }

}
