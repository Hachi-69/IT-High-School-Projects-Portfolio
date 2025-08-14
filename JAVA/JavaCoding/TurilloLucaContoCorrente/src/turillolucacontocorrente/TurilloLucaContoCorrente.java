package turillolucacontocorrente;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLucaContoCorrente {

    static String numeroConto;
    static Boolean fine = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        System.out.println("Inserisci il SALDO del conto: ");
        Double saldoAttuale = input.nextDouble();
        System.out.println("Inserisci il FIDO del conto: ");
        Double fido = input.nextDouble();
        ContoCorrente A = new ContoCorrente(numeroConto, saldoAttuale, fido);

        do {
            System.out.println("Cosa si desidera fare?");
            System.out.println("0: Esci");
            System.out.println("1: Versa");
            System.out.println("2: Preleva");
            System.out.println("3: Stampa");
            String numero = input.next();
            aggiungi(numero, A, input);
        } while (fine == false);
    }

    public static void aggiungi(String numero, ContoCorrente A, Scanner input) {

        switch (numero) {
            case "0":

                fine = true;
                break;
            case "1":
                System.out.println("Quanto vuoi versare:");
                Double versare = input.nextDouble();
                A.versa(versare);
                break;
            case "2":
                System.out.println("Quanto vuoi prelevare:");
                Double prelevare = input.nextDouble();
                A.preleva(prelevare);
                break;
            case "3":
                System.out.println(A.toString());
                break;
        }

    }

}
