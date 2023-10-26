package Day08;

import java.util.Random;
import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        //1. 랜덤 객체 생성
        Random r = new Random();
        //2. 입력을 위핸 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //3. 호수 5X5 생성
        int[][] hosu = new int[5][5];
        //4. 필요한 변수 생성
        int y = -1; // 행
        int x = -1; // 열
        int fishCount = 0;

        //5. 물고기 배치
        while(fishCount != 3){
            // 행 랜덤
            int h = r.nextInt(5);
            // 열 랜덤
            int k = r.nextInt(5);
            if(hosu[h][k] == 0){
                hosu[h][k] = 1;
                fishCount++;
            }
        }
        for(int i =0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(hosu[i][j] == 0){
                    System.out.print("○ ");
                }
                else{
                    System.out.print("● ");
                }
            }
            System.out.println();
        }
        // 6. 캐스팅
        while(y<0 ||y>4||x<0||x>4){
            System.out.print("행 : ");
            y = sc.nextInt();
            System.out.print("열 : ");
            x = sc.nextInt();
        }
        // 7. 물고기를 잡았는지 확인
        if(hosu[y][x] == 1){
            System.out.println("물고기를 잡았습니다.");
            fishCount--;
            hosu[y][x] = 0;
        }

        for(int i =0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(i == y && j == x){
                    System.out.print("X ");
                }
                else if(hosu[i][j] == 0){
                    System.out.print("○ ");
                }
                else{
                    System.out.print("● ");
                }
            }
            System.out.println();
        }

        // 8. 본게임 위 아래 왼쪽 오른쪽 -> 물고기 0이 될 때까지
        while(fishCount !=0){
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 :"); //출력
            int num = sc.nextInt(); //정수 입력
            if(num == 1){
                y--;
                if(y == -1){
                    System.out.println("더이상 위로 움직일 수 없습니다.");
                    y = 0;
                }
            }
            else if(num == 2){
                if(y == 4){
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                }
                else{
                    y++;
                }

            }
            else if(num == 3){
                x--;
                if(x == -1){
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    x = 0;
                }
            }
            else if(num == 4){
                //물고기 확인
                x++;
                if(x == 5){
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    x = 4;
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
            //물고기 확인
            if(hosu[y][x] == 1){
                System.out.println("물고기를 잡았습니다.");
                fishCount--;
                hosu[y][x] = 0;
            }
            //출력
            for(int i =0;i<hosu.length;i++){
                for(int j = 0;j<hosu[i].length;j++){
                    if(i == y && j == x){
                        System.out.print("X ");
                    }
                    else if(hosu[i][j] == 0){
                        System.out.print("○ ");
                    }
                    else{
                        System.out.print("● ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
