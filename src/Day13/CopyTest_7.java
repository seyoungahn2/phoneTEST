package Day13;

class B{
    String name;
}

public class CopyTest_7 {
    public static void main(String[] args) {
        //얕은 복사
        B b = new B();
        b.name ="안녕";
        B b1 = b;
        //깊은 복사
        B b2 = new B();
        b2.name = b.name;
    }
}
