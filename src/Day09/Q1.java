package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    static void inPut(Scanner sc){



    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] com = new int[3];

        com[0] =r.nextInt(9)+1;
        com[1] = r.nextInt(9)+1;
        com[2] = r.nextInt(9)+1;



        while(com[0]==com[1] || com[1]==com[2] || com[2]==com[0]){

            com[0] =r.nextInt(9)+1;
            com[1] = r.nextInt(9)+1;
            com[2] = r.nextInt(9)+1;

        }
        System.out.println(com[0]+""+com[1]+""+com[2]);
        while (true){
            int[] user = new int[3];
            System.out.println("첫째자리수 : ");
            user[0]=sc.nextInt();
            System.out.println("둘째자리수 : ");
            user[1]=sc.nextInt();
            System.out.println("셋째자리수 :");
            user[2]=sc.nextInt();


            int strike = 0;
            int ball = 0;
           if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0]){
               System.out.println("잘못된 입력입니다.");
               continue;
           }
           if(user[0] == com[0]){

               strike++;
           }
           if(user[1] == com[1]){

               strike++;
           }
           if(user[2] == com[2]){

               strike++;
           }




           if(user[0]==com[1] || user[0] == com[2]){
                ball++;
           }

            if(user[1]==com[0] || user[1]==com[2]){
                ball++;
            }

            if(user[2]==com[0] || user[2]==com[1]){
                ball++;
            }


            if(strike==0 && ball==0){
                System.out.println(" OUT 입니다.");
            }
            else if(strike==3 ){
                System.out.println("홈런입니다.");
                break;
            }
            else{
                System.out.println(ball+strike+"입니다.");
            }



        }

















    }
}
