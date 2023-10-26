package Day12;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int com = r.nextInt(31)+1;
        System.out.println(com);

        while (true){
            System.out.println("1~31의 숫자중 하나를 입력하세요 : ");
            int user = sc.nextInt();

            if(1>user || user>31){
                System.out.println(" 잘못된 입력입니다. ");
            }
            else if(user==com){
                System.out.println("정답");
                break;
            }


            else if(user>com){
                System.out.println("다운");
            }

            else{
                System.out.println("업");
            }






        }












    }
}
