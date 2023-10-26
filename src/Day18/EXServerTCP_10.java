package Day18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EXServerTCP_10 {
    public static void main(String[] args) throws IOException {

        int port = 7777; // 포트번호
        int times = 10; // Client와 통신 10번을 될 수 있게 정수 변수 선언
        ServerSocket ss = new ServerSocket(port);
        int i = 1; // times 와 비교하는 변수 선언
        while (i<=times){
            Socket s = ss.accept(); // Client 연결시 까지 대기 연결되면 소켓 객체를 Socket s 변수에 대입
            OutputStream os = s.getOutputStream(); // 소켓을 통해서 클라이언트로 out 하는 Stream 생성
            DataOutputStream dos = new DataOutputStream(os); // 데이터를 좀 더 편하게 보내기 위해서 DataOutputStream으로
                                                            // 객체 생성 후 매개변수 위에 OutputStream 을 대입
            for(int j=1;j<=10;j++){
                dos.write(j); // DataOutputString -> OutputStream -> Socket -> Client
            }
            s.close();
            ++i;

        }
        ss.close();


    }
}
