package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q3_6 {

    static int randomHosu(int[][] hosu,Random r,int fishCount){
        while(fishCount != 3){ // 피쉬카운트 3이 아니면 계속 동작
            // 행 랜덤
            int h = r.nextInt(5);
            // 열 랜덤
            int k = r.nextInt(5);
            if(hosu[h][k] == 0){ // 행과 열에 부여된 랜덤숫자 (호수 5x5배열)에 1을 부여해준다.
                hosu[h][k] = 1; // 0을 1로 바꿔주는 작업.
                fishCount++; // fish 카운트를 올려준다. 3까지 올려 물고기를 총 3마리를 만들어준다.
            }
        }
        return fishCount; // fish카운트를 randomHosu에 리턴.
    }

    static void hosuPrint(int[][] hosu, int y, int x){
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

    static void casting(int[] fishHuman,Scanner sc){
        while(fishHuman[0]<0 ||fishHuman[0]>4||fishHuman[1]<0||fishHuman[1]>4){
            System.out.print("행 : ");
            fishHuman[0] = sc.nextInt();
            System.out.print("열 : ");
            fishHuman[1] = sc.nextInt();
        }
    }

    static int fishCheck(int[][] hosu,int y, int x){
        if(hosu[y][x] == 1){
            System.out.println("물고기를 잡았습니다.");
            hosu[y][x] = 0;
            return 1;
        }
        return 0;
    }

    static int inputNEWS(Scanner sc){
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 :"); //출력
        int num = sc.nextInt(); //정수 입력
        return num;
    }

    static void move(int[] fishHuman,int num){
        if(num == 1){
            fishHuman[0]--;
            if(fishHuman[0] == -1){
                System.out.println("더이상 위로 움직일 수 없습니다.");
                fishHuman[0] = 0;
            }
        }
        else if(num == 2){
            if(fishHuman[0] == 4){
                System.out.println("더이상 아래로 움직일 수 없습니다.");
            }
            else{
                fishHuman[0]++;
            }

        }
        else if(num == 3){
            fishHuman[1]--;
            if(fishHuman[1] == -1){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                fishHuman[1] = 0;
            }
        }
        else if(num == 4){
            //물고기 확인
            fishHuman[1]++;
            if(fishHuman[1] == 5){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                fishHuman[1] = 4;
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    static void start(){
        //1. 랜덤 객체 생성
        Random r = new Random();
        //2. 입력을 위핸 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //3. 호수 5X5 생성
        int[][] hosu = new int[5][5];
        //4. 필요한 변수 생성
        int[] fishHuman = {-1,-1};
        int fishCount = 0;

        //5. 물고기 배치
        fishCount=randomHosu(hosu,r,fishCount);

        hosuPrint(hosu,fishHuman[0],fishHuman[1]);
        // 6. 캐스팅
        casting(fishHuman,sc);

        // 7. 물고기를 잡았는지 확인
        fishCount -= fishCheck(hosu,fishHuman[0],fishHuman[1]);

        // 8. 본게임 위 아래 왼쪽 오른쪽 -> 물고기 0이 될 때까지
        while(fishCount !=0){
            int num = inputNEWS(sc);

            move(fishHuman,num);

            fishCount -= fishCheck(hosu,fishHuman[0],fishHuman[1]);
            //출력
            hosuPrint(hosu,fishHuman[0],fishHuman[1]);
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }

    public static void main(String[] args) {
        start();
    }
}
