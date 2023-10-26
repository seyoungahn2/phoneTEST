package Day03;

import java.util.Scanner;

public class Q2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        String odd ="";
        String even = "";

        for(int i = 1;i<num;i++){
            if(i % 2 == 0){ // 짝수
                even = even + i + " ";// even += i
            }
            else{ // 홀수
                odd = odd + i + " ";
            }
        }

        System.out.println("짝수 : "+even);
        System.out.println("홀수 : "+odd);

        System.out.print("짝수 : ");
        for(int i = 1;i<num;i++){
            if(i %2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("홀수 : ");
        for(int i = 1;i<num;i++){
            if(i%2 == 1){
                System.out.print(i+" ");
            }
        }
    }
}
