package Day06;

public class MultiArrayTest1 {
    public static void main(String[] args) {
        int [] [] a = new int [5] [] ;
        a[3] =new int [5] ;


        System.out.println(a[3][2]);


        int[][][][] c = new int [4][][][];
       /*
        1.c[0][0][0][0][0][0][0][0] = 200; // 컴파일 에러

        2. c[0][0][0][0] = 100; // 런타임 에러
        런타임 에러가 더 무섭다.
        */


        c[0] = new int[4][][];



    }
}
