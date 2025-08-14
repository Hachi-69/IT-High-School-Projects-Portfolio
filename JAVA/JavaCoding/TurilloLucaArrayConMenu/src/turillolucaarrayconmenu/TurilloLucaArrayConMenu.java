package turillolucaarrayconmenu;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaArrayConMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persona[] p;
        Boolean fine = false;
        Integer n = 0;
        do {
            System.out.println("Dimensione array");
            n = input.nextInt();
            if (n > 0) {
                fine = true;
            }
        } while (!fine);
        p = new Persona[n];
        for (int i = 0; i < p.length; i++) {
            System.out.println("Inserisci il nome");
            String nome = input.next();
            Integer eta;
            do {
                System.out.println("Inserisci eta");
                eta = input.nextInt();
            } while (eta < 0);
            p[i] = new Persona(nome, eta);
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }
        Integer pos = 0;
        do {
            System.out.println("Posizione array");
            pos = input.nextInt();
            if (pos >= 0 && pos < n) {
                fine = false;
            } else {
                System.out.println("Posizione compresa tra 0 e " + (n - 1));
            }
        } while (fine);
        String numero;
        do {
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Maggiorenne");
            numero = input.next();
            aggiungi(numero, p, pos);
        } while (!numero.contains("0"));

    }

    public static void aggiungi(String numero, Persona p[], Integer pos) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(p[pos].toString());
        } else if (numero.contains("2")) {
            if (p[pos].isMaggiorenne()) {
                System.out.println("Maggiorenne");
            } else {
                System.out.println("Minorenne");
            }
        }
    }

}