package Day06;

import java.util.Scanner;

public class Q3_3 {
    static int[][] inPut(){ //입력
        Scanner sc = new Scanner(System.in);
        int[][] seat = new int[9][2];
        return seat;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seat = new int[9][2];
        int count = 18;

        while(count >0){
            System.out.println("예약하실 좌석을 입력해주세요(총"+count+"석) :");
            System.out.print("행 : ");
            int h =sc.nextInt();
            System.out.print("열 : ");
            int y = sc.nextInt();

            //1. 잘못된 입력
            if(h<1 || h > 9 || y<1 || y >2){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            //2. 예약이 되지 않은 경우
            if(seat[h-1][y-1] == 0){
                System.out.println("예약이 완료 됐습니다.");
                seat[h-1][y-1] = 1;
                count--;
            }
            //3. 예약이 된 경우
            else{
                for(int i = 0;i<seat.length;i++){
                    for(int j = 0; j<seat[i].length;j++){
                        if(seat[i][j] == 0){
                            System.out.println("행 : "+(i+1)+
                                    "열 : "+(j+1));
                        }
                    }
                }
            }
        }
        System.out.println("모든 자리가 예약 됐습니다.");
    }
}