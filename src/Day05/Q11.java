package Day05;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" 숫자를 입력해 주세요 : ");
        int num1 = sc.nextInt();
        System.out.println(" 숫자를 입력해 주세요 : ");
        int num2 = sc.nextInt();

                int num3=(num1<num2) ? num1 : num2; //참이면 num1,아니면 num2
                int gong=0;

            for (int i = 1; i<=num3 ; i++) {

                if(num1%i==0 && num2%i==0){
                    //이떄 i는 최대공약수이다.그럼.............

                        gong=i;
                }

            }
        System.out.println("최대공약수는"+gong+"입니다.");
        System.out.println("최소공배수는"+(num1*num2)/gong+"입니다.");






        }
     }




















