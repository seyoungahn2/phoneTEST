package Day06;

public class MultiArrayTest1_4 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        a[3] = new int[5];

        System.out.println(a[3][2]);//? 0

        int[][][][] c = new int[4][][][];
        /*
        컴파일 에러
        1.c[0][0][0][0][0][0] = 200;
        런타임 에러
        2.c[0][0][0][0] = 100;
        */

        c[0] = new int[4][][];
    }
}
