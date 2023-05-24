package Sockets;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        byte[] sendData;
        InetAddress IPAddress = InetAddress.getByName("localhost");
        DatagramSocket clientSocket = new DatagramSocket();

        while (true) {
            System.out.println("Digite algo: ");
            String sentence = sc.next();
            sendData = sentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);
            clientSocket.send(sendPacket);

            if (sentence.equals("fim")) {
                break;
            }
        }

        clientSocket.close();
    }
}
