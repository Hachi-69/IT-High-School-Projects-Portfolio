package turillolucaristorante;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaRistorante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Piatto[] menu;

        System.out.println("Nome ristorante:");
        String nomeR = input.next();

        Integer dimMenu = 0;
        do {
            System.out.println("Dimensione menu:");
            dimMenu = input.nextInt();
        } while (dimMenu <= 0);
        menu = new Piatto[dimMenu];

        Integer numTavoli = 0;
        do {
            System.out.println("Numero tavoli:");
            numTavoli = input.nextInt();
        } while (numTavoli <= 0);

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nome piatto:");
            String nomeP = input.next();

            String tipo = ""; //Scelta del tipo di piatto
            do {
                System.out.println("Scegli il tipo di piatto: ");
                System.out.println("1: Antipasto");
                System.out.println("2: Primo");
                System.out.println("3: Secondo");
                System.out.println("4: Dolce");
                tipo = input.next();
            } while (!tipo.contains("1") && !tipo.contains("2") && !tipo.contains("3") && !tipo.contains("4"));
            if (tipo.contains("1")) {
                tipo = "Antipasto";
            } else if (tipo.contains("2")) {
                tipo = "Primo";
            } else if (tipo.contains("3")) {
                tipo = "Secondo";
            } else if (tipo.contains("4")) {
                tipo = "Dolce";
            }

            Double prezzo = 0.0;
            do {
                System.out.println("Prezzo:");
                prezzo = input.nextDouble();
            } while (prezzo <= 0);
            menu[i] = new Piatto(nomeP, tipo, prezzo);
        }
        Ristorante r = new Ristorante(nomeR, numTavoli, menu);
        System.out.println("Ristorante: " + nomeR);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Piatto " + (i + 1) + ": " + menu[i].toString());//Stampa di tutta la squadra
        }

        String numero;
        do {
            Integer pos = 0;
            Boolean fine = true;
            do {
                System.out.println("Seleziona giocatore:");//Scelta posizione array sul quale lavorare
                pos = input.nextInt();
                if (pos >= 0 && pos < dimMenu) {
                    fine = false;
                } else {
                    System.out.println("Posizione compresa tra 0 e " + (dimMenu - 1));
                }
            } while (fine);
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: ");
            System.out.println("3: ");
            System.out.println("4: ");
            System.out.println("5: ");
            System.out.println("6: ");
            System.out.println("7: ");
            System.out.println("8: ");
            numero = input.next();
            menu(numero, menu, pos, input, r);
        } while (!numero.contains("0"));
    }

    public static void menu(String numero, Piatto menu[], Integer pos, Scanner input, Ristorante r) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(menu[pos].toString());
        } else if (numero.contains("2")) {

        } else if (numero.contains("3")) {

        } else if (numero.contains("4")) {

        } else if (numero.contains("5")) {

        } else if (numero.contains("6")) {

        } else if (numero.contains("7")) {

        } else if (numero.contains("8")) {

        }
    }
}
