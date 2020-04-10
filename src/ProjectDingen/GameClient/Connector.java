package ProjectDingen.GameClient;

import java.io.IOException;
import java.net.Socket;

public class Connector {

    static int noOfObjects = 0;
    String ip;
    int port;
    Socket socket;

    public Connector (String ip, int port) {
        noOfObjects +=1;
        this.ip = ip;
        this.port = port;
        try {
            this.socket = new Socket(ip,port);
        }
        catch (IOException ex) { System.err.println(ex.getMessage());}
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Socket getSocket() {return socket;}


}
