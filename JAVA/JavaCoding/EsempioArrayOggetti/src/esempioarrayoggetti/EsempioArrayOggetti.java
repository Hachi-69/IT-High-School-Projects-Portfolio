package esempioarrayoggetti;

import java.util.Scanner;

/**
 *
 * @author Tassi Francesco
 */
public class EsempioArrayOggetti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner per leggere valori in input
        Persona[] p = new Persona[3];//Creazione dell'array
        for (int i = 0; i < p.length; i++) { //Ciclo for per riempire l'array
            System.out.println("Inserisci il nome");
            String nome = input.next();//Lettura del nome
            Integer eta;
            do {
                System.out.println("Inserisci eta");
                eta = input.nextInt();//Lettura dell'eta
            } while (eta < 0);//Ciclo DoWhile per controllare se il valore di eta letto da tastiera sia maggiore di 0
            p[i] = new Persona(nome, eta);//Riempimento delle celle dell'array
        }

        for (int i = 0; i < p.length; i++) {//Ciclo for per controllare ogni casella dell'array e stampare quale persona e' maggiorenne e quale no
            System.out.println(p[i].toString());//Stampa a schermo la persona in posizione i dell'array
            if (p[i].isMaggiorenne() == true) {//Controllo se la persona in posizione i e' maggiorenne
                System.out.println("è maggiorenne");//Se il controllo e' vero stampo che e' maggiorenne
            } else {
                System.out.println("è minorenne");//Se il controllo e' falso stampo che e' minorenne
            }
        }
    }

}
