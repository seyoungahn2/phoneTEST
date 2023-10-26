package Java.Day18;

class Account{
    private int total = 0;
    //성금내는 메소드
    synchronized void deposit(){
        total += 1000;
    }
    //모인 성금 얼마인지 알려주는 메소드
    public int getTotal() {
        return total;
    }
}
class Customer extends Thread{
    Account a;
    Customer(Account a, String name){
        this.a = a;
        setName(name);
    }

    public void run(){
        int i = 0; // 몇 번째 확인용
        while(true){
            System.out.println(getName()+" : "+ (++i) +"번째");
            a.deposit();
            if(a.getTotal() >= 500000){
                break;
            }
        }
    }
}

public class Q1_5 {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account();
        /*
        String[] names = {"1번째 성금자","2번째 성금자","3번째 성금자","4번째 성금자","5번째 성금자"};
        Customer[] customers = new Customer[5];
        for(int i = 0;i<customers.length;i++){
            customers[i] = new Customer(a,names[i]);
        }
        for(int i = 0;i<customers.length;i++){
            customers[i].start();
            customers[i].join();
        }*/
        Customer c1 = new Customer(a,"1번째 성금자");
        Customer c2 = new Customer(a,"2번째 성금자");
        Customer c3 = new Customer(a,"3번째 성금자");
        Customer c4 = new Customer(a,"4번째 성금자");
        Customer c5 = new Customer(a,"5번째 성금자");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();

        System.out.println("성금 총액은 : "+a.getTotal());
    }
}
