package paolo;

/**
 *
 * @author Luca
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Paolo {

    public static void main(String[] args) {
        int porta = 7777;
        String host = "127.0.0.1"; // IP

        ServerSocket sSocket;
        Socket connessione;
        final int PORT = 333;
        OutputStream out;
        PrintWriter sOUT;

        //CLIENT\\
        try (Socket socket = new Socket(host, porta)) {
            System.out.println("Paolo: Hey ciao Susy come va'?");
            InputStream i = socket.getInputStream();
            InputStreamReader is = new InputStreamReader(i);
            BufferedReader br = new BufferedReader(is);
            String stringa;
            while ((stringa = br.readLine()) != null) {
                System.out.println(stringa); // Risposta di susy
            }
            i.close();
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
