
package Client;

public class Client {

    public static void main(String[] args) {
        int port = 9090;
        String ip = "localhost";
        TcpSocketClient client = new TcpSocketClient();
        client.connect(ip, port);
    }
    
}
