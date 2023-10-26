package Day14;

class A{
    void abc(){
        System.out.println("A");
    }
}
class B extends A{
    void abc(){
        System.out.println("B");
    }
}
class C extends A{
    void abc(){
        System.out.println("C");
    }
}
class D extends A{
    void abc(){
        System.out.println("D");
    }
}
class E extends A{
    void abc(){
        System.out.println("E");
    }
}

class Run{
    /*
    void run(A a){
        a.abc();
    }
    void run(B b){
        b.abc();
    }
    void run(C c){
        c.abc();
    }
    void run(D d){
        d.abc();
    }
    void run(E e){
        e.abc();
    }

     */
    /*
    void run(A a){
        if(a instanceof B){
            B b = (B)a;
            b.abc();
        }
        if(a instanceof C){
            C c= (C)a;
            c.abc();
        }
        if(a instanceof D){
            D d = (D)a;
            d.abc();
        }
        if(a instanceof E){
            E e = (E)a;
            e.abc();
        }
    }

     */
    void run(A a){
        a.abc();
    }
}


public class OverridingTest_1 {
    public static void main(String[] args) {
        Run r = new Run();

        B b = new B();
        C c = new C();
        D d = new D();

        A a = new B(); // 업캐스팅
        B b1= (B)a; //다운캐스팅


        r.run(b);
        r.run(c);
        r.run(d);

    }
}
