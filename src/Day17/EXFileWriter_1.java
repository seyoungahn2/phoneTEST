package Day17;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXFileWriter_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String source = "누구나 그럴싸한 계획은 있다.\n"+
                "하지만 한번 맞아보면 알게된다.\n"+
                "Java 너무 쉽다.";
        char input[] = new char[source.length()];
        // source String -> getChars 문자열 -> 문자배열에 옮기는거
        // 문자열 0~source.length() -> 문자배열 input 0부터 대입
        source.getChars(0,source.length(),input,0);

        System.out.print("파일명을 입력하세요 : ");
        String s = sc.next();
        // FileWriter 객체를 생성하는데
        // 생성자안에 문자열(파일명)
        FileWriter fw = new FileWriter(s);
        //파일에 쓰기
        fw.write(input);
        //FileWirter를 close를 해야 완성 됩니다.
        fw.close();
        System.out.println(s+"파일이 생성되었습니다.");
    }
}
