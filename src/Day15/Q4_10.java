package Day15;

import java.util.Random;
import java.util.Scanner;

class Water{
    private int num;
    Water(){
        Random r = new Random();
        num = r.nextInt(8)+1;
    }
    public int getNum() {
        return num;
    }

}

class Human{
    private Water[] waters;
    public void setWaters(Water[] waters) {
        this.waters = waters;
    }

    int totalWater(){
        int total = 0;
        for(int i =0;i<waters.length;i++){
            total += waters[i].getNum();
        }
        return total;
    }
}

public class Q4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human[] humans = new Human[3];
        Water[][] waters = new Water[3][10];

       // Water[][][] a = new Water[3][2][4];

//        a[0] => Warter[2][4]
//        a[1] => Warter[2][4]
//        a[2] => Warter[2][4]
//        a[0][1] => Water[4];

        for(int i = 0;i<waters.length;i++){
            for(int j = 0;j<waters[i].length;j++){
                waters[i][j] = new Water();
            }
        }
        // human 배열 개수만큼 반복 .
        for(int i = 0;i<humans.length;i++){
            humans[i] = new Human();
            humans[i].setWaters(waters[i]); // Water[10]
            waters[i] = null;
            System.out.println((i+1)+"번째 사람 : "+humans[i].totalWater());
        }
        boolean check = true;
        while(check) {
            System.out.print("물을 제일 많이 먹은 사람은 ? ");
            int num = sc.nextInt();

            if (num == 1 || num == 2 || num == 3){
                int i;
                for(i =0;i< humans.length;i++){
                    if((num-1) != i && humans[i].totalWater() > humans[num-1].totalWater()){
                        System.out.println("제일 물이 많은 사람이 아닙니다.");
                        break;
                    }
                }
                if(i == humans.length){
                    System.out.println("제일 물이 많은사람 입니다.");
                    check = false;
                }
                else{
                    check = true;
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }


    }
}
