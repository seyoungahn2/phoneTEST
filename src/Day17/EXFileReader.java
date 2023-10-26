package Day17;

import Day16.FightMain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EXFileReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어 들일 파일명을 입력하세요:");
        String s = sc.next();
        //FileReader 객체 생성 생성자(파일명)
        FileReader fr = new FileReader(s);
        // 정수 변수 선언
        int i;
        // fr.read() -> 한글자의 정수가 나옵니다.
        // i = fr.read() -> i에 정수 값이 담깁니다.
        // i != -1 반복
        // 더이상 읽을 글자가 없는 경우 -1
        while((i = fr.read())!=-1){
            // 정수 -> 문자로 형변환 출력
            System.out.print((char)i);
        }
        fr.close();
    }
}
