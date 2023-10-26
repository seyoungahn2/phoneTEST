package Day14;

import java.util.Random;

// Box 클래스
class Box{

}

//Monkey 클래스
class Monkey{
    //문자열 자료형 color 선언 -> 접근제한자 private 직접 접근 X
    private String color;
    //Box 자료형 box 선언 -> 접근제한자 private 직접 접근 X
    private Box box;

    //Mokey 생성자 매개변수 문자열 하나 받습니다.
    Monkey(String color){
        //매개변수 문자열을 멤버변수 color에 대입
        this.color = color;
    }

    //getColor 메소드를 호출하면 멤버변수 color를 return
    public String getColor() {
        return color;
    }

    //getBox 메소드를 호출하면 멤버변수 box를 return
    public Box getBox() {
        return box;
    }

    //setBoxt를 호출하면 Box를 매개변수로 받아서 멤버변수 box에 대입
    public void setBox(Box box) {
        this.box = box;
    }

    //메소드 print 안주고 안받고
    void print(){
        //멤버변수 box가 null이 아니면 실행
        if(box != null){
            System.out.println(color+"원숭이가 상자를 가지고 있습니다."); //출력
        }
        else{ // null이면 실행
            System.out.println(color+"원숭이가 상자를 가지고 있지 않습니다.");//출력
        }
    }
}

//클래스 Move
class Move{
    //멤버변수 Monkey 배열 5개 객체를 생성
    Monkey[] monkeys = new Monkey[5];

    //Move 생성자
    Move(){
        String[] color={"빨간","노란","파란","초록","검정"}; //문자열 배열 객체 생성
        //멤버변수 monkeys길이만큼 반복
        for(int i = 0;i<monkeys.length;i++){
            //monkey배열 i 인덱스 변수에 Monkey 객체를 대입
            //객체를 대입할 때 color배열에 i인덱스 값을 매개변수로 대입
            monkeys[i] = new Monkey(color[i]);
        }
        // mokeys배열 0번 객체에 setBoxt 호출
        // 호출시 Box객체를 생성한 것을 전달
        monkeys[0].setBox(new Box());
    }

    void allPrint(){
        //모든 원숭이 print 출력
        for(int i = 0;i<monkeys.length;i++){
            monkeys[i].print();
        }
        System.out.println("----------------------------------------");
    }

    //메소드 change 호출시 정수가 2개 매개변수로 받음
    //ch, count
    void change(int ch, int count){
        // ch가 1이면 실행
        if(ch == 1){ //오른쪽
            //count만큼 반복실행
            for(int i = 0;i<count;i++){
                //변수 i가 4랑 같으면 실행
                if(i == 4){
                    //monkeys배열 i번째 getBox를 호출해서
                    //i번째 원숭이 box를 받습니다.
                    //위서 받은 박스를 monkey배열 0번 객체에
                    //setBox를 호출하여 넘겨줍니다.
                    //mokeys 0번 배열에 monkeys i 배열에 박스가 넘겨집니다.
                    monkeys[0].setBox(monkeys[i].getBox());
                }
                //변수 i가 4랑 같지 않으면 실행
                else{
                    //monkeys배열 i번째 getBox를 호출해서
                    //i번째 원숭이 box를 받습니다.
                    //위서 받은 박스를 monkey배열 i+1번 객체에
                    //setBox를 호출하여 넘겨줍니다.
                    //mokeys i+1번 배열에 monkeys i 배열에 박스가 넘겨집니다.
                    monkeys[i+1].setBox(monkeys[i].getBox());
                }
                //monkeys i번째에 setBoxt를 호출에서 null을 대입
                //monkeys i번째 멤버변수는 box는 null이 됩니다.
                monkeys[i].setBox(null);
                //원숭이 전체 출력
                allPrint();
            }
        }
        //ch가 1이 아니면 실행
        else{ //왼쪽
            int num = 4; // 정수 변수 num을 선언후 4를 대입
            //monkeys 배열의 0번째 인덱스 객체에서
            //getBox를 호출해서 멤버변수 box를 리턴해 줍니다.
            //monkeys 배열 num번째 객체에
            //setBox를 호출해서 monkeys 배열 0번째가 준 box를 대입합니다.
            monkeys[num].setBox(monkeys[0].getBox());
            //monkeys 배열 0번째 객체에서
            //setBox를 호출해서 null을 대입
            //monkeys 배열 0번째 멤버변수 box가 null이 됩니다.
            monkeys[0].setBox(null);
            //전체 출력
            allPrint();

            //i~count미만까지 반복
            for(int i =1;i<count;i++){
                //       3                     4
                //       2                     3
                //       1                     2
                //       0                     1
                monkeys[num-1].setBox(monkeys[num].getBox());
                monkeys[num].setBox(null);
                allPrint();
                num--; // num 1감소
            }
        }
    }


}


public class Q3_4 {
    public static void main(String[] args) {
        Random r = new Random();
        Move m = new Move();
        int ch = r.nextInt(2);
        int count = r.nextInt(5)+1;

        System.out.println("게임을 시작합니다.");

        System.out.println("좌로이동은 0, 우로 이동은 1 랜덤수는 : "+ch);
        System.out.println("랜덤 이동 횟수는 : " + count);

        //Move에 allPrint Call
        m.allPrint();
        //Move에 change Call 매개변수로 ch, count를 대입
        m.change(ch,count);

        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }
}
