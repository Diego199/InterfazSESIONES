package sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.net.Socket;
import javax.swing.JTextField;

import sockets.Cliente;

public class SocketClient {

    public static void main(String[] args) {
//        para conectarns desde otros equipos hay que agregar cambiar 
//        localhost por la ip del servidor
        
        Cliente cl = new Cliente();
        String ip = cl.getIp() ;
        int puerto = parseInt(cl.getPuerto());
        
        
        
        System.out.println(" socket " + ip + " " + puerto);
        try {
            Socket sk = new Socket(ip, puerto);
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(sk.getInputStream()));
            PrintWriter salida = new PrintWriter(
                    new OutputStreamWriter(sk.getOutputStream()), true);
            System.out.println("enviando...");
            salida.println("Nombre usuario: " + " " + "agrege su nombre aqui");
            System.out.println("recibiendo ... " + entrada.readLine());
            sk.close();
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
    }

}
