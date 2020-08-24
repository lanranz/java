import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class ReceiveSocket {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
            socket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            int len = datagramPacket.getLength();
            System.out.println(new String(data,0,len));
        }

    }

}
