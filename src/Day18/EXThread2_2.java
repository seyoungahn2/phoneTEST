package Day18;

public class EXThread2_2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest t1 = new ThreadTest(" : 배우기 쉬운 자바");
        ThreadTest t2 = new ThreadTest(" : 배우기 어려운 자바");
        System.out.println("*************스레드 시작 전 ****************");
        t1.start();
        t2.start();
        t1.join(); // 스레드 시작 후 바이가 출력 되게끔 하는 역할 메인을 기다려줌
        t2.join();
        System.out.println("********** 스레드 시작 후 *************");
        System.out.println("바이 ~~~~~~~~~~~~~~~");
        

    }
}
