package Day04;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        /* 문자 A(65)에서 랜덤으로 0~25값을 추출 이후에
        더하기 연산을 해서 랜덤한 문자를 만듭니다.
        이 랜덤한 문자를 만드는 작업을 10번 실행을 하여서
        10개 문자를 더하기 연산을 하여서 하나의 문자열로 만듭니다.
        10개의 문자도 출력하세요 ( 중복 상관 X)
         */
        Random r=new Random();
        char A = 'A'; //

        for(int i=0;i<10;i++){

            int num=r.nextInt(26);
            System.out.print((char)(A+num));

        }






    }

}
