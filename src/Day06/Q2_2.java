package Day06;

public class Q2_2 {
    public static void main(String[] args) {
        int count = 1;
        int[][] a = new int[5][5];

        for(int i = 0;i<a.length;i++){
            if(i % 2 == 0){
                for(int j = 0;j<a[i].length;j++){
                    a[i][j] = count++;
                }
            }
            else{
                for(int j =a[i].length-1;j>=0;j--){
                    a[i][j] = count++;
                }
            }
        }

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        int[][] b = new int[5][5];
        count = 1;
        int sw = 1;

        for(int i =0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                if(sw == 1){
                    b[i][j] = count++;
                }
                else{
                    b[i][b[i].length-j-1] = count++;
                }
            }
            sw = sw * -1;
        }

        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

    }
}



