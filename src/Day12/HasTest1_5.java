package Day12;

class B{

}
class C{
    B[] b = new B[5]; // has관계?? O
}
class D{
    B make(B[] b){ // has관계??  X
        b[2] = new B();
        return b[2];
    }
}

class E{
    D[][] d = new D[3][3];

    D[] sendD(D[][] d, int i, int j){
        d[i][j] = new D();
        return d[i];
    }
}

public class HasTest1_5 {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        D[][] d1 = new D[3][3];

        B b = d.make(c.b);

        E e = new E();

        D[] d2 =e.sendD(d1,0,2);

        //d1[2][0]은 객체가 있을까요? 없을까요? 없다.
        //1. 있다 2. 없다. 3. 물어보지마라 4. 말할 수 없다. 5. 비밀이다.

    }
}
