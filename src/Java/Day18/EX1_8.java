//package Java.Day18;
//
//import java.net.InetAddress;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.UnknownHostException;
//
//public class EX1_8 {
//    public static void main(String[] args) throws UnknownHostException,
//            MalformedURLException {
//        // TODO Auto-generated method stub
//        InetAddress address = InetAddress.getLocalHost();
//        System.out.println("로컬 컴퓨터의 이름 : "+ address.getHostName());
//        System.out.println("로컬 컴퓨터의 IP 주소 : " + address.getHostAddress());
//        InetAddress[] all = InetAddress.getAllByName("www.naver.com");
//        for(int i=0;i<all.length;i++) {
//            System.out.println(all[i]);
//        }
//        URL starbuks = new URL("https://www.starbucks.co.kr/index.do");
//
//        System.out.println("프로토콜 : "+ starbuks.getProtocol());
//        System.out.println("포트 : "+starbuks.getPort());
//        System.out.println("호스트 : "+starbuks.getHost());
//        System.out.println("파일(경로포함) : "+starbuks.getFile());
//        System.out.println("전체 URL : "+starbuks.toExternalForm());
//    }
//}
