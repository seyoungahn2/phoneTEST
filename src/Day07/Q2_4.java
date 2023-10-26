package Day07;

import java.util.Scanner;

public class Q2_4 {

    static int recResult(int w, int h){
        return w*h;
    }
    static void triResult(int[] array){
        System.out.println("삼각형 넓이 : "+(array[0]*array[1]/2));
    }

    static int[] inputWH(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[2];
        System.out.print("가로 : ");
        array[0] = sc.nextInt();
        System.out.print("세로 : ");
        array[1] = sc.nextInt();

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("1.사각형 넓이 2.삼각형 넓이 3.종료 : ");
            int num = sc.nextInt();

            if(num == 1 || num == 2){
                int[] array = inputWH();
                if(num == 1){
                    System.out.println("사각형 넓이 : "+(recResult(array[0],array[1])));
                }
                else{
                   triResult(array);
                }
            }
            else if(num == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
