package turillolucamuseo;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaMuseo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = input.next();
        Integer costoBiglietto;
        do {
            System.out.println("Costo biglietto:");
            costoBiglietto = input.nextInt();
        } while (costoBiglietto <= 0);
        Integer capacitaMassima;
        do {
            System.out.println("Capacita' massima museo:");
            capacitaMassima = input.nextInt();
        } while (capacitaMassima <= 0);
        Museo A = new Museo(nome, costoBiglietto, capacitaMassima);
        String numero;
        do {
            System.out.println("Cosa si desidera fare?");
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Entrata visitatore");
            System.out.println("3: Uscita visitatore");
            System.out.println("4: Apri Museo");
            System.out.println("5: Chiudi museo");
            numero = input.next();
            aggiungi(numero, A);
        } while (!numero.contains("0"));
    }
    static Integer n = 0;

    public static void aggiungi(String numero, Museo A) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(A.toString());
        } else if (numero.contains("2")) {
            A.entrataVisitatori();
        } else if (numero.contains("3")) {
            A.uscitaVisitatori();
        } else if (numero.contains("4")) {
            A.apriMuseo();
        } else if (numero.contains("5")) {
            A.chiudiMuseo();
        }
    }
}
