package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /* 랜덤 숫자를 1~100까지 받습니다.
            숫자를 입력 : 1~100까지 입력을 해야합니다.

            ex)
            Com : 25
            숫자입력(사용자) : 25

            맞췄습니다.. 축하합니다

            숫자 입력 : 50 -> 다운
            숫자입력 : 10 -> 업
         */
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        int num1 = r.nextInt(100)+1;
        System.out.println(num1);
       while(true){

           System.out.println("숫자를 입력해주세요 : ");
           int user =sc.nextInt();

            if(user==num1){
                System.out.println("정답입니다 !");
                break;
            }
            
            else if(user > num1){

            }



            else{}














       }








    }
}
