import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("服务器启动");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress().getHostAddress());

                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                boolean isEncode = Boolean.parseBoolean(reader.readLine());
                StringBuilder stringBuilder = new StringBuilder();
                int lines = Integer.parseInt(reader.readLine());
                System.out.println("行数：" + lines);
                int count = lines;
                while (count > 0) {
                    if (isEncode) {
                        stringBuilder.append(Encode.caesarEncode(reader.readLine()));
                    } else {
                        stringBuilder.append(Decode.caesarDecode(reader.readLine()));
                    }
                    stringBuilder.append("\n");
                    count--;
                }
                System.out.println("接收完成");

                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.write(lines + "");
                writer.newLine();
                writer.write(stringBuilder.toString());
                writer.flush();
                System.out.println("发送完成");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
