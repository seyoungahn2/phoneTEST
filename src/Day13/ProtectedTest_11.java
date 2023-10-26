package Day13;

class C{
    protected int c;
    private int d;
    int e;
}
class D extends C{
    void abc(){
        c = 10;
        //d = 10;
        e = 20;
    }
}
class E{
    D d = new D();

    void def(){
        d.c = 20;
    }
}
public class ProtectedTest_11 {
    public static void main(String[] args) {
        D d = new D();
        d.c = 20;
    }
}
