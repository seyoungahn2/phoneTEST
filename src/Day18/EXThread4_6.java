package Day18;

import java.util.function.Consumer;

class Buffer {
    private int contents;
    private boolean avaliable = false;

    public synchronized void put(int value) {
        while (avaliable == true) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        contents = value;
        System.out.println("생산자 ################# : 생산" + contents);
        notify();
        avaliable = true;
    }

    public synchronized int get() {
        while (avaliable == false) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("소비자 ###### : 소비 " + contents);
        notify();
        avaliable = false;
        return contents;
    }
}

class Producer extends Thread{
    private Buffer b;
    public Producer(Buffer b){
        this.b = b;
    }
    public void run(){
        for(int i=0; i<=10;i++){
            b.put(i);
        }
    }
}

class Cunsumer extends Thread{
    private Buffer b;
    public Cunsumer(Buffer b){
        this.b=b;
    }
    public void run(){
        int value = 0;
        for(int i=1; i<=10;i++){
            value =b.get();
        }
    }
}







public class EXThread4_6 {
    public static void main(String[] args) {
            Buffer b = new Buffer();
            Producer p = new Producer(b);
            Cunsumer c = new Cunsumer(b);

            p.start();
            c.start();
    }
}
