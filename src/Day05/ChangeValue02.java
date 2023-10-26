package Day05;

public class ChangeValue02 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp=b; // temp <- 20 : temp=20
        b = a;  // b <- 10
        a = temp; // a <- 20

        System.out.println(a+","+b);






    }
}
