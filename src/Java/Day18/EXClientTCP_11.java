package Java.Day18;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class EXClientTCP_11 {
    public static void main(String[] args) throws IOException {
        String server = "192.168.30.161";
        int port = 7777;
        Socket c = new Socket(server,port); // 연결됨
        InputStream is = c.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        for(int i = 1;i<=10;i++){
            int j = dis.read();
            System.out.println("서버로 부터 받은 데이터 "+ j +"출력");
        }
        c.close();
    }
}
