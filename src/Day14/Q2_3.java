package Day14;

import java.util.Random;

class FishFeed{ // 물고기 먹이 클래스 아무것도 필요 없다.

}
class Shark{ // 상어클래스

    int number; // 상어 넘버

    FishFeed[] ff; // 상어가 먹을 수 있는 물고기먹이 배열 선언

    Shark(int number){ // 상어 생성자 생성 -> 정수 하나 필요
        Random r = new Random(); // 랜덤 객체 생성
        this.number = number; // 생성자 호출시 받은 정수 number에 대입
        // 멤버 변수인 물고기 먹이 배열에
        // 랜덤을 통해서 8~14까지의 길이로 배열 객체를 생성해서 대입
        ff = new FishFeed[r.nextInt(7)+8];
    }
    //먹는다는 기능을 가지는 메소드 매개변수 물고기 먹이 하나를 가지고 옵니다.
    void eat(FishFeed f){
        // i가 0부터 물고기 먹이 길이 만큼 반복
        for(int i = 0;i< ff.length;i++){
            if(ff[i] == null){ // 물고기배열의 인덱스 i의 값이 null이면 실행
                ff[i] = f; // 물고기배열의 인덱스 i에 매개변수로 받은 물고기 먹이 대입
                break; // 반복문 탈출
            }
        }
    }
    //print메소드
    //상어에 대한 정보 출력
    void print(){
        // 상어 정보 출력
        for(int i = 0;i<ff.length;i++){
            if(ff[i] == null){
                System.out.println("null 발견");
            }
        }
        System.out.println(this.number+"상어는 "+ff.length+"마리 만큼 잡아먹었습니다.");
    }
}
public class Q2_3 {
    public static void main(String[] args) {
        // 물고기 먹이 배열 객체 100개 생성
        FishFeed[] feeds = new FishFeed[100];
        // 물고기 먹이 배열 객체 길이만큼 반복
        for(int i = 0;i<feeds.length;i++){
            feeds[i] = new FishFeed();// 물고기먹이 배열 객체 안에 물고기먹이객체 대입
        }
        //물고기 먹이를 주기위한 정수변수 선언
        int fishCount = 0;

        //상어 5마리 배열 객체 생성
        Shark[] sharks = new Shark[5];

        //상어 배열 길이만큼 반복
        for(int i =0;i<sharks.length;i++){
            //상어 배열 인덱스 i에 상어 객체 생성을 해서 대입 이때
            // i와 1을 더한 값을 생성자 매개변수에 대입
            sharks[i] = new Shark(i+1);
            //위에 생성된 상어 객체에 먹이 배열의 길이만큼 반복
            for(int j = 0;j<sharks[i].ff.length;j++){
                // 상어객체의 먹에 메소드 호출
                // 호출시 fishCount의 값에 인덱스 물고기 먹이를 매개변수에 대입
                // fishCount는 먹이 실행 후 1증가
                sharks[i].eat(feeds[fishCount++]);
                // 물고기 먹이 배열에 fishCount에서 1을 감소한 인덱스
                // 값을 null로 변경
                feeds[fishCount - 1] = null;
            }
            // 상어 print메소드 출력
            sharks[i].print();
        }
    }
}
