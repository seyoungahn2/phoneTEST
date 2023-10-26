package Day07;

import java.util.Scanner;

public class Q4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];
        String[] subject = {"국어","수학","영어"};
        boolean[] check = new boolean[3];

        for(int i = 0;i<score.length;i++){
            System.out.print(subject[i]+" : ");
            score[i] = sc.nextInt();
        }

        for(int i = 0;i<score.length;i++){
            if(score[i] < 0  || score[i] > 100){
                check[i] = true;
            }
        }

        if(check[0] || check[1] || check[2]){ // 잘못된 입력
            for(int i = 0;i<check.length;i++){
                if(check[i]){
                    System.out.print(subject[i]+" ");
                }
            }
            System.out.println("잘못 입력 됐습니다.");
        }
        else { // 올바른 입력
            int result = 0;
            for(int i = 0;i<score.length;i++){
                result += score[i];
            }
            double avg = result / 3.0;

            String hak;
            if(avg > 94){
                hak = "A+";
            }
            else if(avg > 89){
                hak = "A";
            }
            else if(avg > 84){
                hak = "B+";
            }
            else if(avg > 79){
                hak = "B";
            }
            else if(avg >74){
                hak = "C+";
            }
            else if(avg >69){
                hak = "C";
            }
            else if(avg >59){
                hak = "D";
            }
            else{
                hak = "F";
            }
            System.out.println("평균 점수는 : "+avg+"학점은"+hak+"입니다.");
        }
    }
}
