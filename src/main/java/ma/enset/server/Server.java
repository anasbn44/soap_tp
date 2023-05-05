package ma.enset.server;

import jakarta.xml.ws.Endpoint;
import ma.enset.server.ws.BanqueService;

public class Server {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:1997/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("server starting...");
    }
}