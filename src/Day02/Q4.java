package Day02;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("숫자(1)를 입력하세요 : ");
        int num1=sc.nextInt();

        System.out.print("숫자(2)를 입력하세요 : ");
        int num2=sc.nextInt();

        System.out.print("연산자 입력 : ");
        String plus=sc.next();



         if(plus.equals("+")){
            System.out.println("결과값은 "+(num1+num2)+"입니다.");
        }
        else if(plus.equals("-")){
            System.out.println("결과값은 "+(num1-num2)+"입니다.");
        }
        else if(plus.equals("*")){
            System.out.printf("결과값 : %.1f",(double)num1*num2);
        }
     else if(plus.equals("/")){
            System.out.printf("결과값 : %.1f",(double)num1/num2);
        }
     else{
             System.out.println("잘못된 입력 입니다.");
         }
































    }


}
