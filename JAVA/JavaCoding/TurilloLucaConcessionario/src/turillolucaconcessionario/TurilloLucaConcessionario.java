package turillolucaconcessionario;

import java.util.Scanner;

/**
 *
 * @author Turillo Luca
 */
public class TurilloLucaConcessionario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Auto[] elenco;

        System.out.println("Nome Concessionario:");
        String nome = input.next();

        Integer n = 0;
        do {
            System.out.println("Dimensione concessionario:");
            n = input.nextInt();
        } while (n <= 0);

        elenco = new Auto[n];

        for (int i = 0; i < elenco.length; i++) {
            System.out.println((i + 1) + " Veicolo:");
            System.out.println("Marca:");
            String marca = input.next();

            Integer prezzo = 0;
            do {
                System.out.println("Prezzo:");
                prezzo = input.nextInt();
            } while (prezzo <= 0);

            Integer anno = 0;
            do {
                System.out.println("Anno:");
                anno = input.nextInt();
            } while (anno <= 0);

            String carburante = "";
            String nCar = "";
            do {
                System.out.println("Scegli il tipo di carburante: ");
                System.out.println("1: Benzina");
                System.out.println("2: Gasolio");
                System.out.println("3: GPL");
                System.out.println("4: Metano");
                System.out.println("5: Elettricita'");
                nCar = input.next();
            } while (!nCar.contains("1") && !nCar.contains("2") && !nCar.contains("3") && !nCar.contains("4") && !nCar.contains("5"));

            if (nCar.contains("1")) {
                carburante = "Benzina";
            } else if (nCar.contains("2")) {
                carburante = "Gasolio";
            } else if (nCar.contains("3")) {
                carburante = "GPL";
            } else if (nCar.contains("4")) {
                carburante = "Metano";
            } else if (nCar.contains("5")) {
                carburante = "Elettricita";
            }
            elenco[i] = new Auto(marca, prezzo, anno, carburante);
        }

        Concessionario c = new Concessionario(nome, elenco);

        System.out.println("Concessionario: " + nome);
        for (int i = 0; i < elenco.length; i++) {
            System.out.println("Veicolo " + (i + 1) + ": " + elenco[i].toString());
        }

        String numero = "";
        do {
            Integer pos = 0;
            Boolean fine = true;
            do {
                System.out.println("Parcheggio concessionario:");
                pos = input.nextInt();
                if (pos >= 0 && pos < n) {
                    fine = false;
                } else {
                    System.out.println("Posizione compresa tra 0 e " + (n - 1));
                }
            } while (fine);
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Vendi auto");
            System.out.println("3: Compra auto");
            numero = input.next();
            menu(numero, elenco, pos, input, c);
        } while (!numero.contains("0"));
    }

    public static void menu(String numero, Auto elenco[], Integer pos, Scanner input, Concessionario c) {

        if (numero.contains("0")) {

        } else if (numero.contains("1")) {
            System.out.println(elenco[pos].toString());
        } else if (numero.contains("2")) {
            c.vendiAuto(pos);
        } else if (numero.contains("3")) {

            System.out.println("Marca:");
            String marca = input.next();

            Integer prezzo = 0;
            do {
                System.out.println("Prezzo:");
                prezzo = input.nextInt();
            } while (prezzo <= 0);

            Integer anno = 0;
            do {
                System.out.println("Anno:");
                anno = input.nextInt();
            } while (anno <= 0);

            String carburante = "";
            String nCar = "";
            do {
                System.out.println("Scegli il tipo di carburante: ");
                System.out.println("1: Benzina");
                System.out.println("2: Gasolio");
                System.out.println("3: GPL");
                System.out.println("4: Metano");
                System.out.println("5: Elettricita'");
                nCar = input.next();
            } while (!nCar.contains("1") && !nCar.contains("2") && !nCar.contains("3") && !nCar.contains("4") && !nCar.contains("5"));

            if (nCar.contains("1")) {
                carburante = "Benzina";
            } else if (nCar.contains("2")) {
                carburante = "Gasolio";
            } else if (nCar.contains("3")) {
                carburante = "GPL";
            } else if (nCar.contains("4")) {
                carburante = "Metano";
            } else if (nCar.contains("5")) {
                carburante = "Elettricita";
            }
            elenco[pos] = new Auto(marca, prezzo, anno, carburante);

            c.compraAuto(pos, marca, anno, prezzo, carburante);

        }
    }
}
