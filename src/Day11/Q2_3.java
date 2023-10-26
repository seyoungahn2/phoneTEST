package Day11;

import java.util.Random;

class Dice{
    String color;

    Dice(String color){
        this.color = color;
    }

    int run(){
        Random r = new Random();
        return r.nextInt(6)+1;
    }

}

public class Q2_3 {
    public static void main(String[] args) {

        Dice blue = new Dice("파란 주사위");
        Dice red = new Dice("빨간 주사위");

        int redResult = 0;
        int blueResult = 0;

        while(true){
            redResult += red.run();
            blueResult += blue.run();

            if(redResult > 50 || blueResult > 50){
                break;
            }
        }

        System.out.println("파란 주사위 : "+blueResult);
        System.out.println("빨간 주사위 : "+redResult);

        if(blueResult > redResult){
            System.out.println("빨간 주사위 승");
        }
        else{
            System.out.println("파란 주사위 승");
        }
    }
}
