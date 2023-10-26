package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q1_3 {

    static void makeRandom(int[] com,Random r){
        //1. 랜덤값 생성
        for(int i = 0;i<com.length;i++){
            com[i] = r.nextInt(9)+1;
            for(int j = 0;j<i;j++){
                if(com[i] == com[j]){
                    i--;
                    break;
                }
            }
        }
    }

    static void randomPrint(int[] com){
        //2. 랜덤값 출력
        for(int i = 0;i<com.length;i++){
            System.out.print(com[i]);
        }
        System.out.println();
    }

    static int[] inputUser(Scanner sc){
        int[] user = new int[3];
        //2. 유저의 값입력
        for(int i = 0;i<user.length;i++){
            System.out.print((i+1)+"번째 : ");
            user[i] = sc.nextInt();
            if(user[i]<1 || user[i]>9 ){
                i--;
                continue;
            }
            for(int j = 0;j<i;j++){
                if(user[i] ==user[j]){
                    i--;
                    break;
                }
            }
        }

        return user;
    }

    static int[] checkSB(int[] user, int[] com){
        //4. strike ball 계산
       int[] result = new int[2];

        for(int i = 0;i<user.length;i++){ //user
            for(int j = 0;j<com.length;j++){ //com
                if(user[i] == com[j]){ // strike ball
                    if(i == j){
                        result[0]++;
                    }
                    else{
                        result[1]++;
                    }
                }
            }
        }
        return result;
    }

    static boolean resultPrint(int[] result){
        //5. 계산 결과 출력
        if(result[0] ==3){
            System.out.println("홈런입니다.");
            return false;
        }
        else if(result[0] == 0 && result[1] == 0){
            System.out.println("Out입니다.");
        }
        else{
            System.out.println("strike : "+result[0] +", ball : "+result[1]);
        }
        return true;
    }

    public static void main(String[] args) {
        Random r = new Random(); // 랜덤을 사용하기 위해 랜덤 객체 생성
        Scanner sc = new Scanner(System.in);
        int[] com = new int[3];
        boolean check = true;
        makeRandom(com,r);
        randomPrint(com);

        while(check){

            int[] user = inputUser(sc);
            int[] reuslt = checkSB(user,com);
            check=resultPrint(reuslt);

            check=resultPrint(checkSB(inputUser(sc),com));
        }
    }
}
