package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q2_3 {
    public static void main(String[] args) {
        Random r = new Random(); // 랜덤을 사용하기 위해 랜덤 객체 생성
        Scanner sc = new Scanner(System.in);
        int[] com = new int[3];

        com[0] = r.nextInt(9)+1; // 정수 변수 num1을 선언후 Random을 이용하여 1~9 난수를 대입
        com[1] = r.nextInt(9)+1; // 정수 변수 num2을 선언후 Random을 이용하여 1~9 난수를 대입
        com[2] = r.nextInt(9)+1;
        //num1과 num2가 같거나 num2와 num3이 같거나 num1과 num3이 같으면 반복
        while(com[0] == com[1] || com[1] ==  com[2] || com[0] ==  com[2]){
            com[0] = r.nextInt(9)+1;
            com[1] = r.nextInt(9)+1;
            com[2] = r.nextInt(9)+1;
        }

        System.out.println(com[0]+","+com[1]+","+com[2]);
        //------ Com 랜덤 값 1~9 중복 안되게 변수에 담기 ------

        //2. 유저의 값입력
        //2-1. 유저가 올바른 입력을 했는지 확인
        //2-2. 유저가 올바르게 입력을 한 경우 스트라이크 볼 계산 후 출력
        //3strike가 나오면 더이상 입력을 하지 않습니다. -> 반복
        while(true){
            int[] user = new int[3];
            //2. 유저의 값입력
            System.out.print("첫번째 자리 : ");
            user[0] = sc.nextInt();
            System.out.print("두번째 자리 : ");
            user[1] = sc.nextInt();
            System.out.print("세번째 자리 : ");
             user[2] = sc.nextInt();

            //1~9까지 값을 입력을 하지 않은경우
            if(user[0] < 1 || user[0] >9 || user[1] < 1 || user[1] >9 || user[2] < 1 || user[2] > 9){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            //자리별 중복이 있는 경우
            if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 올바른 입력 ------
            // strike ball 계산
            int strike = 0;
            int ball = 0;

            if(user[0] == com[0]){
                strike++;
            }
            if(user[1] == com[1]){
                strike++;
            }
            if(user[2] == com[2]){
                strike++;
            }

            if(user[0] == com[1] || user[0] == com[2]){
                ball++;
            }
            if(user[1] == com[2] || user[1] == com[2]){
                ball++;
            }
            if(user[2] == com[0] || user[2] == com[2]){
                ball++;
            }

            if(strike == 0 && ball == 0){
                System.out.println("Out입니다.");
            }
            else if(strike ==3){
                System.out.println("홈런입니다.");
                break;
            }
            else{
                System.out.println("strike : "+strike +", ball : "+ball);
            }
        }
    }
}
