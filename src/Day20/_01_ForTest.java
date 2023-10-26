package Day20;


import java.lang.reflect.Array;
import java.util.ArrayList;

class A {
    int a;
    A(int a){
        this.a =a;
    }
}
public class _01_ForTest {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};

        //for(자료구조에서 추출한 하나의 변수 : 자료구조)
        for(int i : arrays){
            System.out.println(i);
        }


        // 같은 방법 아래는 클래스를 참조

        ArrayList<A> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(new A(i));
        }
        for(A a:list){
            System.out.println(a.a);
        }

    }
}
