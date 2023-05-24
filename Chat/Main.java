package Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try (ServerSocket serverSocket = new ServerSocket(5103)){
            //Espera o cliente se conectar para pular pra a proxima linha
            System.out.println("Loading connection server....");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            try (InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream())){
                BufferedReader reader = new BufferedReader(inputStreamReader);
                //O BufferedReader é uma classe em Java que melhora a eficiência e a facilidade de leitura de caracteres de um fluxo de entrada, permitindo a leitura de linhas inteiras em vez de caracteres individuais.
                String line;
                //O método readLine() lê caracteres do fluxo de entrada até encontrar um caractere de nova linha ('\n') ou até alcançar o final do fluxo de entrada. Em seguida, ele retorna a linha de texto lida como uma String, excluindo o caractere de nova linha.
                while (((line = reader.readLine()) != null)) {
                    System.out.println("Cliente: " + line);
                }
                serverSocket.close();

            }
            catch (IOException e){
                System.out.println("Erro ao ler dados do cliente: " + e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
        
    }
}
