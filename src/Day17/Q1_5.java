package Day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Phone{
    String name;
    String phoneNumber;
    String address;

    Phone(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

class Controller{
    //전화번호부 리스트
    ArrayList<Phone> tel; // 전화번호부 List 변수 선언
    Scanner sc; // 스캐너 변수 선언
    Controller(){ // 생성자
        tel = new ArrayList<Phone>(); // 객체 생성 후 tel 변수에 대입
        sc = new Scanner(System.in); // 객체 생성 후 sc 변수에 대입
    }

    //1. 입력

    void input(FileWriter fw) throws IOException {

        // 현재 List size 0이면 실행
        if(tel.size() == 0) {
            String opn1 = "이름"+"\t\t"+"전화번호"+"\t\t"+"주소"+"\r\n";
            tel.add(new Phone("이름", "전화번호", "주소"));
            fw.write(opn1);
        }

        System.out.print("이름 :"); //입력
        String name=sc.next(); // String name에 입력 값 대입
        System.out.print("전화번호 :"); //입력
        String number=sc.next(); // String number에 입력 값 대입
        System.out.print("주소 :"); // 입력
        String address=sc.next(); // String address에 입력 값 대입

        //List에 추가(객체 Phone)
        tel.add(new Phone(name,number,address));

        //파일 쓴다.
        String total = name+"\t\t"+number+"\t\t"+address+"\r\n";
        fw.write(total);
        fw.close();
    }

    //2. 삭제

    void delete() throws IOException {
        System.out.print("검색할 이름을 넣어주세요 : "); //입력
        String search =sc.next(); // 문자열 search에 입력 문자열 대입

        int index = -1;

        for(int i = 0;i<tel.size();i++) {
            if(tel.get(i).name.equals(search)) {
                index = i;
            }
        }

        if(index == -1) {
            System.out.println("삭제할 이름이 없습니다.");
        }
        //삭제할 이름이 있어서 index에 -1이 아닌경우
        else {
            //FileWriter 객체 생성 phone.txt,false 안에있는 데이터 모두 삭제
            FileWriter fw1 = new FileWriter("phone.txt",false);
            //List에 index에 있는 객체를 지웁니다.
            tel.remove(index);
            //List size만큼 반복
            for(int i = 0;i<tel.size();i++) {
                // List에 있는 이름\t\t+전화번호\t\t+주소\r\n
                String total = tel.get(i).name+"\t\t"
                        +tel.get(i).phoneNumber+"\t\t"+tel.get(i).address+"\r\n";
                //FileWriter 쓰기 위에 문자열을 씁니다.
                fw1.write(total);
            }
            // FileWriter 닫기 -> 써집니다.
            fw1.close();
        }

    }


    //3. 전체출력
    void allPrint() throws IOException {
		/*
		if(tel.size() == 0) {
			System.out.println("없습니다.");
		}
		else {
			for(int i = 0;i<tel.size();i++) {
				System.out.println(tel.get(i).name +","+tel.get(i).phoneNumber+","+tel.get(i).address );
			}
		}
		*/

        tel.clear(); // List에 있는 내용 모두 삭제

        //FileReader 객체 생성 -> Phone.txt
        FileReader fr = new FileReader("phone.txt");

        //BufferReader 문자열로 하기 위해 위에 FileReader 객체를 매개변수로 대입
        BufferedReader reader = new BufferedReader(fr);
        String line; // 한줄씩 문자열 받기
        String[] splitLine = null; // split시 문자열에 문자 쪼갠 값을 받기 위한 문자열 배열

        //파일을 한줄씩 읽을 때마다 null이 아니면 반복
        while((line = reader.readLine()) != null) {
            splitLine = line.split("\t\t"); // \t\t기준으로 문자열을 자릅니다 -> 문자열 배열 splitLine 받습니다.
            // List에 Phone객체를 생성 후 추가
            // Phone 생성자 호출시 splitLine의 배열의 값을 매개변수로 대입
            tel.add(new Phone(splitLine[0], splitLine[1], splitLine[2]));
        }
        //List size가 0이면 실행
        if(tel.size() == 0) {
            System.out.println("없습니다.");
        }
        //List size가 0이 아니면 실행
        else {
            for(int i = 0;i<tel.size();i++) {
                System.out.println(tel.get(i).name +","+tel.get(i).phoneNumber+","+tel.get(i).address );
            }
        }


    }
    //4. 검색

    void search() {
        System.out.print("검색할 이름을 넣어주세요 : "); //입력
        String search =sc.next(); // 문자열 search에 입력 문자열 대입
        //정수 변수 index에 -1을 대입
        int index = -1;

        // 리스트 사이즈 만큼 반복
        for(int i = 0;i<tel.size();i++) {
            //list.get(i) => Phone객체
            //Phone객체.name equals 입력 문자열
            if(tel.get(i).name.equals(search)) {
                index = i; // index에 i를 대입
                break;
            }
        }
        //index가 -1이면 아래 명령문 실행
        if(index == -1) {
            System.out.println("검색결과가 없습니다.");
        }
        //index가 -1 아니면 아래 명령문 실행
        else {
            System.out.println(tel.get(index).name +","+tel.get(index).phoneNumber+","+tel.get(index).address );//출력
        }

    }
}

public class Q1_5 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Controller c = new Controller(); // Controller 객체 생성
        Scanner sc = new Scanner(System.in); // 입력 객체 생성
        //File이 phone.txt 매개변수를 받아서 객체 생성
        File f = new File("phone.txt");
        //현재 phone.txt파일 존재 여부를 확인
        //존재 true 존재X false
        if(f.exists()) {
            c.tel.clear(); // 리스트 모든파일 삭제

            FileReader fr = new FileReader("phone.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            String[] splitLine = null;

            while((line = reader.readLine()) != null) {
                splitLine = line.split("\t\t");
                c.tel.add(new Phone(splitLine[0], splitLine[1], splitLine[2]));
            }
        }

        //무한 루프
        while(true) {
            //입력
            System.out.print("1. 입력 2.검색 3.삭제 4.출력 5.종료");
            int num = sc.nextInt();
            //
            // FileWriter 변수 선언
            FileWriter fw;

            // c -> Controller -> tel(List). size(크기) 0이면 실행
            if(c.tel.size() == 0) {
                fw = new FileWriter("phone.txt",false); // 덮어쓰기
            }
            // c -> Controller -> tel(List). size(크기) 0아니면 실행
            else {
                fw = new FileWriter("phone.txt",true); // 이어쓰기
            }
            // 입력
            if(num == 1) {
                c.input(fw);
            }
            // 검색
            else if(num == 2) {
                c.search();
            }
            // 삭제
            else if(num == 3) {
                c.delete();
            }
            // 전체 출력
            else if(num == 4) {
                c.allPrint();
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
