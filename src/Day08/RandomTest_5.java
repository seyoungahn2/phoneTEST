package Day08;

import java.util.Random;

public class RandomTest_5 {
    public static void main(String[] args) {
        int[] result = new int[3];
        Random r = new Random();

        for(int i = 0;i<11;i++) {
            int num = r.nextInt(3);
            result[num]++;
        }
        for(int i =0;i<result.length;i++){
            System.out.println(i+" : "+ result[i]);
        }
    }
}
