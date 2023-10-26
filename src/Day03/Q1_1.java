package Day03;

import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();

        //잘못된 입력
        if(kor < 0 || kor > 100 || eng <0 || eng > 100 ||
            math < 0 || math > 100)
        {
            String wrongSubject = "";
            if(kor <0 || kor >100){
                wrongSubject += "국어 ";
            }
            if(eng <0 || eng >100){
                if(wrongSubject.equals("")){
                    wrongSubject += "영어";
                }
                else{
                    wrongSubject += ", 영어";
                }
            }
            if(math <0 || math >100){
                if(wrongSubject.equals("")){
                    wrongSubject += "수학 ";
                }
                else{
                    wrongSubject += ", 수학 ";
                }

            }
            System.out.println(wrongSubject+" 잘 못 입력 됐습니다.");
        }
        else{ // 올바른 입력
            double avg = (kor + eng + math) / 3.0;

            if(avg >= 95){
                System.out.printf("평균 %.1f이고 학점은 A+입니다.",avg);
            }
            else if(avg >= 90){
                System.out.printf("평균 %.1f이고 학점은 A입니다.",avg);
            }
            else if(avg >=85){
                System.out.printf("평균 %.1f이고 학점은 B+입니다.",avg);
            }
            else if(avg >=80){
                System.out.printf("평균 %.1f이고 학점은 B입니다.",avg);
            }
            else if(avg >=75){
                System.out.printf("평균 %.1f이고 학점은 C+입니다.",avg);
            }
            else if(avg >=70){
                System.out.printf("평균 %.1f이고 학점은 C입니다.",avg);
            }
            else if(avg >=60){
                System.out.printf("평균 %.1f이고 학점은 D입니다.",avg);
            }
            else{
                System.out.printf("평균 %.1f이고 학점은 F입니다.",avg);
            }

        }

    }
}
