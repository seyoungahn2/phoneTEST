package Day09;



class A{
    int a = 10; // 속성
    void print(){
        System.out.println("a는 "+a+"입니다.");
    }
}

public class ClassTest1_7 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        //a.a = 10;
        a.print(); // a는 10입니다.
        b.print(); // a는 0입니다.
    }
}
