package Day09;

public class MethodTest_5 {

    static int abc(int num){
        if(num == 0){
            return 0;
        }
        else {
            return abc(num-1)+num;
        }
    }

    public static void main(String[] args) {
        int num = abc(5);
        System.out.println(num);
    }
}
