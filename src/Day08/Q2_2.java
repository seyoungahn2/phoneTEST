package Day08;

import java.util.Random;

public class Q2_2 {

    static int makeRandom(){
        Random r = new Random();
        return r.nextInt(26);
    }

    static int opAdd(int ran){
        char ch = 'A';
        return ch + ran;
    }

    static char makeChar(int result){
        return (char)result;
    }

    static void start(){
        String str="";
        for(int i = 0;i<10;i++){
            str += makeString(makeChar(opAdd(makeRandom())));
        }
        printString(str);
    }

    static String makeString(char ch){
        return ch + "";
    }

    static void printString(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        start();
    }
}
