package Day11;

import java.util.Random;

class Dice1{
    String color;

    int number;

    Random r = new Random();


    int ram(){
        Random r = new Random();
        number += r.nextInt(6);
        return number;
    }


}





