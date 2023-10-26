package Java.Day18;
//


import java.util.Scanner;

public class qwe {
    public static void main(String[] args) {

//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i+"X"+j+"="+(i*j));
//            }
//        }

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("몇단?");
            int num = sc.nextInt();


            for (int i = 2; i <=num ; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i+"X"+j+"="+(i*j));
                }
            }
        }



    }
}
