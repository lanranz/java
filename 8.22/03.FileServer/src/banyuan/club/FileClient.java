package banyuan.club;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",5000);
        OutputStream outputStream = socket.getOutputStream();

    }
}
