package Day13;

class A1{
    int a;
}
class B1 extends A1{
    int b;
}
class C1 extends A1{
    int c;
}
class D1 extends A1{
    int d;
}

public class CastingTest1_15 {
    public static void main(String[] args) {
        A1 a = new B1();// 업 캐스팅
        B1 b = (B1)a; // 다운 캐스팅
        b.b = 20;

        A1[] listA = new A1[10];

        listA[0] = new B1();
        listA[1] = new C1();
        //listA[1].c = 20;
        listA[2] = new D1();
        listA[3] = b;
        //listA[3].a = 20; 경고 에요!


        if(listA[1] instanceof C1){
            C1 c1 = (C1)listA[1];
        }

        System.out.println(((B1)listA[3]).b);

    }
}
