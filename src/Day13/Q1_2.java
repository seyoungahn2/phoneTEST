package Day13;

import java.util.Random;
import java.util.Scanner;

// 물고기
class Fish{
}
// 호수
class Hosu{
    Fish[][] hosu = new Fish[5][5];

    Hosu(){
        Random r = new Random();
        for(int i = 0;i<3;i++){
            int h = r.nextInt(5);
            int y = r.nextInt(5);
            if(hosu[h][y] != null){
                i--;
            }
            else{
                hosu[h][y] = new Fish();
            }
        }
    }
    //물고기주기
    Fish giveFish(int[] position){
        return hosu[position[0]][position[1]];
    }
    //물고기 준 이후 null
    void nullChange(int[] position){
        hosu[position[0]][position[1]] = null;
    }
    //호수출력
    void printHosu(int[] position){
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(position[0] == i && position[1] == j){
                    System.out.print("X");
                }
                else if(hosu[i][j] == null){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }
}
// 낚시꾼
class Fisher{
    int[] position = {-1,-1};
    Fish[] bowl = new Fish[3];
    Scanner sc = new Scanner(System.in);

    Fisher(){
        while (true){
            System.out.print("행 입력 : ");
            position[0] = sc.nextInt();
            System.out.print("열 입력 : ");
            position[1] = sc.nextInt();

            if(position[0] >-1 && position[0]<5 && position[1] >-1 && position[1]<5){
                break;
            }
        }
    }

    //1. 물고기 받기
    void receiveFish(Fish f){
        if(f != null){
            System.out.println("물고기 잡았습니다.");
        }

        for(int i =0;i<bowl.length;i++){
            if(bowl[i] == null){
                bowl[i] = f;
                break;
            }
        }

    }
    //2. 프로그램 종료를 위한 물고기 체크
    boolean checkFish(){
        for(int i =0;i<bowl.length;i++){
            if(bowl[i] == null){
                return true;
            }
        }
        return false;
    }

    //3. 위아래왼쪽오른쪽
    void fishMove(){
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num =sc.nextInt();

        if(num == 1){
            position[0]--;
            if(position[0]<0){
                System.out.println("더이상 위로 움직일 수 없습니다.");
                position[0] =0;
            }
        }
        else if(num == 2){
            position[0]++;
            if(position[0]>4){
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                position[0] =4;
            }
        }
        else if(num == 3){
            position[1]--;
            if(position[1]<0){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                position[1] =0;
            }
        }
        else if(num == 4){
            position[1]++;
            if(position[1]>4){
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                position[1] =4;
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }

    }
}

public class Q1_2 {
    public static void main(String[] args) {
        Hosu h = new Hosu();
        int[] a = {-1,-1};
        h.printHosu(a);
        Fisher f = new Fisher();
        h.printHosu(f.position);
        f.receiveFish(h.giveFish(f.position));
        h.nullChange(f.position);
        while(f.checkFish()){
            f.fishMove();
            f.receiveFish(h.giveFish(f.position));
            h.nullChange(f.position);
            h.printHosu(f.position);
        }
        System.out.println("물고기를 모두 잡았습니다.");

    }
}
