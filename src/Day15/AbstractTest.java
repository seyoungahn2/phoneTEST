package Day15;
abstract class A{
    int a;
    void abc(){
        System.out.println("aaaaa");
    }
    abstract void def();
    abstract void kor();
}
class B extends A{
    void def(){
        System.out.println("def");
    }
    void kor(){
        System.out.println("kor");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        //A a = new A();
        B b = new B();
        A a = new B();
        a.def();
        b.def();
    }
}
