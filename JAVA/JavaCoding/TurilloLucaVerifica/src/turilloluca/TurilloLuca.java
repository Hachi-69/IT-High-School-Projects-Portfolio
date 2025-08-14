package turilloluca;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */
public class TurilloLuca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PuntoRifornimento[] punto;

        System.out.println("Marca stazione di servizio:");
        String marcaS = input.next();
        Integer dimStazione = 0;
        do {
            System.out.println("Dimensione stazione:");
            dimStazione = input.nextInt();
        } while (dimStazione <= 0);
        punto = new PuntoRifornimento[dimStazione];

        for (int i = 0; i < punto.length; i++) {
            Integer numeroP = 0;
            do {
                System.out.println("Numero postazione:");
                numeroP = input.nextInt();
            } while (numeroP <= 0);

            String carburante = "";
            do {
                System.out.println("Tipo carburante: ");
                System.out.println("1: Benzina");
                System.out.println("2: Gasolio");
                System.out.println("3: GPL");
                System.out.println("4: Metano");
                carburante = input.next();
            } while (!carburante.contentEquals("1") && !carburante.contentEquals("2") && !carburante.contentEquals("3") && !carburante.contentEquals("4"));
            if (carburante.contentEquals("1")) {
                carburante = "Benzina";
            } else if (carburante.contentEquals("2")) {
                carburante = "Gasolio";
            } else if (carburante.contentEquals("3")) {
                carburante = "GPL";
            } else if (carburante.contentEquals("4")) {
                carburante = "Metano";
            }

            Integer costoAlLitro = 0;
            do {
                System.out.println("Costo al litro:");
                costoAlLitro = input.nextInt();
            } while (costoAlLitro <= 0);

            Integer numeroMaxLitri = 0;
            do {
                System.out.println("Numero max litri:");
                numeroMaxLitri = input.nextInt();
            } while (numeroMaxLitri <= 0);

            punto[i] = new PuntoRifornimento(numeroP, carburante, costoAlLitro, numeroMaxLitri);
        }
        StazioneDiServizio s = new StazioneDiServizio(marcaS, punto);

        System.out.println("Stazione: " + marcaS);
        for (int i = 0; i < punto.length; i++) {
            System.out.println("Punto " + (i + 1) + ": " + s.getElencoPunti()[i].toString());
        }

        String numero;
        do {
            Integer pos = 0;
            Boolean fine = true;
            do {
                System.out.println("Seleziona postazione:");
                pos = input.nextInt();
                if (pos >= 0 && pos < dimStazione) {
                    fine = false;
                } else {
                    System.out.println("Posizione compresa tra 0 e " + (dimStazione - 1));
                }
            } while (fine);
            System.out.println("0: Esci");
            System.out.println("1: Stampa");
            System.out.println("2: Occupa punto rifornimento");
            System.out.println("3: libera punto rifornimento");
            System.out.println("4: Eroga carburante");
            System.out.println("5: Rifornisci punto");
            System.out.println("6: Eroga caburante da punto");
            System.out.println("7: Conta punti rifornimento liberi");
            System.out.println("8: Elenca punti rifornimento liberi");
            System.out.println("9: Calcola litri venduti");
            System.out.println("10: Trova miglior punto");
            System.out.println("11: Trova peggior punto");
            System.out.println("12: Rabbocca punto sotto soglia");
            numero = input.next();
            menu(numero, punto, pos, input, s);
        } while (!numero.contentEquals("0"));
    }

    public static void menu(String numero, PuntoRifornimento punto[], Integer pos, Scanner input, StazioneDiServizio s) {

        if (numero.contentEquals("0")) {

        } else if (numero.contentEquals("1")) {
            System.out.println(punto[pos].toString());
        }
        
        else if (numero.contentEquals("2")) {
            s.getElencoPunti()[pos].occupaPuntoRifornimento();
        }
        
        else if (numero.contentEquals("3")) {
            s.getElencoPunti()[pos].liberaPuntoRifornimento();
        }
        
        else if (numero.contentEquals("4")) {
            s.getElencoPunti()[pos].erogaCarburante();
        }
        
        else if (numero.contentEquals("5")) {
            s.getElencoPunti()[pos].rifornisciPunto();
        }
        
        else if (numero.contentEquals("6")) {
            s.erogaCaburanteDaPunto(pos);
        }
        
        else if (numero.contentEquals("7")) {
            System.out.println("Numero di punti di rifornimento liberi: " + s.contaPuntiRifornimentoLiberi());
        }
        
        else if (numero.contentEquals("8")) {
            System.out.println("Punti di rifornimento liberi: " + s.elencaPuntiRifornimentoLiberi());
        }
        
        else if (numero.contentEquals("9")) {
            System.out.println("Litri venduti: " + s.calcolaLitriVenduti(pos));
        }
        
        else if (numero.contentEquals("10")) {
            System.out.println(s.trovaMigliorPunto());
        }
        
        else if (numero.contentEquals("11")) {
            System.out.println(s.trovaPeggiorPunto());
        }
        
        else if (numero.contentEquals("12")) {
            System.out.println("s.rabboccaPuntoSottoSoglia()");
        }

    }
}
