package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random r=new Random(); // 랜덤을 사용하기 위해 랜덤 객체 생성
        int num1 = r.nextInt(9)+1; // 정수 변수 num1을 선언 후 Random을 이용하여 1~9 난수를 대입
        int num2 = r.nextInt(9)+1; // 정수 변수 num2을 선언 후 Random을 이용하여 1~9 난수를 대입
        int num3 = r.nextInt(9)+1; // 정수 변수 num3을 선언 후 Random을 이용하여 1~9 난수를 대입


            // num1과 num2가 같거나, num2가 num3이 같거나 num1과 num3이 같으면 반복.
            while(num1 == num2 ||num2 == num3 ||num1 == num3) {
                num1 = r.nextInt(9) + 1;
                num2 = r.nextInt(9) + 1;
                num3 = r.nextInt(9) + 1;

            }


        System.out.println(num1+","+num2+","+num3);
        //------------------Com 랜덤 값 1~9 중복안되게 정수에 담기
        // 2. 유저의 값 이력
        //2-1 유저가 올바른 입력을 했는지 확인
        //2-2 유저가 올바르게 입력을 한 경우 스트라이크 볼 계산 후 출력
        //3Strike 가 나오면 더이상 입력을 하지 않습니다.
        while (true){
            //2. 유저의 값 입력
            System.out.println("첫번째 자리 : ");
            int user1 = sc.nextInt();
            System.out.println("두번째 자리 : ");
            int user2 = sc.nextInt();
            System.out.println("세번째 자리 : ");
            int user3 = sc.nextInt();

            if(user1>9||user2>9||user3>9||user1<1||user2<1||user3<1){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            if(user1 == user2 ||  user2 == user3 ||user1 == user3){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            //올바른 입력 --------
            // strike ball 계산
            int strike = 0;
            int ball = 0;


            if(user2==num2){
                strike++;
            }
            if(user1==num1){}
        }

    }
}
