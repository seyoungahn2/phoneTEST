package Day07;

public class CallByTest_8 {

    static void abc(int a){
        a = 20;
    }
    static void def(int[] a){
        a[0] = 20;
    }

    public static void main(String[] args) {
        //Call by Value
        int a = 10;
        abc(a);
        System.out.println(a); // 10


        //Call by Reference
        int[] b= new int[2];
        def(b);
        System.out.println(b[0]);// 20
    }
}
