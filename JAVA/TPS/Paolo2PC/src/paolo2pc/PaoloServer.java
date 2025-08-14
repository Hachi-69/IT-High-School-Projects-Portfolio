package paolo2pc;

import java.io.*;
import java.net.*;
import javax.swing.JTextArea;

/**
 *
 * @author Turillo.Luca
 */
public class PaoloServer implements Runnable {

    DataInputStream dataInputStream;
    int serverPort;
    JTextArea atx;

    public PaoloServer(int serverPort, JTextArea atx) {
        this.serverPort = serverPort;
        this.atx = atx;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                InputStream inputStream = clientSocket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                String clientMessage = dataInputStream.readUTF();
                atx.append(clientMessage);
            }
        } catch (IOException e) {
        }
    }
}
