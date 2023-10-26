package Day06;

public class MultiArrayTest2_5 {
    public static void main(String[] args) {
        int[][][] b = new int[2][2][2];

        int count = 1;

        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                for(int k = 0;k<b[i][j].length;k++){
                    b[i][j][k] = count++;
                }
            }
        }

        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                for(int k = 0;k<b[i][j].length;k++){
                    System.out.print(b[i][j][k]+"\t");
                }
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
            }
            System.out.println("===============================");
        }

        int [][][][][][][][] x = new int[2][2][2][2][2][2][2][2];
    }
}
