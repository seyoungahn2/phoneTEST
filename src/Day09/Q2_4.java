package Day09;

import java.util.Scanner;

public class Q2_4 {

    static int[] input(int count, Scanner sc) {
        int[] input = new int[2];
        System.out.println("총 좌석 : " + count);
        System.out.print("행 입력 : ");
        input[0] = sc.nextInt();
        System.out.print("열 입력 : ");
        input[1] = sc.nextInt();
        return input;
    }

    static boolean wrongCheck(int[] input) {
        if (input[0] < 1 || input[0] > 9 || input[1] < 1 || input[1] > 2) { //올바르지 않은 입력
            System.out.println("잘못된 입력입니다.");
            return false;
        }
        return true;
    }

    static int reCheck(int[][] seat, int[] input, int count) {
        if (seat[input[0] - 1][input[1] - 1] == 0) {
            reservationRun(seat, input[0], input[1], count);
            return --count;
        } else {
            emptySeatPrint(seat);
            return count;
        }
    }

    static void reservationRun(int[][] seat, int h, int y, int count) {
        seat[h - 1][y - 1] = 1;
        System.out.println("예약이 완료 됐습니다.");
    }

    static void emptySeatPrint(int[][] seat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 2; j++) {
                if (seat[i][j] == 0) {
                    System.out.println("[" + (i + 1) + "] 행 [" + (j + 1) + "] 열");
                }
            }
        }
    }

    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        //좌석정보 배열
        int[][] seat = new int[9][2];
        //총 좌석수
        int count = 18;

        while (count > 0) {
            int[] input = input(count, sc);
            //boolean check = wrongCheck(input);
            if (wrongCheck(input)) {
                count=reCheck(seat, input, count);
            }
        }

    }
}

