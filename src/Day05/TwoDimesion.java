package Day05;

public class TwoDimesion {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(arr);
        for(int i= 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
