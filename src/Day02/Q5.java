package Day02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int inputNum=sc.nextInt();
        int num1 ;
        int sum1 ;

        System.out.print(inputNum+"약수는");
        for(int i=1;i < inputNum;++i){
           if(inputNum%i==0){
               System.out.print(i+",");
           }
        }
        System.out.println(inputNum+"입니다.");











    }
}
