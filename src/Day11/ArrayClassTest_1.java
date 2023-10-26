package Day11;

class A{
    int num;
}
public class ArrayClassTest_1 {

    public static void main(String[] args) {
        A[] a = new A[5];

        for(int i = 0;i<a.length;i++){
            a[i] = new A(); // 객체 생성작업.
            a[i].num = i;
        }

        for(int i = 0;i<a.length;i++){
            System.out.println(a[i].num);
        }
    }
}
