package esempiofilereaderfilewriternumeroconstringtokenizer;

import java.io.*;
import java.util.StringTokenizer;

public class EsempioFileReaderFileWriterNumeroConStringTokenizer {

    public static void main(String[] args) {
        /*
         Fase di scrittura su file di testo sfruttando il concetto di token
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
             Preparo tre stringhe qualsiasi da scrivere su file.
            Notate che una di esse presenta al suo interno i due punti(:) per 
            separare le parole che compongono la stringa. Tale carattere(scelto arbitrariamente)
            funge da carattere separatore o delimitatore, ossia spezzetta la stringa in token.
             */
            String primaStringaDaScrivereSuFile = "Io:sono:la:prima:stringa:che:viene:scritta";
            String secondaStringaDaScrivereSuFile = "Io sono la seconda stringa che viene scritta";
            String terzaStringaDaScrivereSuFile = "Io-sono-la-terza-stringa-che-viene-scritta";
            /*
             Le scrivo usando il metodo println. Vedremo poi in lettura che effetto si ottiene,
             rispetto all'uso del print.
             */
            pw.println(primaStringaDaScrivereSuFile);
            /*
            secondaStringaDaScrivereSuFile ed terzaStringaDaScrivereSuFile
            non presentavano lo stesso carattere separatore di primaStringaDaScrivereSuFile,
            perciò prima di scriverle su file faccio in modo di inserircelo usando il metodo
            replaceAll.
            */
            pw.println(secondaStringaDaScrivereSuFile.replaceAll(" ", ":"));
            pw.println(terzaStringaDaScrivereSuFile.replaceAll("-", ":"));
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
            Variabile che conta quante stringhe(linee di testo) si sono lette dal file.
            Non serve a nulla ai fini della lettura, ma ci servono in fase di stampa per
            capire quale stringa stiamo spezzettando.
            */
            int numeroStringheLette=0;
            /*
            Variabile che conta quanti token compongono la stringa.
            Non serve a nulla ai fini della divisione in token della stringa, ma
            ci serve per avere delle informazioni aggiuntive in fase di stampa
            */
            int numeroTokenNellaStringa=0;
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
            Oggetto della classe StringTokenizer che ci consente di spezzettare la stringa in più
            parti(token) sfruttando un carattere separatore usato in fase di scrittura.
            Nel nostro esempio il carattere separatore sono i due punti( : )
            */
            StringTokenizer st=null;
            /*
            Stringa di appoggio che conterrà i token che compongono la stringa letta
            */
            String singoloToken=null;
            /*
             Ciclo per continuare la lettura del file
             */
            while (stringaLettaDaFile != null) {
                /*
                Abbiamo letto una nuova stringa(linea) del file. Dunque incrementiamo il contatore
                numeroStringheLette. Ancora non sappiamo quanti token compongono la stringa, quindi
                azzeriamo il contatore numeroTokenNellaStringa.
                */
                numeroStringheLette++;
                numeroTokenNellaStringa=0;
                /*
                Creo lo stringTokenizer per la stringa appena letta
                */
                st=new StringTokenizer(stringaLettaDaFile,":");
                /*
                spezzetto la stringa in token e li passo in rassena uno ad uno
                */
                while(st.hasMoreTokens()){
                    /*
                    Estraggo il token e quindi incremento di 1 il contatore del numero di token nella stringa
                    */
                    singoloToken=st.nextToken();
                    numeroTokenNellaStringa++;
                    /*
                    Stampa di tutte le informazioni
                    */
                    System.out.println("Stringa numero: "+numeroStringheLette+" Token numero: "+numeroTokenNellaStringa+" Token: "+singoloToken);
                }
                /*
                Leggo l'eventuale stringa(linea)successiva
                */
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
