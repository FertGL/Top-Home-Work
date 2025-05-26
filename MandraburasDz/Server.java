package MandraburasDz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {

        int port = 777;
        ExecutorService threadPool = Executors.newCachedThreadPool();

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен на порту " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                threadPool.submit(() -> handleClient(clientSocket));
            }
        } catch (Exception ex) {
            System.out.println("Ошибка сервера: " + ex.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
             OutputStream output = clientSocket.getOutputStream()) {

            String request = reader.readLine();

            if (request != null) {
                String[] parts = request.split(" ");
                String operation = parts[0];
                double a = Double.parseDouble(parts[1]);
                double b = Double.parseDouble(parts[2]);

                double result = switch (operation) {
                    case "ADD" -> a + b;
                    case "SUB" -> a - b;
                    case "MUL" -> a * b;
                    case "DIV" -> b != 0 ? a / b : Double.NaN;
                    default -> Double.NaN;
                };

                String response = "Result: " + result + "\n";
                output.write(response.getBytes());
                output.flush();
            }

        } catch (Exception ex) {
            System.out.println("Ошибка : " + ex.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (Exception ignored) {}
        }
    }
}