package Day08;

import java.util.Scanner;

public class Q222222222 {

    static int input(Scanner sc){
       int num = sc.nextInt();
            return num;
    }

    static void print1(){
        System.out.println("1.구구단 출력");
        System.out.println("2.별찍기 출력");
        System.out.println("3.종료");
    }
    static void print2(){
        System.out.println("1.원하는 구구단 출력");
        System.out.println("2.전체 구구단 출력");
    }

    static void print3(){
        System.out.print("원하는 구구단 입력을 하세요 : ");
    }
    static void wrongprint(){
        System.out.println("잘못된 입력입니다.");
    }
    static void print4(){
        System.out.println("1.네모");
        System.out.println("2.직삼각형 정방향");
        System.out.println("3.직삼각형 역방항");
        System.out.println("4.피라미드");
        System.out.println("5.다이아몬드");
    }
    static void wantgugu(int dan){
        if(dan < 2 || dan >9 ){
            wrongprint();
        }
        else{
            for (int times = 1; times<=9;times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        }
    }
    static void allgugu(){
        for(int dan = 2; dan <= 9;dan++){
            for (int times = 1; times<=9;times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
    static void gugustart(Scanner sc){

        print2();
        int num1 = input(sc);
        if(num1 == 1){
            print3();
            int dan = input(sc);
            wantgugu(dan);
        }
        else if(num1 == 2){
            allgugu();
        }
        else{
         wrongprint();
        }
    }
    static void star1(){
        for(int i = 0;i<5;i++){ // 5반복 -> 행
            for(int j = 0;j<5;j++){ //5반복 -> 열
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    static void star2(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star3(){
        for(int i = 0;i<5;i++){
            for(int j = 4;j>=0;j--){
                if(i<j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void star4(){
        for(int i = 0;i<5;i++){
            for(int j = 4;i<j;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star5(){
        for(int i = 0;i<3;i++){
            for(int j = 2;i<j;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 3;k-(i*2)>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void allstar(Scanner sc){
        print4();
        int num1 = input(sc);
        if(num1 == 1){
            star1();

        }
        else if(num1 == 2){
            star2();
        }
        else if(num1 == 3){
            star3();
        }
        else if(num1 == 4){
            star4();
        }
        else if(num1 == 5){
            star5();
        }
        else{
           wrongprint();
        }
    }

    static void start(){
        Scanner sc = new Scanner(System.in);

        while(true){
            print1();
            int num = input(sc);

            if(num == 1){//2-1 구구단
            gugustart(sc);



            }
            else if(num == 2){//2-2 별찍기
            allstar(sc);



            }
            else if(num == 3){//2-3 종료 -> 무한반복
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{//2-나머지 잘못된 입력
               wrongprint();
            }
        }
    }
    public static void main(String[] args) {

            start();


    }
}
