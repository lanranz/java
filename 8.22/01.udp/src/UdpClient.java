import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpClient {
    public static void main(String[] args) throws SocketException {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if("quit".equals(s)){
                break;
            }
            try {
                String[] split = s.split(" ");
                byte[] bytes = split[2].getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName(split[0]), Integer.parseInt(split[1]));
                socket.send(datagramPacket);
            } catch (Exception e) {
                System.out.println("输入不合法");
            }
        }
        socket.close();
    }
}
