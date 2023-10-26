package Day12;

import java.util.Scanner;

public class Q1_2 {
    // 1. 입력작업
    static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        return sc.next();
    }
    // 2. 연산작업
    // 2-1. 숫자를 자르는 작업
    static String makeResult(String str){
        String result = "";
        char ch = str.charAt(0);
        int count = 0;
        // 1112322333
        for(int i = 0;i<str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }
            else{
                //1. 문자로 변경
//                if(ch == '*' || ch == '#'){
//                    for(int j =0;j<count-1;j++){
//                        result += makeChar(ch,count);
//                    }
//                }
                result += makeChar(ch,count);
                //2. ch 변경
                ch = str.charAt(i);
                //3. count = 1
                count = 1;
            }
        }
        result += makeChar(ch,count);
        return result;
    }

    // 2-2. 자른 값을 문자로 변경

    static char makeChar(char ch, int count){
        char result;
        char[][] key = {
                {'A','B','C'}, // 1
                {'D','E','F'}, // 2
                {'G','H','I'}, // 3
                {'J','K','L'}, // 4
                {'M','N','O'}, // 5
                {'P','Q','R'}, // 6
                {'S','T','U'}, // 7
                {'V','W','X'}, // 8
                {'Y'}, // 9
                {'*'},
                {'Z'}, // 0
                {'#'}
        };

        if(ch == '9'){
            result = key[8][0];
        }
        else if(ch == '*'){
            result = key[9][0];
        }
        else if (ch == '0') {
            result = key[10][0];
        }
        else if (ch == '#') {
            result = key[11][0];
        }
        else{
            if(count <=3){
                count--;
            }
            else{
                count = (count-1)%3;
            }

            result = key[(ch-'0')-1][count];
        }
        return result;
    }

    // 3. 출력

    static void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        print(makeResult(input()));
    }
}
