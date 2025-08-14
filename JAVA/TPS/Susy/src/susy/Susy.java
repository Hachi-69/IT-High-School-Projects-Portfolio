package susy;

/**
 *
 * @author Luca
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Susy {

    public static void main(String[] args) {
        ServerSocket sSocket;
        Socket connessione;
        final int PORT = 7777;
        OutputStream out;
        PrintWriter sOUT;

        int porta = 333;
        String host = "127.0.0.1"; // IP

        //SERVER\\
        try {
            sSocket = new ServerSocket(PORT);
            connessione = sSocket.accept();

            out = connessione.getOutputStream();
            sOUT = new PrintWriter(out);
            sOUT.println("Susy: Tutto bene grazie"); // risposta
            sOUT.close();

            connessione.close();

        } catch (IOException e) {
            System.err.println(e);
        }

        //CLIENT\\
        try (Socket socket = new Socket(host, porta)) {
            InputStream i = socket.getInputStream();
            InputStreamReader is = new InputStreamReader(i);
            BufferedReader br = new BufferedReader(is);
            String stringa;
            System.out.println("Susy: A te come va'?");
            while ((stringa = br.readLine()) != null) {
                System.out.println(stringa);
            }
            i.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Errore I/O: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

}
