package Day10;

class C{
    D makeD(){
        return new D();
    }
}

class D{
    int a;
}

public class ObjcectMethodTest_8 {
    public static void main(String[] args) {
        C c = new C();
        D d = c.makeD();
        D d1 = new D();
        d.a = 10;
    }
}
