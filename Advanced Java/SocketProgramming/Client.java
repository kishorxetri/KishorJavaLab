package SocketProgramming;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            // Thread for receiving messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = input.readLine()) != null) {
                        System.out.println("\nServer: " + msg);
                        System.out.print("Client: ");
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            }).start();

            // Thread for sending messages
            String clientMsg;
            while ((clientMsg = console.readLine()) != null) {
                output.println(clientMsg);
                if (clientMsg.equalsIgnoreCase("exit")) break;
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
