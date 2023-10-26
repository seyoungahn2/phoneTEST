package Day12;

import java.util.Scanner;



// for (int i = 0; i<str.length();i++){
// so(str.charAt(i)   }
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXY*Z#"; // 0 1 2 -> 1.
        char[] strarray = new char[str.length()];


        System.out.println("입력 : ");
        String user = sc.next();


        for(int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i));



        }







    }
}
