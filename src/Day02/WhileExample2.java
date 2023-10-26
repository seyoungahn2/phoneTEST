package Day02;

import java.util.Scanner;

public class WhileExample2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("원하는 숫자를 입력 : ");
        int inputNum = sc.nextInt();
        int num = 1;
        int sum = 0;


        while(num<=inputNum){

            sum += num;
            num++;
        }
        System.out.println("1부터"+(num-1)+"까지의 합은"+sum+" 입니다.");









    }
}
