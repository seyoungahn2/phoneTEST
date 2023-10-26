package Day07;

import java.util.Scanner;

public class MethodTest3 {

        static int num1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 입력 :");
            int num1 = sc.nextInt();


            return num1;
        }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 :");
        int num1 = sc.nextInt();
        System.out.println("숫자 입력 ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("앞에 값이 더 큽니다.");
        }
        else if(num1==num2){
            System.out.println("값이 같습니다.");
        }
        else {
            System.out.println("뒤에 값이 더 큽니다.");
        }




    }


}
