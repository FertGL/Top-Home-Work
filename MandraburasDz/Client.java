package MandraburasDz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int port = 777;

        try (Socket socket = new Socket(serverAddress, port);
             OutputStream output = socket.getOutputStream();
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String operationRequest = "MUL 7 8\n";
            output.write(operationRequest.getBytes());
            output.flush();

            String response = input.readLine();
            System.out.println("Ответ сервера: " + response);

        } catch (Exception ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
    }
}
