package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /* 배열 크기가 10개인 배열을 만드세요 . 그리고 각각의 배열안에 값이
        0~10까지 랜덤수를 추출하여 넣어줍니다.
        배열안의 값 중에 가장 큰 값이 몇번째 index 에 있는지 출력을 해주세여
        (단, 가장 큰 값이 같은 값이 있으면 index를 같이 출력해주세여 ).

        */

        Random r = new Random();
        int[] com = new int[11];
        int max=0;
        for(int i=0;i<com.length;i++){
            com[i] =  r.nextInt(11);
            if(max < com[i]){
                max = com[i];
            }
        }
        for(int i = 0; i< com.length;i++){
            if(com[i] == max){
                System.out.println(i+"번째");
            }
        }






    }
}
/*
   int a = 10;
        int b = 20;

        int temp=b; // temp <- 20 : temp=20
        b = a;  // b <- 10
        a = temp; // a <- 20
 */