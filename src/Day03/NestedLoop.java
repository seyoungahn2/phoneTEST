package Day03;

public class NestedLoop {
    public static void main(String[] args) {



        int times;
        for(int dan=2;dan<=9;dan++){
            for(times=1;times<=9;times++){
                System.out.println(dan+"X"+times+"="+dan*times);
            }
            System.out.println();//개행
        }
    }
}
