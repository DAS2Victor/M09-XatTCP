
package Servidor;


public class Servidor {

    public static void main(String[] args) {
        TcpSocketServer servidor = new TcpSocketServer();
        servidor.listen();
    }
    
}
