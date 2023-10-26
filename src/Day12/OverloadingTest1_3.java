package Day12;

import java.util.Random;

public class OverloadingTest1_3 {

    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println(a+b);
    }
    static void add(double a, int b){
        System.out.println(a+b);
    }
    static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(5,10);
        add(0.5,0.7);
        add(1,0.7);
        add(5.6,7);

        Random r = new Random();
        r.nextInt();
        r.nextInt(10);
    }
}
