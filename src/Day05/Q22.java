package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        /* 변수만을 이용한 숫자 야구게임
        숫자야구게임이란?
        랜덤 3자리 수를 com가 가지고 있습니다.
        5(첫째자리)6(둘쨰자리)7(세째자리)
        1~9까지만 들어갈 수 있습니다. 또한 각 자리별로 같은수가 있으면 안됩니다.
        4 4 2 (X) 112(X)
            사용자 입력 : 5 6 7
            첫쨰자리 :4   첫째자리 : 6   첫째자리 : 5
            둘쨰자리 :3   둘째자리 : 3   둘째자리 : 4
            셋쨰자리 :2   셋째자리 : 5   셋째자리 : 3
            OUT입니다.   2ball입니다.    1Strike입니다.

            첫쨰자리 : 5        out / 1,2 Strike / 1, 2, 3 ball / 홈런
            둘째자리 : 6
            셋째자리 : 7
            홈런입니다.
         */


        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        int num1 = r.nextInt(9)+1;
        int num2 = r.nextInt(9)+1;
        int num3 = r.nextInt(9)+1;

        System.out.println(num1+""+num2+""+num3);
        while (true){
            System.out.print("숫자1를 입력해주세요 :");
            int user1 = sc.nextInt();
            System.out.print(" 숫자2를 입력해주세요 :");
            int user2 = sc.nextInt();
            System.out.print(" 숫자3 입력해주세요 : ");
            int user3 = sc.nextInt();


            while(num1 == num2 ||num2 == num3 ||num1 == num3) {
                num1 = r.nextInt(9) + 1;
                num2 = r.nextInt(9) + 1;
                num3 = r.nextInt(9) + 1;

            }

            if(num1>10||num2>10||num3>10||num1<0||num2<0||num3<0){
                System.out.println("잘못입력하였습니다.");
            }
            else if(num1==user1 && num2==user2 && num3==user3){
                System.out.println("홈런입니다.");
            }






















        }











    }



}
