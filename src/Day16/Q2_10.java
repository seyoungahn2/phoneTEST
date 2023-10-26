package Day16;

import java.util.ArrayList;
import java.util.Scanner;

class Data{
    String name;
    String number;
    String address;
    int age;

    Data(String name, String number, String address, int age){
        this.name = name;
        this.number = number;
        this.address = address;
        this.age = age;
    }

    void print() {
        System.out.println("이름 : "+name+", 전화번호 : "+number+", 주소 : "+address
                +", 나이 : "+age+"세");
    }
}
public class Q2_10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ArrayList<Data> pb = new ArrayList<Data>();

        while(true) {
            System.out.println("--- 전화번호부 ---");
            System.out.println("1.추가, 2.삭제, 3.전체 출력, 4.이름 검색, 5.종료");
            int num = sc.nextInt();

            if(num == 1) {
                System.out.println("- 추가 -");
                System.out.print("이름 : ");
                String name = sc.next();
                System.out.print("번호 : ");
                String number = sc.next();
                System.out.print("주소 : ");
                String address = sc.next();
                System.out.print("나이 : ");
                int age = sc.nextInt();
                Data a = new Data(name, number, address, age);
                // Data 객체 생성시 위에서 받은 입력값 매개변수에 추가
                // 자료형 Data a에 대입
                pb.add(a);

                System.out.println(name+" - 추가 완료 -");
            }
            else if(num == 2) {
                System.out.println("- 삭제 -");
                System.out.print("이름 : ");
                String dname = sc.next();
                //
                //boolean 변수 check 생성 후 true 대입
                // check -> true가 되면 찾는 이름이 없다
                // check -> flase가 되면 찾았다.
                boolean check = true;
                
                
                // List 에 있는 데이터 길이만큼 반복
                for(int i = 0;i<pb.size();i++) {
                    // List->get(i)(index) => 객체 Data
                    // data.name
                    //data.name.equals => 문자열 비교
                    // 위에서 받은 문자열(dname)과 비교
                    // true가 나왔다. 같은 이름이 있다
                    // 아래 명령문 실행
                    if(pb.get(i).name.equals(dname)) {
                        System.out.println(dname + " (이/가) 삭제 되었습니다.");
                        //List i번쨰 인덱스의 Data 객체 삭제
                        pb.remove(i);
                        //check -> flase로 바꾸고 break;로 탈출 .

                        check = false;
                        break;
                    }
                }
                if(check) { // 위쪽 if문이 실행되었다면 false로 바뀐것떄문에 실행되지 않음 .
                    System.out.println("없는 이름 입니다.");
                }
            }
            else if(num == 3) {
                for(int i = 0;i<pb.size();i++){
                    pb.get(i).print();
                }
            }
            else if(num == 4) {
                //2번과 동일한데 remove()가 아니라 print()로 바뀌었을뿐이다.
                System.out.println("- 검색 -");
                System.out.print("이름 : ");
                String dname = sc.next();

                boolean check = true;

                for(int i = 0;i<pb.size();i++) {
                    if(pb.get(i).name.equals(dname)) {
                        pb.get(i).print();
                        check = false;
                        break;
                    }
                }
                if(check) {
                    System.out.println("없는 이름 입니다.");
                }
            }
            else if(num == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
