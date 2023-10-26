package Day18;

class RunableTest implements Runnable{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("재미있는 자바 : "+i);
        }
    }
}

public class EXRunable_3 {
    public static void main(String[] args) {
        RunableTest rt = new RunableTest();
        Thread t = new Thread(rt);
        t.start();
    }
}
