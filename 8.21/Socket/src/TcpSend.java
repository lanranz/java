import java.io.*;
import java.net.Socket;

public class TcpSend {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.9.151",5000);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        writer.write("hello");
        writer.newLine();
        writer.flush();
        String s = reader.readLine();
        System.out.println(s);
        socket.close();
    }
}
