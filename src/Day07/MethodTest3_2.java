package Day07;

import java.util.Scanner;

public class MethodTest3_2 {

    static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력");
        int num1 =sc.nextInt();
        return num1;
    }

    static void compare(int a, int b){
        if(a > b){
            System.out.println("앞에 값이 더 큽니다.");
        }
        else if(a==b){
            System.out.println("값이 같습니다.");
        }
        else{
            System.out.println("뒤에 값이 더 큽니다.");
        }
    }

    public static void main(String[] args) {
        int num1 = input();
        int num2 = input();
        compare(num1,num2);
    }

}
