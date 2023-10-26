package Day07;

import java.util.Scanner;

public class Q1_3 {

    static int snum1;
    static int snum2;

    static int add(int a, int b){
        return a + b;
    }

    static void minus(int a, int b){
        System.out.println("결과 값 : "+(a-b));
    }

    static int mul(){
        return snum1 * snum2;
    }

    static void div(){
        System.out.println("결과 값 : "+(snum1/snum2));
    }

    static String opInput(Scanner sc){
        System.out.print("연산자 입력 : ");
        return sc.next();
    }

    static int inputNum(Scanner sc, int num){
        System.out.print("숫자"+ num +"입력 : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op =opInput(sc);
        int num1 = inputNum(sc,1);
        int num2 = inputNum(sc,2);

        if(op.equals("+")){
            System.out.println("결과 값 : "+add(num1,num2));
        }
        else if(op.equals("-")){
            minus(num1,num2);
        }
        else if(op.equals("*")){
            snum1 = num1;
            snum2 = num2;
            System.out.println("결과 값 : "+mul());
        }
        else if(op.equals("/")){
            snum1 = num1;
            snum2 = num2;
            div();
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }
}
