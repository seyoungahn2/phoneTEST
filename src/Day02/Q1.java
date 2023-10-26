package Day02;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /* 문제1
        숫자를 2개 입력 받습니다.
        2개 입력 받은 숫자를 더하기, 뺴기 , 곱하기, 나누기, 나머지 연산자(%)로 연산한 결과 값을 출력해주세요.
        예)
        숫자 1 : 10 (엔터)
        숫자 2 : 5 (엔터 )
        더하기 결과 값 : 15
        빼기 결과 값 : 5
        곱하기 결과 값 : 50
        나누기 결과 값 : 2
        나머지 연산자 결과 값 : 0
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        double num1=sc.nextDouble();
        System.out.print("숫자를 입력하세요: ");
        double num2=sc.nextDouble();

        System.out.println("더하기 결과 값 : "+(num1+num2)+" 입니다");
        System.out.println("빼기 결과 값 : "+(num1-num2)+" 입니다");
        System.out.println("곱하기 결과 값 : "+(num1*num2)+" 입니다");
        System.out.println("나누기 결과 값 : "+(num1/num2)+" 입니다");
        System.out.println("나머지 연산자 결과 값 : "+(num1%num2)+" 입니다");



    }
}
