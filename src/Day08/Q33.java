package Day08;

import java.util.Scanner;

public class Q33 {












    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println(" 1. 구구단 출력");
            System.out.println(" 2. 별찍기 출력");
            System.out.println(" 3. 종료");
            int inputnum = sc.nextInt();

            if(inputnum==1){
                System.out.println("1. 원하는 구구단 출력 ");
                System.out.println("2. 전체 구구단 출력  ");
                int num1 = sc.nextInt();

                if(num1==1){
                    System.out.println("원하는 구구단을 입력하세요 :");
                    int dan = sc.nextInt();
                    for(int i=0; i<=0;i++){
                        for(int j=1;j<=9;j++){
                            System.out.println(dan+"x"+j+"="+(dan*j));
                        }
                    }


                }
                else if(num1==2){
                    for(int i=1; i<=9;i++){
                        for(int j=1;j<=9;j++){
                            System.out.println(i+"x"+j+"="+(i*j));
                        }
                    }

                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }

            }

            else if(inputnum==2){
                System.out.println("1. 네모");
                int num2 = sc.nextInt();

                if(num2==1){
                    for(int i=0;i<5;i++){
                        for(int j=0;j<5;j++){
                            System.out.print("*");
                        }
                        System.out.println();   }

                }


                else{
                    System.out.println("잘못된 입력입니다.");
                }







            }


            else if(inputnum==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else{
                System.out.println("잘못된 입력입니다.");

            }












        }











    }
}
