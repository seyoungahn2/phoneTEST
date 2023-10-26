package Day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.print("숫자 입력 : ");
                int num = sc.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("숫자를 입력 해주세요.");
                sc.nextLine();
            }
        }

    }
}
