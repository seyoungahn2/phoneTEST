package Day06;

import java.util.Random;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
         /*   int a = 10;
             int b = 20;

             int temp=b; // temp <- 20 : temp=20
              b = a;  // b <- 10
              a = temp; // a <- 20

         */

        Random r = new Random(); // 초기화 작업을 위해서 Random 객체 생성
        int[] com = new int[5]; // 값이 담길 배열 생성
        // 1. 랜덤값을 각각의 배열에 값을 채울 때 중복 X
        //

        for(int i=0;i<com.length;i++){
            com[i] =  r.nextInt(9)+1;
                for(int j=0; j<i; j++){
                    if(com[i]==com[j]){
                        i--;
                        break;
                    }
                }
            }
            //2. 출력
            for(int i = 0;i<com.length;i++){
                System.out.println("a["+i+"] : "+com[i]);
            }

            //3 . 정렬(선택정렬_
        for(int i =0; i<com.length-1;i++){
                for(int j=i+1;j<com.length;j++){
                    if(com[i]>com[j]){
                        int temp = com[j];
                        com[j] = com[i];
                        com[i] = temp;
                    }
                }
        }













    }
}
