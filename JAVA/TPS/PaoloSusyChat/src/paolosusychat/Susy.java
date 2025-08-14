package paolosusychat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Luca
 */
public class Susy implements Runnable {

    int cPort;
    int sPort;

    public Susy(int sPort, int cPort) {
        this.cPort = cPort;
        this.sPort = sPort;
    }

    @Override
    public void run() {
        ServerSocket sSocket;
        Socket connessione;
        final int PORT = sPort;
        OutputStream out;
        PrintWriter sOUT;

        int porta = cPort;
        String host = "127.0.0.1"; // IP

        //SERVER\\
        try {
            sSocket = new ServerSocket(PORT);
            connessione = sSocket.accept(); // Domanda di Paolo

            out = connessione.getOutputStream();
            sOUT = new PrintWriter(out);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            sOUT.println("Susy: Tutto bene grazie"); // risposta
            sOUT.close();

            connessione.close();

        } catch (IOException e) {
            System.err.println(e);
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }
        //CLIENT\\
        try (Socket socket = new Socket(host, porta)) {
            System.out.println("Susy: A te invece come va'?"); // Domanda
            try (InputStream i = socket.getInputStream()) {
                InputStreamReader is = new InputStreamReader(i);
                BufferedReader br = new BufferedReader(is);
                String stringa;
                while ((stringa = br.readLine()) != null) {
                    System.out.println(stringa); // Risposta di Paolo
                }
            }
            socket.close();
        } catch (IOException e) {
            System.out.println("Errore I/O: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

}
