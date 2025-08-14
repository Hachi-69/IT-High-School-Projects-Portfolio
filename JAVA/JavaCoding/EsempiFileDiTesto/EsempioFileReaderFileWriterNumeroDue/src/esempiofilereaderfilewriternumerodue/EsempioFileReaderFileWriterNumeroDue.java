package esempiofilereaderfilewriternumerodue;

import java.io.*;

public class EsempioFileReaderFileWriterNumeroDue {

    public static void main(String[] args) {
        /*
         Fase di scrittura su file di testo
         */
        /*
         Si inizia con il dichiarare i due stream necessari per la scrittura su file
         */
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            /*
             Inizializzo i due stream.
             Il primo stream è un FileWriter a cui passo il nome del file da scrivere
             ed un secondo parametreo opzionale per indicare che sia vuole scrivere in modalità append.
             Il secondo stream è un PrintWriter a cui passo come parametro il FileWriter creato prima.
             Si usa il PrintWriter perché mette a disposizione metodi di scrittura più avanzati
             ed immediati
             */
            fw = new FileWriter("prova.txt", true);
            pw = new PrintWriter(fw);
            /*
             Preparo tre stringhe qualsiasi da scrivere su file
             */
            String primaStringaDaScrivereSuFile = "Io sono la prima stringa che viene scritta";
            String secondaStringaDaScrivereSuFile = "Io sono la seconda stringa che viene scritta";
            String terzaStringaDaScrivereSuFile = "Io sono la terza stringa che viene scritta";
            /*
             Le scrivo usando il metodo println. Vedremo poi in lettura che effetto si ottiene,
            rispetto all'uso del print.
             */
            pw.println(primaStringaDaScrivereSuFile);
            pw.println(secondaStringaDaScrivereSuFile);
            pw.println(terzaStringaDaScrivereSuFile);
            /*
             flush dello stream
             */
            pw.flush();
        } catch (IOException ioe) {
            System.out.println("Problemi nella scrittura del file di testo");
        } finally {
            /*
             Chiusura dello stream
             */
            try {
                pw.close();
                fw.close();
            } catch (IOException ioe) {
                System.out.println("Problemi nella chiusura del file di testo");
            }
        }
        /*
         Fase di lettura da file di testo
         */
        /*
         Dichiarazione dei due stream per la lettura. 
        
         */
        FileReader fr = null;
        BufferedReader br = null;
        try {
            /*
             Inizializzo i due stream.
             Il primo è un FileReader a cui passiamo il nome del file da leggere.
             Il secondo è un BufferedReader a cui passiamo il file reader appena creato.
             Si usa il BufferedReader in quanto ci consente di leggere agevolmente il file di testo
             una riga alla volta
             */
            fr = new FileReader("prova.txt");
            br = new BufferedReader(fr);
            /*
             Dichiaro la variabile string in cui immagazzineremo ciò che si legge dal file
             */
            String stringaLettaDaFile = null;
            /*
             Immagazzino nella stringa la prima riga del file.
             Se il file è vuoto la stringa rimane null
             */
            stringaLettaDaFile = br.readLine();
            /*
             Ciclo per continuare la lettura del file
             */
            while (stringaLettaDaFile != null) {
                /*
                 Prima stampo e poi leggo perchè comunque sia una lettura 
                 preventiva l'avevamo fatta fuori dal ciclo
                 */
                System.out.println("Cosa abbiamo letto dal file: " + stringaLettaDaFile);
                stringaLettaDaFile = br.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Problemi nella lettura del file di testo");
        } finally {
            /*
             Chiusura dello stream
             */
            try {
                fr.close();
                br.close();
            } catch (IOException ioe) {
                System.out.println("Problemi nella chiusura del file di testo");
            }
        }

    }
}
