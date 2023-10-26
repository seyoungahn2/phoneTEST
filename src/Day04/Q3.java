package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();

        while (true){

            System.out.println("1. 게임시작");
            System.out.println("2. 게임종료");
            int num=sc.nextInt();


        if(num==1){
            System.out.println("1 : 가위 2: 바위 3: 보 중 하나를 선택하세요 : ");
            int user=sc.nextInt();
            int com=r.nextInt(3)+1;
                /* user 1 - com 3 = 2
                   user 1 - com 2 = -1
                   user 1 - com 1 = 0
                *

                */
             if(user>3||user<1){
                System.out.println(" 잘못된 입력입니다.");
             }
            else if(user < com){
                 System.out.println("Com승");
             }
            else if(user > com){
                 System.out.println("User승");
             }
            else{

                 System.out.println("무승부");
             }
        }






        else if(num == 2){
            System.out.println("게임을 종료합니다.");
            break;
        }


        else{
            System.out.println("잘못된 입력입니다.");
        }







        }

















    }
}
