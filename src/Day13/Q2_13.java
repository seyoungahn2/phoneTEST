package Day13;

import java.util.Random;
import java.util.Scanner;

class PM{
    String type;
    String color;
    String size;

    PM(){
        Random r = new Random();
        String[] m = {"피카츄","파이리","꼬부기","이상해씨"};
        String[] c = {"노란색","빨간색","파란색","초록색"};
        String[] s= {"대","중","소","미니"};

        type = m[r.nextInt(m.length)];
        color = c[r.nextInt(c.length)];
        size = s[r.nextInt(s.length)];

        talk();
    }

    void talk(){
        System.out.println(color+" "+type+"이(며)고, 크기는 "+size+"입니다.");
    }
}
class PB{
    PM m;
}
class JW{
    PB ball;
}
class Oh{
    PB[] bl = new PB[3]; // 0 1 2

    Oh(){
        for(int i = 0;i<bl.length;i++){
            bl[i] = new PB();
        }
    }
}

public class Q2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oh o = new Oh();
        JW j = new JW();

        for(int i = 0;i<3;i++){
            o.bl[i].m = new PM();
        }

        while(true){
            System.out.println("1,2,3 중에 고르세요 : ");
            int num = sc.nextInt();
            if(num == 1 || num == 2 || num == 3){
                j.ball = o.bl[num-1]; // 0 1 2
                o.bl[num-1]= null;
                j.ball.m.talk();
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
                System.out.println("다시 고르세요~");
            }
        }
    }
}
