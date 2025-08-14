package turillolucaarrayconti;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaArrayConti {

    static String numeroConto;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContoCorrente[] p;
        Boolean fine = false;
        Integer n = 0;
        do {
            System.out.println("Dimensione array");
            n = input.nextInt();
            if (n > 0) {
                fine = true;
            }
        } while (!fine);
        p = new ContoCorrente[n];
        for (int i = 0; i < p.length; i++) {
            Boolean corretto = false;
            do {
                System.out.println("Inserisci il NUMERO del conto: ");
                numeroConto = input.nextLine();
                String numeroContoNoSpace = numeroConto.replaceAll("\\s+", "");
                numeroConto = numeroContoNoSpace;
                if (numeroConto.length() == 27) {
                    String controlloIT = numeroConto.substring(0, 2);
                    controlloIT = controlloIT.toUpperCase();
                    if (controlloIT.contains("IT") == true) {
                        corretto = true;
                    }

                } else {
                    System.out.println("NUMERO CONTO NON CORRETTO, RIPROVA");
                    System.out.println("ESEMPIO: IT 12 L 12345 12345 123456789012");
                }

            } while (corretto == false);
            Double saldoAttuale;
            do {
                System.out.println("Inserisci il saldo attuale");
                saldoAttuale = input.nextDouble();
            } while (saldoAttuale < 0);
            Double fido;
            do {
                System.out.println("Inserisci il fido");
                fido = input.nextDouble();
            } while (fido < 0);
            p[i] = new ContoCorrente(numeroConto, saldoAttuale, fido);
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
            System.out.println("2: Versa");
            System.out.println("3: Preleva");
            numero = input.next();
            aggiungi(numero, p, pos, input);
        } while (!numero.contains("0"));
    }

    public static void aggiungi(String numero, ContoCorrente p[], Integer pos, Scanner input) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(p[pos].toString());
        } else if (numero.contains("2")) {
            System.out.println("Quanto vuoi versare?");
            Double versa = input.nextDouble();
            p[pos].versa(versa);
        } else if (numero.contains("3")) {
            System.out.println("Quanto vuoi prelevare?");
            Double preleva = input.nextDouble();
            p[pos].preleva(preleva);
        }
    }

}