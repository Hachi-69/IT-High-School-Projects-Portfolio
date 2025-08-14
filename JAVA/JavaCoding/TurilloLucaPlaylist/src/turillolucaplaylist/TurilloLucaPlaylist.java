package turillolucaplaylist;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaPlaylist {

    static Boolean fine = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist A = new Playlist("", 0.0, 0, 0);
        do {
            System.out.println("Cosa si desidera fare?");
            System.out.println("0: ");
            System.out.println("1: ");
            System.out.println("2: ");
            System.out.println("3: ");
            String numero = input.next();
            aggiungi(numero, A, input);
        } while (fine == false);
    }

    public static void aggiungi(String numero, Playlist A, Scanner input) {

        switch (numero) {
            case "0":
                fine = true;
                break;
            case "1":
                
                break;
            case "2":
                
                break;
            case "3":
                System.out.println(A.toString());
                break;
        }

    }

}
