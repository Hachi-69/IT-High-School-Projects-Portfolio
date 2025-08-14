package turillolucaarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */

public class TurilloLucaArray {

    public static Random rnd = new Random();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Intero: ");
        Integer intero = input.nextInt();

        Integer[] array = returnArray(intero);

        Double somma = sommaArray(array);

        Integer minimo = ricercaMinimo(array);

        Integer massimo = ricercaMassimo(array);

        Double media = mediaArray(somma, array);

        System.out.println("Cerca un numero tra 0 e 100;");
        
        Integer ricercaNumero = input.nextInt();
        Integer numeroTrovato = ricercaArray(array, ricercaNumero);

        stampaRisultati(somma, minimo, massimo, media, numeroTrovato);
    }

    public static void stampaRisultati(Double somma, Integer minimo, Integer massimo, Double media, Integer numeroTrovato) {
        System.out.println("La somma: " + somma);
        System.out.println("Il minimo: " + minimo);
        System.out.println("Il massimo: " + massimo);
        System.out.println("La media: " + media);
        if (numeroTrovato >= 1) {
            System.out.println("Numero trovato dentro l'array " + numeroTrovato + " volte");
        } else {
            System.out.println("Numero non trovato dentro l'array");
        }
    }

    public static Integer[] returnArray(Integer n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(100);
            System.out.println(i + "° " + array[i]);
        }
        return array;
    }

    public static Double sommaArray(Integer array[]) {
        Double somma = 0.0;
        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }
        return somma;
    }

    public static Integer ricercaMinimo(Integer array[]) {
        int min = array[0];

        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }

        }
        return min;
    }

    public static Integer ricercaMassimo(Integer array[]) {
        int max = array[0];

        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }

        }
        return max;
    }

    public static Double mediaArray(Double somma, Integer array[]) {
        Double media = 0.0;
        media = somma / array.length;
        return media;
    }

    public static Integer ricercaArray(Integer array[], Integer numero) {
        Integer counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                counter++;
            }
        }
        return counter;
    }
}
