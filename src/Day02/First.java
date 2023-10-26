package Day02;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {


        /* String id = "korea"
           String passwd = "1234"

           id 입력 : XXXX
           패스워드 입력 : XXXXX

           id 와 패스워드가 맞으면 -> "환영합니다. Korea님 "

           id or 패스워드가 틀리면
            id가 틀린경우  -> id가 올바르지 않습니다.
            id가 맞고 패스워드가 틀린경우 -> 패스워드가 올바르지 않습니다.
            id 패스워드 모두 틀린경우 -> id와 패스워드가 올바르지 않습니다.
         */

        Scanner sc = new Scanner(System.in);
        String id ="korea";
           String passwd="1234";
        System.out.println(" ID를 입력해 주세요 : ");
        String inputid=sc.nextLine();
        System.out.println(" 패스워드를 입력해주세요 : ");
        int inputPw=sc.nextInt();

        if(id.equals(inputid)&&passwd.equals(inputPw)){
            System.out.println("환영합니다"+id+"님");
        }
        else if(!id.equals(inputid)&&passwd.equals(inputPw))
                System.out.println("id가 올바르지 않습니다.");














    }
}
