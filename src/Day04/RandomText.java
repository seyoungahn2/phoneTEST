package Day04;

import java.util.Random;

public class RandomText {
    public static void main(String[] args) {
        Random r=new Random();

        int num = r.nextInt(16)+30; // 30~45

        System.out.println("랜덤 값 : "+num);

        // 1~6까지 주사위

        int sum = r.nextInt(6)+1; // 1 2 3 4 5 6
        System.out.println("주사위 값 : "+sum);
    }
}
