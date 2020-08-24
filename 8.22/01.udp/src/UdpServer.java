import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket(5000);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        while (true){
            if("quit".equals(scanner.nextLine())){
                return;
            }
            socket.receive(packet);
            byte[] data = packet.getData();
            int length = packet.getLength();
            String s = new String(data,0,length);
            System.out.println(s);
        }
    }
}
