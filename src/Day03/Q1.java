package Day03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력해주세요 : ");
        int korea = sc.nextInt();

        System.out.print("영어 점수를 입력해주세요 : ");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력해주세요 : ");
        int math = sc.nextInt();

        double result;
        result = (korea + eng + math) / 3.0;

        if (korea < 0 || korea > 100 || math < 0 || math > 100 || eng < 0 || eng > 100) {//잘못된것
            String wrongSubject = "";
            if (korea < 0 || korea > 100) {
                wrongSubject+=" 국어 ";

            }
            if(eng<0||eng>100){
                wrongSubject+=" 영어 ";
            }
            if(math<0||math>100){
                wrongSubject+=" 수학 ";
            }
            System.out.println(wrongSubject+"이 잘 못 입력 됐습니다.");
        }
        else {//잘된것 ->>>>>


            if (result >= 95) {
                System.out.printf("평균 %.1f 점이고 학점은 A+입니다.", result);
            } else if (result >= 90) {
                System.out.printf("평균 %.1f 점이고 학점은 A입니다.", result);
            } else if (result >= 85) {
                System.out.printf("평균 %.1f 점이고 학점은 B+입니다.", result);
            } else if (result >= 80) {
                System.out.printf("평균 %.1f 점이고 학점은 B입니다.", result);
            } else if (result >= 75) {
                System.out.printf("평균 %.1f 점이고 학점은 C+입니다.", result);
            } else if (result >= 70) {
                System.out.printf("평균 %.1f 점이고 학점은 C입니다.", result);
            } else if (result >= 60) {
                System.out.printf("평균 %.1f 점이고 학점은 D입니다.", result);
            } else {
                System.out.printf("평균 %.1f 점이고 학점은 F입니다.", result);
            }


        }




        {

        }















        }

    }

