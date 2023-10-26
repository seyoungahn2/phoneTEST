package Day13;

import java.util.Scanner;

class Controller{

    Scanner sc = new Scanner(System.in);
    void add(int a, int b){
        System.out.println("결과 값 : "+(a+b));
    }
    void add(double a, double b){
        System.out.println("결과 값 : "+(a+b));
    }
    void minus(int a, int b){
        System.out.println("결과 값 : "+(a-b));
    }
    void minus(double a, double b){
        System.out.println("결과 값 : "+(a-b));
    }
    void mul(int a, int b){
        System.out.println("결과 값 : "+(a*b));
    }
    void mul(double a, double b){
        System.out.println("결과 값 : "+(a*b));
    }
    void div(int a, int b){
        System.out.println("결과 값 : "+(a/b));
    }
    void div(double a, double b){
        System.out.println("결과 값 : "+(a/b));
    }

    int input1(){
        System.out.print("1.정수연산 2.실수연산 3.종료 : ");
        return sc.nextInt();
    }
    int input2(){
        System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기 : ");
        return sc.nextInt();
    }
    void input3(int[] a){
        System.out.print("숫자 1입력 : ");
        a[0] = sc.nextInt();
        System.out.print("숫자 2입력 : ");
        a[1] =sc.nextInt();
    }
    void input3(double[] a){
        System.out.print("숫자 1입력 : ");
        a[0] = sc.nextDouble();
        System.out.print("숫자 2입력 : ");
        a[1] =sc.nextDouble();
    }
}

public class Q3_14 {
    public static void main(String[] args) {
        int[] intlist = new int[2];
        double[] dlist = new double[2];
        Controller c = new Controller();

        while (true){
            int num = c.input1();
            if(num == 1 || num == 2){
                int num1 = c.input2();
                if(num1 == 1){
                    if(num == 1){
                        c.input3(intlist);
                        c.add(intlist[0],intlist[1]);
                    }
                    else{
                        c.input3(dlist);
                        c.add(dlist[0],dlist[1]);
                    }
                }
                else if(num1 == 2){
                    if(num == 1){
                        c.input3(intlist);
                        c.minus(intlist[0],intlist[1]);
                    }
                    else{
                        c.input3(dlist);
                        c.minus(dlist[0],dlist[1]);
                    }
                }
                else if(num1 == 3){
                    if(num == 1){
                        c.input3(intlist);
                        c.mul(intlist[0],intlist[1]);
                    }
                    else{
                        c.input3(dlist);
                        c.mul(dlist[0],dlist[1]);
                    }
                }
                else if(num1 == 4){
                    if(num == 1){
                        c.input3(intlist);
                        c.div(intlist[0],intlist[1]);
                    }
                    else{
                        c.input3(dlist);
                        c.div(dlist[0],dlist[1]);
                    }
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }
            }
            else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
