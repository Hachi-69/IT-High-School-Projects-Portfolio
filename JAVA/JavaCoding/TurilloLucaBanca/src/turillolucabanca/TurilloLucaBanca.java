package turillolucabanca;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaBanca {

    static String numeroConto;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContoCorrente[] conti;
        Boolean fine = true;

        System.out.println("Nome");
        String nome = input.next();
        System.out.println("Indirizzo");
        String indirizzo = input.next();
        Integer n = 0;
        do {
            System.out.println("Dimensione array");
            n = input.nextInt();
        } while (n < 0);
        conti = new ContoCorrente[n];
        for (int i = 0; i < conti.length; i++) {
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
            Integer saldoAttuale;
            do {
                System.out.println("Inserisci il saldo attuale");
                saldoAttuale = input.nextInt();
            } while (saldoAttuale < 0);
            Double fido;
            do {
                System.out.println("Inserisci il fido");
                fido = input.nextDouble();
            } while (fido < 0);
            conti[i] = new ContoCorrente(numeroConto, saldoAttuale, fido);
        }
        Banca b = new Banca(nome, indirizzo, conti);

        for (int i = 0; i < conti.length; i++) {
            System.out.println(conti[i].toString());
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
            System.out.println("4: Media saldi");
            numero = input.next();
            aggiungi(numero, conti, pos, input, b);
        } while (!numero.contains("0"));
    }

    public static void aggiungi(String numero, ContoCorrente conti[], Integer pos, Scanner input, Banca b) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(conti[pos].toString());
        } else if (numero.contains("2")) {
            System.out.println("Quanto vuoi versare?");
            Integer versa = input.nextInt();
            conti[pos].versa(versa);
        } else if (numero.contains("3")) {
            System.out.println("Quanto vuoi prelevare?");
            Integer preleva = input.nextInt();
            conti[pos].preleva(preleva);
        } else if (numero.contains("4")) {
            Integer media = 0;
            media = b.saldoMedio();
            System.out.println(media);
        }
    }
}
