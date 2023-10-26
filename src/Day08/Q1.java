package Day08;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 1. 랜덤객체 생성
        // 2. 입력을 위한 Scanner 생성
        // 3. 호수 5X5 생성
        // 4. 필요한 변수 생성

        int[][] hosu = new int[5][5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int y;  // 행
        int x; // 열
        int fishCount =0;



        // 5. 물고기 배치 .
        while (fishCount != 3){
                    // 행 랜덤
                    int h = r.nextInt(5);
                    // 열 랜덤
                    int k = r.nextInt(5);
                    if(hosu[h][k] == 0){
                        hosu[h][k] = 1;
                        fishCount++; //
                    }
                    }
               for(int i = 0; i<hosu.length;i++){
                   for(int j = 0; j<hosu[i].length;j++){
                       if(hosu[i][j]==0){
                           System.out.print("○ ");
                       }
                       else {
                           System.out.print("● ");
                       }
                   }
                   System.out.println();
               }



            // 1(위)을 입력 -> y -1 , 아래(2)를 입력 -> y+1
            // 3(왼쪽)을 입력 -> x - 1, 4(오른쪽)을 입력 -> x +1
                //캐스팅 위치 선정
            while(true){
                System.out.println("행 : ");
                y = sc.nextInt();
                System.out.println("열 : ");
                x = sc.nextInt();
                if(y>-1&&y<5&&x>-1&&x<5){
                    break;
                }












            }







        // 7. 물고기를 잡았는지 확인
        // 8. 본게임 위 아래 왼쪽 오른쪽 -> 물고기 0이 될때까지











    }
}
