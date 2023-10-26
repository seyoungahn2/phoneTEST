package Java.Day18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EXServerTCP_10 {
    public static void main(String[] args) throws IOException {
        int port = 7777;// 포트번호
        int times = 10; // Client와 통신 10번을 될 수 있게 정수 변수 선언
        ServerSocket ss = new ServerSocket(port);
        int i = 1;// times와 비교하는 변수 선언
        while(i<=times){
            // Client 연결시 까지 대기 연결 되면 소켓 객체를 Socket s 변수에 대입
            Socket s = ss.accept();
            // 소켓을 통해서 클라이언트로 out하는 Stream 생성
            OutputStream os = s.getOutputStream();
            //데이터를 좀 더 편하게 보내기 위해서 DataOutputStream
            //객체를 생성 후 매개변수 위에 OutputStream을 대입
            DataOutputStream dos = new DataOutputStream(os);
            for(int j = 1;j<=10;j++){
                // DataOutputStream -> OutputStream -> Socket -> Client
                dos.write(j);
            }
            s.close();
            ++i;
        }
        ss.close();
    }
}
