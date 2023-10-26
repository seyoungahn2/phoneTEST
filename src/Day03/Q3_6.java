package Day03;

import java.util.Scanner;

public class Q3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("1.원하는 구구단 출력");
            System.out.print("2.전체 구구단 출력");
            System.out.print("3.종료");
            int num = sc.nextInt();

            if(num == 1){
                System.out.print("원하는 구구단 : ");
                int dan = sc.nextInt();
                if(dan < 2 || dan >9 ){
                    System.out.println("잘못된 입력입니다.");
                }
                else{
                    for (int times = 1; times<=9;times++){
                        System.out.println(dan + "X" + times + "=" + dan * times);
                    }
                }
            }
            else if(num == 2){
                int dan;
                int times;
                for(dan = 2; dan <= 9;dan++){
                    for (times = 1; times<=9;times++){
                        System.out.println(dan + "X" + times + "=" + dan * times);
                    }
                    System.out.println();
                }
            }
            else if(num == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
