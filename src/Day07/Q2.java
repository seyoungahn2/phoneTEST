package Day07;

import java.util.Scanner;

public class Q2 {
    static int sum1;
    static int sum2;




    //1. 사각형 넓이 -> 주고 받고
    static int cross(int a,int b){

        return a*b;
    }

    //3. 삼각형 넓이 -> 안주고 받고
    static void angle(int a, int b){
        System.out.println("삼각형의 넓이는"+(a*b)/2+"입니다.");
    }



    //2. 입력 함수
    static void inputWH(){


    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        while(true){

            System.out.println("1. 사각형 넓이 2. 삼각형 넓이 3. 종료 ");
            int input = sc.nextInt();


            if(input==1){
                System.out.println("1. 가로 :   2.세로  :  ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                System.out.println("사각형 넓이 : "+cross(num1,num2)+"입니다.");
            }
            else if(input==2){
                System.out.println("1. 가로 :  2. 세로 :  ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
               angle(num1,num2);


            }
            else if(input==3){
                System.out.println("종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }





        }








    }
}
