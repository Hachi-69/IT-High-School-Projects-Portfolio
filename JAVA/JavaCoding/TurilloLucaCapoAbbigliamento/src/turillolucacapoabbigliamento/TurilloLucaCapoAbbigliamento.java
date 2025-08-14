package turillolucacapoabbigliamento;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaCapoAbbigliamento {

    static Boolean fine = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Marca:");
        String marca = input.next();
        System.out.println("Prezzo:");
        Double Prezzo = input.nextDouble();
        System.out.println("Quantita disponibile in magazzino:");
        Integer quantitaDisponibileMagazzino = input.nextInt();
        System.out.println("Quantita minima da avere in magazzino:");
        Integer quantitaMinimaDaAvereInMagazzino = input.nextInt();
        CapoAbbigliamento A = new CapoAbbigliamento(marca, Prezzo, quantitaDisponibileMagazzino, quantitaMinimaDaAvereInMagazzino);

        do {
            System.out.println("Cosa si desidera fare?");
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Vendi");
            System.out.println("3: Fai il reso");
            System.out.println("4: Ordina da fornitore");
            String numero = input.next();
            aggiungi(numero, A, input);
        } while (fine == false);
    }
    static Integer n = 0;

    public static void aggiungi(String numero, CapoAbbigliamento A, Scanner input) {

        switch (numero) {
            case "0":
                fine = true;
                break;
            case "1":
                System.out.println(A.toString());
                break;
            case "2":
                System.out.println("Quanti ne vuoi comprare? ");
                n = input.nextInt();
                A.vendita(n);
                break;
            case "3":
                A.faiReso(n);
                n = 0;
                break;
            case "4":
                A.ordinaDaFornitore();
                break;
        }

    }

}
