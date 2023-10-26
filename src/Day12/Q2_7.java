package Day12;


import java.util.Random;
import java.util.Scanner;

class Human{
    boolean check;

    Human(boolean check){
        this.check = check;
    }
    void talk(){
        if(check){
            System.out.println("네 제가 마피아 입니다.");
        }
        else{
            System.out.println("억울합니다. 제가 마피아가 아닙니다.");
        }
    }
}

class Police{
    Scanner sc = new Scanner(System.in);
    int input(){
        System.out.print("마피아는?");
        return sc.nextInt();
    }
}

public class Q2_7 {
    public static void main(String[] args) {
        Random r = new Random();
        Human[] hlist = new Human[5];
        Police p = new Police();

        int num = r.nextInt(5);// 0~4

        for(int i =0;i<hlist.length;i++){
            if(num == i){
                hlist[i] = new Human(true);
            }
            else{
                hlist[i] = new Human(false);
            }
        }
        //int pNum = -1;
        while(/*pNum != num*/true){
            int pNum = p.input();
            if(pNum > 0 && pNum<6){ // 1~5
                hlist[pNum-1].talk();
                if(hlist[pNum-1].check){
                    break;
                }
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
