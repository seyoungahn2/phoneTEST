package Day03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
          /* 숫자 입력 : 10
         짝수 : 2 4 6 8
         홀수 : 1 3 5 7 9
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 :");
        int num=sc.nextInt();
        String even="";
        String holsu="";
        for(int i=1;i<num ; i++ ){

            if(i%2==0){
                even+=i;
            }
            else{
                holsu+=i;
            }
        }
        System.out.println("짝수 :"+even);
        System.out.println("홀수 :"+holsu);


    }
}
