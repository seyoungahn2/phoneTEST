package Day02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("월을 입력하세요 : ");
        int month=sc.nextInt();
        System.out.print("온도를 입력하세요 : ");
        int ondo=sc.nextInt();

        if((month>3)&&(month<=5)&&(ondo<=15)){
            System.out.println("봄 입니다."+"온도는"+ondo+" 입니다.");

        } else if ((month>5)&&(month<=8)&&(ondo<=37)) {
            System.out.println("여름입니다"+"온도는"+ondo+" 입니다.");
        } else if ((month>8)&&(month<=11)&&(ondo<=15)) {
            System.out.println("가을입니다."+"온도는"+ondo+" 입니다.");
        }
        else if ((month<=12)&&(ondo<=15)) {
            System.out.println("겨울입니다."+"온도는"+ondo+" 입니다.");
        }
        else {
            System.out.println("계절과 온도가 맞지 않습니다.");
        }








    }
}
