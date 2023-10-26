package Day18;

class ThreadTest extends Thread{
    ThreadTest(String str){
        setName(str);
    }
    public void run(){
        for(int i =0; i<=10;i++){
            System.out.println(i+getName());
        }
        System.out.println("끝"+getName());
    }
}
public class EXThread1_1 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest(": 배우기 쉬운 자바");
        ThreadTest t2 = new ThreadTest(": 배우기 어려운 자바");
        t1.start();
        t2.start();
        System.out.println("바이~~~~~~~~");

    }

}
