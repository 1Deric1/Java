package Sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //Protocolos UPD nao sao confiaveis e diferem dos TCP/IP q sao protocolos confiaveis
        System.out.println("Iniciando servidor...");
        //vetor de bytes com 1024 posicoes
        byte[] receData  = new byte[1024];
        //classe sao objetos q ficam escutando determinada porta
        DatagramSocket serverSocket = new DatagramSocket(5000);
        //receber os dados q vem da placa de rede
        DatagramPacket receivePacket = new DatagramPacket(receData,receData.length);
        while (true){
            //receive faz com q o programa pare e escuute a porta
            serverSocket.receive(receivePacket);
            //converti pra dentro da string
            String sentence = new String(receivePacket.getData());
            if (sentence.substring(0,3).equals("fim")){
                break;
            }
            //Pegando o endereco ip do pacote
            InetAddress IPAddress = receivePacket.getAddress();
            System.out.println("Server: "+IPAddress.getHostAddress() + ":" + sentence);
        }
        //todo socket tem q ser fechado
        serverSocket.close();
    }
}
