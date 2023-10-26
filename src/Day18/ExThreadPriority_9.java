package Day18;

class PriorityTest extends Thread{
    public PriorityTest(String str){
        setName(str);
    }
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(i+getName()+"우선순위 : "+getPriority());
        }
    }
}

public class ExThreadPriority_9 {
    public static void main(String[] args) {
        PriorityTest t1 = new PriorityTest(": 첫번째 쓰레드");
        PriorityTest t2 = new PriorityTest(": 두번째 쓰레드");
        PriorityTest t3 = new PriorityTest(": 세번째 쓰레드");

        t1.setPriority(Thread.MAX_PRIORITY);//최고
        t2.setPriority(Thread.NORM_PRIORITY);//최고
        t3.setPriority(Thread.MIN_PRIORITY);//최고

        t1.start();
        t2.start();
        t3.start();
    }

}
