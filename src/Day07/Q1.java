package Day07;

import java.util.Scanner;

public class Q1 {

    static int snum1;

    static int snum2;
    static int sum(int a,int b){ //주고 받고
        return a+b;
    }

    static void minus(int a,int b){ //안주고 받고
        System.out.println("결과 값 "+(a-b)+"입니다.");
    }
    static int mul(){ // 주고 안받고/
        return snum1 * snum2;
    }
    static void div(){ // 안주고 안받고
        System.out.println("결과값"+(snum1/snum2)+"입니다.");
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String input = sc.next();
        System.out.println("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        if(input.equals("+")){
            System.out.println("결과 값 " +sum(num1,num2)+"입니다.");
        }
        else if (input.equals("-")){
            minus(num1,num2);
        }
        else if(input.equals("*")){
            snum1 = num1;
            snum2 = num2;
            System.out.println("결과 값 " +mul()+"입니다.");
        }
        else if(input.equals("/")){
            snum1 = num1;
            snum2 = num2;
            div();
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }














    }




}
