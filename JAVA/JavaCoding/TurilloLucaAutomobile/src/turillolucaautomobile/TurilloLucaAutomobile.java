package turillolucaautomobile;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaAutomobile {

    static Boolean fine = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Marca:");
        String marca = input.next();
        System.out.println("Modello:");
        String modello = input.next();
        System.out.println("Velocita' massima:");
        Integer velocitaMassima = input.nextInt();
        System.out.println("Numero marcie:");
        Integer numeroMarce = input.nextInt();
        System.out.println("Capacita' serbatoio");
        Integer capacitaSerbatoio = input.nextInt();

        Automobile A = new Automobile(marca, modello, velocitaMassima, numeroMarce, capacitaSerbatoio);

        do {
            System.out.println("Cosa si desidera fare?");
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Aumenta marcia");
            System.out.println("3: Scala marcia");
            System.out.println("4: Aumenta velocita'");
            System.out.println("5: Diminuisci velocita'");
            System.out.println("6: Consuma carburante");
            System.out.println("7: Rifornisci carburante");
            String numero = input.next();
            aggiungi(numero, A, input);
        } while (fine == false);
    }

    public static void aggiungi(String numero, Automobile A, Scanner input) {

        switch (numero) {
            case "0":
                fine = true;
                break;
            case "1":
                System.out.println(A.toString());
                break;
            case "2":
                A.aumentaMarcia();
                break;
            case "3":
                A.scalaMarcia();
                break;
            case "4":
                A.aumentaVelocita();
                break;
            case "5":
                A.diminuisciVelocita();
                break;
            case "6":
                A.consumaCarburante();
                break;
            case "7":
                A.rifornisciCarburante();
                break;
        }

    }

}
