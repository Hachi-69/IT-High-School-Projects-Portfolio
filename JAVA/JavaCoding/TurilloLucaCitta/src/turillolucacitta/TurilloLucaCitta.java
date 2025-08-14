package turillolucacitta;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaCitta {

    public static Boolean fine = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome citta?");
        String nome = input.next();
        System.out.println("Quale regione?");
        String regione = input.next();
        System.out.println("Quanti abitanti?");
        Integer abitanti = input.nextInt();
        Citta A = new Citta(nome, regione, abitanti);

        do {
            System.out.println("Cosa si desidera fare?");
            System.out.println("0: Esci");
            System.out.println("1: Rinomina citta");
            System.out.println("2: Cambia Regione");
            System.out.println("3: Aumenta abitanti");
            System.out.println("4: Diminuisci abitanti");
            System.out.println("5: Stampa");
            String numero = input.next();

            aggiungi(numero, A, input);
        } while (fine == false);
    }

    public static void aggiungi(String numero, Citta A, Scanner input) {

        switch (numero) {
            case "0":
                fine = true;
                break;
            case "1":
                System.out.println("Inserisci il nome da sostituire: ");
                String nome = input.next();
                A.setNome(nome);
                break;
            case "2":
                System.out.println("Inserisci la regione da sostituire: ");
                String regione = input.next();
                A.setRegione(regione);
                break;
            case "3":
                System.out.println("Di quanto vuoi aumentare gli abitanti? ");
                Integer abitantiMeno = input.nextInt();
                A.aumentaAbitanti(abitantiMeno);
                break;

            case "4":
                System.out.println("Di quanto vuoi diminuire gli abitanti? ");
                Integer abitantiPiu = input.nextInt();
                A.diminuisciAbitanti(abitantiPiu);
                break;
            case "5":
                System.out.println(A.toString());
                break;
        }

        

    }
}
