package Day07;

import java.util.Scanner;

public class MethodTest2_1 {

    static int d = 10;

    static int add(int a, int b){
        int c = 10;
        d = 20;

        System.out.println("abc");
        return a+b;
    }

    static void abc(int result){
        System.out.println(result);
    }

    public static void main(String[] args) {
        d= 50;
        int c;
        int a = add(5,3);
        System.out.println(a);
        System.out.println(add(7,3));
        abc(add(10,20));

        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int result=add(num1,num2);
        System.out.println(add(num1,num2));
        System.out.println(result);
        System.out.println(d);
    }
}
