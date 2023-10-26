package Day08;

public class ReturnTest_3 {
    static boolean checking(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checking(10));
        System.out.println(checking(11));
    }
}
