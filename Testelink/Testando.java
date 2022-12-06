package Testelink;

import java.awt.Desktop;
import java.net.URI;

public class Testando {

    public static void main(String[] args){

        try{
            URI link = new URI("https://www.xnxx.com/video-4rancee/so_a_cabecinha_em_neide");
            Desktop.getDesktop().browse(link);
        }

        catch(Exception erro){
            System.out.println(erro);
        }
    }

}
