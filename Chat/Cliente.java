package Chat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(Socket serverSocket = new Socket("localhost",5103)){

            PrintStream saida = new PrintStream(serverSocket.getOutputStream());
            System.out.println("Client Connected");
            while (true) {
                System.out.println("Digite uma msg: ");
                String msg = sc.next();
                saida.println(msg);
                if ( msg.equals("exit")){
                    System.out.println("Server desconnected");
                   break;
               }

            }
            serverSocket.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
