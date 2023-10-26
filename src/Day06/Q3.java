package Day06;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {

            int count = 1;



        int[][] b = new int[5][5];
        int sw = 1;

        for(int i = 0; i<b.length;i++){
            for(int j=0; j<b[i].length;j++){
                if(sw==1){
                    b[i][j]=count++;
                }

                else{
                    b[i][b[i].length-j-1]=count++;

                }
            }
            sw=sw*-1;
        }








    }
}
 /*
         for(int i = 0;i<5;i++){ // 5반복 -> 행
        for(int j = 0;j<5;j++){ //5반복 -> 열
        System.out.print("*");
        }
        System.out.println();
        }
        System.out.println();*/