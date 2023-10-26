package Day04;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true){

            System.out.println("1.직사각형");
            System.out.println("2.정직삼각형");
            System.out.println("3.역삼각형");
            System.out.println("4.피라미드");
            System.out.println("5.다이아몬드");
            System.out.println("6.종료");
            int num= sc.nextInt();

            if (num==1){
                System.out.println("원하는 숫자를 입력하세요 (세로): ");
                int want=sc.nextInt();
                System.out.println("원하는 숫자를 입력하세요 (가로):");
                int want2=sc.nextInt();
                for(int i=0;i<want;i++){
                    for(int j=0;j<want2;j++){
                        System.out.print("*");
                    }
                    System.out.println();  }

            }

            else if(num==2){
                System.out.println("원하는 숫자를 입력하세요 : ");
                int want=sc.nextInt();

                for(int i=0;i<want;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println(); }
            }

            else if(num==3) {
                System.out.println("원하는 숫자를 입력하세요 : ");
                int want = sc.nextInt();

                for (int i = 0; i < want; i++) {
                    for (int j = want-1; j >= 0; j--) {
                            if(j>i){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("*");
                            }
                    }

                    System.out.println();  }
            }
            else if(num==4){
                System.out.println("원하는 숫자를 입력하세요 : ");
                int want=sc.nextInt();

                for(int i=0; i < want; i++){
                    for(int j= want-1; j>=0; j--){
                        if(j>i){
                            System.out.print(" ");
                        }
                      else{
                          for(int k=0;k<i*2+1;k++){
                              System.out.print("*");
                          }
                       break; }
                    }
                    System.out.println();  }

            }

            else if(num==5){
                System.out.println("원하는 숫자를 입력하세요 : ");
                int want=sc.nextInt();
                for(int i = 0;i<want/2+1;i++){
                    for(int j = want/2;i<j;j--){
                        System.out.print(" ");
                    }
                    for(int k = 0;k<i*2+1;k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = 0;i<want/2;i++){
                    for(int j = 0;j<=i;j++){
                        System.out.print(" ");
                    }
                    for(int k = want-2;k-(i*2)>0;k--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            else if(num==6){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else{
                System.out.println("잘못된 입력입니다.");
            }
        }








    }
}
