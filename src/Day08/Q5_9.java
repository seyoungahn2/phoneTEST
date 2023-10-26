package Day08;

import java.util.Scanner;

public class Q5_9 {

    static int inputNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static void gugudan() {
        System.out.println("1.원하는 구구단 출력");
        System.out.println("2.전체 구구단 출력");
        int num = inputNum();
        if(num == 1) {
            //원하는 구구단
            System.out.print("원하는 구구단 : ");
            int gu = inputNum();
            if(gu>=2 && gu<=9) {
                //출력
                for(int j = 1;j<10;j++) {
                    System.out.println(gu+"X"+j+"="+(gu*j));
                }
            }
            else {
                wrongInputPrint();
            }
        }
        else if(num == 2) {
            //전체 구구단
            for(int i =2;i<10;i++) {
                System.out.println(i+"단");
                for(int j = 1;j<10;j++) {
                    System.out.println(i+"X"+j+"="+(i*j));
                }
            }
        }
        else {
            wrongInputPrint();
        }
    }

    static void star() {
        System.out.println("1.직사각형");
        System.out.println("2.정직삼각형");
        System.out.println("3.역직삼각형");
        System.out.println("4.피라미드");
        System.out.println("5.다이아몬드");
        int num = inputNum();
        if(num == 1) {
            System.out.print("숫자 입력 : ");
            int num1 = inputNum();
            for(int i = 0;i<num1;i++) {
                for(int j = 0;j<num1;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(num == 2) {
            System.out.print("숫자 입력 : ");
            int num1 = inputNum();
            for(int i = 0;i<num1;i++) {
                for(int j =0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        else if(num == 3) {
            System.out.print("숫자 입력 : ");
            int num1 = inputNum();
            for(int i = 0;i<num1;i++) {
                for(int j = num1-1;j>=0;j--) {
                    if(i<j) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        else if(num == 4) {
            System.out.print("숫자 입력 : ");
            int num1 = inputNum();
            for(int i = 0;i<num1;i++) {
                for(int j = num1-1;j>=0;j--) {
                    if(i<j) {
                        System.out.print(" ");
                    }
                    else {
                        for(int k = 0;k<=i*2;k++) {
                            System.out.print("*");
                        }
                        break;
                    }
                }
                System.out.println();
            }
        }
        else if(num == 5) {
            System.out.print("숫자 입력 : ");
            int num1 = inputNum();
            for(int i = 0;i<num1/2+1;i++) {
                for(int j = 0;j<num1/2-i;j++) {
                    System.out.print(" ");
                }
                for(int k = 0;k<=i*2;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i =0;i<num1/2;i++) {
                for(int j =0;j<=i;j++) {
                    System.out.print(" ");
                }
                for(int k = num1-2; k > i*2 ;k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            wrongInputPrint();
        }
    }

    static void wrongInputPrint() {
        System.out.println("잘못된 입력입니다.");
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        while(true){
            System.out.println("1.구구단 출력");
            System.out.println("2.별찍기 출력");
            System.out.println("3.종료");
            int num = inputNum();
            if(num == 1) {//구구단
                gugudan();
            }
            else if(num == 2) {//별찍기
                star();
            }
            else if(num == 3) {//종료
                System.out.println("종료합니다.");
                break;
            }
            else {
                wrongInputPrint();
            }
        }
    }

}
