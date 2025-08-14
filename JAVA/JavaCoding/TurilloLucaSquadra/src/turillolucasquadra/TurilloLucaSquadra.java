package turillolucasquadra;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaSquadra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calciatore[] rosa;

        Boolean[] arrayNumMaglia = new Boolean[100];//Array per evitare lo stesso numero di maglia nella squadra
        for (int i = 0; i < arrayNumMaglia.length; i++) {
            arrayNumMaglia[i] = false;
        }

        System.out.println("Nome Squadra:");
        String nomeS = input.next();
        Integer dimSquadra = 0;
        do {
            System.out.println("(si consiglia una squadra di almeno 11 giocatori)");
            System.out.println("Dimensione squadra:");
            dimSquadra = input.nextInt();
        } while (dimSquadra <= 0);
        rosa = new Calciatore[dimSquadra];

        for (int i = 0; i < rosa.length; i++) {
            System.out.println("Nome giocatore:");
            String nomeG = input.next();

            System.out.println("Cognome giocatore:");
            String cognomeG = input.next();

            Integer eta = 0;
            do {
                System.out.println("Eta' giocatore:");
                eta = input.nextInt();
            } while (eta <= 0);

            Integer nMaglia = 0;
            do {
                System.out.println("Numero maglia giocatore:");
                nMaglia = input.nextInt();
            } while (nMaglia <= 0 || nMaglia >= 100 || arrayNumMaglia[nMaglia]);//Controllo per evitare lo stesso numero di maglia nella squadra
            arrayNumMaglia[nMaglia] = true;

            String ruolo = ""; //Scelta del ruolo per il giocatore
            do {
                System.out.println("Scegli il ruolo del giocatore: ");
                System.out.println("1: Attaccante");
                System.out.println("2: Difensore");
                System.out.println("3: Centrocampista");
                System.out.println("4: Portiere");
                ruolo = input.next();
            } while (!ruolo.contains("1") && !ruolo.contains("2") && !ruolo.contains("3") && !ruolo.contains("4"));
            if (ruolo.contains("1")) {
                ruolo = "Attaccante";
            } else if (ruolo.contains("2")) {
                ruolo = "Difensore";
            } else if (ruolo.contains("3")) {
                ruolo = "Centrocampista";
            } else if (ruolo.contains("4")) {
                ruolo = "Portiere";
            }

            rosa[i] = new Calciatore(nomeG, cognomeG, eta, nMaglia, ruolo);
        }
        Squadra s = new Squadra(nomeS, rosa);

        System.out.println("Squadra: " + nomeS);
        for (int i = 0; i < rosa.length; i++) {
            System.out.println("Giocatore " + (i + 1) + ": " + rosa[i].toString());//Stampa di tutta la squadra
        }

        String numero;
        do {
            Integer pos = 0;
            Boolean fine = true;
            do {
                System.out.println("Seleziona giocatore:");//Scelta posizione array sul quale lavorare
                pos = input.nextInt();
                if (pos >= 0 && pos < dimSquadra) {
                    fine = false;
                } else {
                    System.out.println("Posizione compresa tra 0 e " + (dimSquadra - 1));
                }
            } while (fine);
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Gioca");
            System.out.println("3: Cambia goal");
            System.out.println("4: Goal totali squadra");
            System.out.println("5: Giocatore con piu' goal");
            System.out.println("6: Giocatore con meno goal");
            System.out.println("7: Giocatore con piu' presenze");
            System.out.println("8: Giocatore con meno presenze");
            numero = input.next();
            menu(numero, rosa, pos, input, s);
        } while (!numero.contains("0"));
    }

    public static void menu(String numero, Calciatore rosa[], Integer pos, Scanner input, Squadra s) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(rosa[pos].toString());
        } else if (numero.contains("2")) {
            rosa[pos].gioca();
        } else if (numero.contains("3")) {
            Integer nGoal = 0;
            do {
                if (s.getRosa()[pos].getRuolo().contains("Portiere")) {
                    System.out.println("Goal subiti:");
                } else {
                    System.out.println("Goal segnati:");
                }
                nGoal = input.nextInt();
            } while (nGoal <= 0);
            rosa[pos].cambiaGol(nGoal);
        } else if (numero.contains("4")) {
            System.out.println("Goal totali di squadra: " + s.goalTotali());
        } else if (numero.contains("5")) {
            System.out.println("Giocatore della squadra con piu' goal: " + s.giocatorePiuGoal());
        } else if (numero.contains("6")) {
            System.out.println("Giocatore della squadra con meno goal: " + s.giocatoreMenoGoal());
        } else if (numero.contains("7")) {
            System.out.println("Giocatore della squadra con piu' presenze: " + s.giocatorePiuPresenze());
        } else if (numero.contains("8")) {
            System.out.println("Giocatore della squadra con meno goal: " + s.giocatoreMenoPresenze());
        }
    }
}
