package Day08;

import java.util.Scanner;

public class Q4_8 {
    static int input(Scanner sc){
        return sc.nextInt();
    }
    static void output1(){
        System.out.println("1.구구단 출력");
        System.out.println("2.별찍기 출력");
        System.out.println("3.종료");
    }
    static void output2(){
        System.out.println("1.원하는 구구단 출력");
        System.out.println("2.전체 구구단 출력");
    }
    static void output3(){
        System.out.print("원하는 구구단 입력을 하세요 : ");
    }

    static void output4(){
        System.out.println("1.네모");
        System.out.println("2.직삼각형 정방향");
        System.out.println("3.직삼각형 역방항");
        System.out.println("4.피라미드");
        System.out.println("5.다이아몬드");
    }

    static void wrongPrint(){
        System.out.println("잘못된 입력입니다.");
    }

    static void exitPrint(){
        System.out.println("프로그램을 종료합니다.");
    }

    static void start() {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        //2. 실행
        while (true) {
            output1();
            int num = input(sc);
            if (num == 1) {//2-1 구구단
                guguStart(sc);
            } else if (num == 2) {
                starStart(sc);
            } else if (num == 3) {
                exitPrint();
                break;
            } else {
                wrongPrint();
            }
        }
    }
    static void guguStart(Scanner sc) {
        output2();
        int num = input(sc);
        if(num == 1) {
            output3();
            int dan = input(sc);
            wantGuguPrint(dan);
        }
        else if(num == 2) {
            allGuguPrint();
        }
        else {
            wrongPrint();
        }
    }

    static void wantGuguPrint(int dan) {
        if(dan < 2 || dan >9 ){
            wrongPrint();
        }
        else{
            for (int times = 1; times<=9;times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        }
    }
    static void allGuguPrint() {
        for(int dan = 2; dan <= 9;dan++){
            for (int times = 1; times<=9;times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
    static void starStart(Scanner sc) {
        output4();
        int num = input(sc);
        if(num == 1) {
            star1Print();
        }
        else if(num == 2) {
            star2Print();
        }
        else if(num == 3) {
            start3Print();
        }
        else if(num == 4) {
            start4Print();
        }
        else if(num == 5) {
            star5Print();
        }
        else {
            wrongPrint();
        }
    }
    static void star1Print() {
        for(int i = 0;i<5;i++){ // 5반복 -> 행
            for(int j = 0;j<5;j++){ //5반복 -> 열
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void star2Print() {
        for(int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void start3Print() {
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
    static void start4Print() {
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
    static void star5Print() {
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

    public static void main(String[] args) {
        start();
    }
}
