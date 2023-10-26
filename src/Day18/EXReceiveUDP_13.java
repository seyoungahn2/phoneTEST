package Day18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class EXReceiveUDP_13 {
    public static void main(String[] args) throws IOException {
        int port = 8888;
        int times = 10;
        DatagramSocket ds = new DatagramSocket(port);
        int i = 1;
        while (i<=times){
            byte[] buffer = new byte[30];
            DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
            ds.receive(dp);
            String str = new String(dp.getData());
            System.out.println("수신된 데이터 : "+str);
            ++i;
        }
    }
}
