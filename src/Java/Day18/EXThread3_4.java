package Java.Day18;

class A{
    synchronized void plus(int i){
        for(int j = 0;j<5;j++){
            System.out.println(j*i);
            try {
                Thread.sleep(1000); // 0.4초를 잡니다.
            }catch (InterruptedException e){
                e.printStackTrace(); // 에러 출력하는 메소드
            }
        }
    }
}

class B extends Thread{
    A a;
    int i;
    B(A a, int i){
        this.a =a;
        this.i =i;
    }
    public void run(){
        a.plus(i);
    }
}

public class EXThread3_4 {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B(a,3);
        B b2 = new B(a,7);
        b1.start();
        b2.start();
    }
}
