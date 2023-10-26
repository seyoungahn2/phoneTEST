package Day09;

public class MethodTestArray_1 {

    static void abc(int[] temp){ //Call by reference
         // temp 배열 인덱스 0에 10을 대입
         temp[0] = 10;
    }

    static int[][] def(){
        int[][][][] temp = new int[3][3][3][3];
        return temp[0][0];
    }

    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        //1번
        abc(array[0][0]);
        System.out.println(array[0][0][0]);
        int[][] a=def();
        a[0][0] =10;
        int[][] b= def();
        System.out.println(b[0][0]);
    }
}
