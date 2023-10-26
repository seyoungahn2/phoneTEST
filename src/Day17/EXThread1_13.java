package Day17;

class ThreadTest extends Thread{
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("재미있는 자바 : "+i);
        }
    }
}
public class EXThread1_13 {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        for(int i = 0;i<10;i++){
            System.out.println("하이!!!!!!!");
        }
    }
}
