package Day07;

import java.util.Scanner;

public class Q4 {

    // 평균 학점 연산 ( 주고 받고 )
    static int sum(int a,int b,int c){
        return (a+b+c)/3;
    }

    // 잘못된 입력값 확인 ( 안주고 받고 )

    // 입력 (주고 안받고)
    // 매개변수 X
    // 리턴타입 int[]인트배열 3개를 대입
    //과목 배열 -> 스트링 배열의 서브젝트 배열 생성 후











    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];
        String[] subject = {"국어","수학","영어"};
        boolean[] check = new boolean[3];


        for(int i = 0; i<score.length;i++){
            System.out.println(subject[i]+"  :  ");
            score[i]=sc.nextInt();
        }
        for(int i = 0; i<score.length;i++){
            if(score[i]<0 || score[i]>100){

            }
        }


        System.out.println("국어 점수를 입력해 주세요 : ");
        int kor = sc.nextInt();
        System.out.println(" 영어 점수를 입력해 주세요 : ");
        int eng = sc.nextInt();
        System.out.println("수학 점수를 입력해 주세요 : ");
        int mat = sc.nextInt();

        double avg= (kor+eng+mat)/3.0;

        if(kor>100){
            System.out.println("국어 점수를 잘못 입력하였습니다.");
        }

        else if(eng>100){
            System.out.println("영어 점수를 잘못 입력하였습니다.");
        }

        else if(mat>100){
            System.out.println("수학 점수를 잘못 입력하였습니다.");
        }


        if(avg>=95){
            System.out.println("평균점수"+avg+" 학점은 A+입니다.");
        }
        else if(avg>=90&&avg<95){
            System.out.println("평균 학점은 A입니다.");
        }
        else if(avg>=85&&avg<90){
            System.out.println("평균학점은 B+점이상입니다.");
        }
        else if(avg>=80&&avg<85){
            System.out.println("평균학점은 B점이상입니다.");
        }
        else if(avg>=75&&avg<80){
            System.out.println("평균학점은 C+점이상입니다.");
        }
        else if(avg>=70&&avg<75){
            System.out.println("평균학점은 C점이상입니다.");
        }
        else if(avg>=65&&avg<70){
            System.out.println("평균학점은 D 점이상입니다.");
        }
        else{
            System.out.println("평균학점은 F점이상입니다.");
        }










    }


}
