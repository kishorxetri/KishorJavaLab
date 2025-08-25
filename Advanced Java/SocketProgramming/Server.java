package SocketProgramming;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is listening on port 5000...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            // Thread for receiving messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = input.readLine()) != null) {
                        System.out.println("\nClient: " + msg);
                        System.out.print("Server: ");
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            }).start();

            // Thread for sending messages
            String serverMsg;
            while ((serverMsg = console.readLine()) != null) {
                output.println(serverMsg);
                if (serverMsg.equalsIgnoreCase("exit")) break;
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
