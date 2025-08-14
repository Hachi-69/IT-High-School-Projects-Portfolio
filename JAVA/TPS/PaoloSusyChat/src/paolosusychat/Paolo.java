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
public class Paolo implements Runnable {

    int cPort;
    int sPort;

    public Paolo(int cPort, int sPort) {
        this.cPort = cPort;
        this.sPort = sPort;
    }

    @Override
    public void run() {
        int porta = cPort;
        String host = "127.0.0.1"; // IP

        ServerSocket sSocket;
        Socket connessione;
        final int PORT = sPort;
        OutputStream out;
        PrintWriter sOUT;

        //CLIENT\\
        try (Socket socket = new Socket(host, porta)) {
            System.out.println("Paolo: Hey ciao Susy come va'?"); // Domanda
            try (InputStream i = socket.getInputStream()) {
                InputStreamReader is = new InputStreamReader(i);
                BufferedReader br = new BufferedReader(is);
                String stringa;
                while ((stringa = br.readLine()) != null) {
                    System.out.println(stringa); // Risposta di susy
                }
            }
            socket.close();
        } catch (IOException e) {
            System.out.println("Errore I/O: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        //SERVER\\
        try {
            sSocket = new ServerSocket(PORT);
            connessione = sSocket.accept();

            out = connessione.getOutputStream();
            sOUT = new PrintWriter(out);
            sOUT.println("Paolo: Anche a me tutto ok"); // risposta
            sOUT.close();

            connessione.close();
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
