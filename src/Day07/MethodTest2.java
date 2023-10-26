package Day07;

import java.util.Scanner;

public class MethodTest2 {



    static int d = 10;

    static int add(int a, int b){
        d=20;
        System.out.println("abc");
        return a+b;
    }


    public static void main(String[] args) {
            d = 50;
            int c;
            int a = add(5,3);
        System.out.println(a);
        System.out.println(add(7,3));
        System.out.println(d);
        Scanner sc = new Scanner(System.in);


    }
}
