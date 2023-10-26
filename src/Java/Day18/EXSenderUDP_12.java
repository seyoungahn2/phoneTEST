package Java.Day18;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class EXSenderUDP_12 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ia = InetAddress.getByName("192.168.30.161");
        int port = 8888;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        DatagramPacket dp = new DatagramPacket(str.getBytes(),
                str.getBytes().length,ia,port);
        ds.send(dp);
    }
}
