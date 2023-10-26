package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int[][] hosu = new int [5][5]; //5x5 호수 생성
        int fishcount = 0;


        while (fishcount != 3){ // 물고기 배치 .
              int h = r.nextInt(5); // h의 인덱스 값에 랜덤값 ex) hosu[2][4] .
              int y = r.nextInt(5); // y의 인덱스 값에 랜덤값 .
              if(hosu[h][y]==0){   //호수의 int 값은 모두 0이기떄문에 0을 1로 바꿔주는 작업 ->
                  hosu[h][y]=1;   // 위와 동일 .
                 fishcount++; // while 문에서 fishcount가 3이 되지않으면 계속 동작함 . fishcount가 3이 되는순간 while 탈출.
                                // 따라서 물고기가 3마리로 세팅되게끔 로직을 짤 수 있다.

              }
        }
        for(int i = 0; i <hosu.length;i++){
            for(int j = 0; j<hosu[i].length;j++){
                if(hosu[i][j]==0){
                    System.out.println("○");

                }
                else{
                    System.out.println("●");
                }
            }

        }

        while(true){
            System.out.println("행을 입력하세요");
            int y =sc.nextInt();
            System.out.println("열을 입력하세요");
            int x=sc.nextInt();

            if(-1<y && y<5 && -1<x && x<5 ){
                break;
            }
           else{
                System.out.println("잘못된 입력입니다.");
            }
        }





    }
}
