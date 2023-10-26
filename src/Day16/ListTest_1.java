package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListTest_1 {
    public static void main(String[] args) {
        String[] name = {"kim","lee","park","jung","oh"};
        ArrayList<String> lname = new ArrayList<>(Arrays.asList(name));

        System.out.println("초기 값 : "+lname);
        lname.add("ha");
        System.out.println("ha 추가된 후의 값 : "+lname);
        lname.set(0,"김");
        lname.set(3,"곽");
        System.out.println("김으로 변경되고 곽으로 추가된 값 : "+lname);

        Collections.shuffle(lname);
        System.out.println("셔플 후 값 : "+lname);
        Collections.sort(lname);
        System.out.println("소트 후 값 : "+lname);
        System.out.println("5번째 요소 값 : "+lname.get(4));
        Collections.fill(lname,"김");
        System.out.println("모든 요소 김으로 설정 값 : "+lname);
    }
}
