package Day04;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random r=new Random();

        int num1 = r.nextInt(9)+1; // 1~9까지 출력..........
        int num2 = r.nextInt(9)+1;
        int num3= r.nextInt(9)+1;

       while(num1 == num2 ||num2 == num3 ||num1 == num3) {
           num1 = r.nextInt(9) + 1;
           num2 = r.nextInt(9) + 1;
           num3 = r.nextInt(9) + 1;

       }
        System.out.println(num1+","+num2+","+num3);




    }
}
