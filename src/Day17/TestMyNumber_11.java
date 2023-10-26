package Day17;

interface MyNumber{
    int getMax(int num1, int num2);
}
public class TestMyNumber_11 {
    public static void main(String[] args) {
        MyNumber max = (x,y)->(x >= y) ? x : y;
        System.out.println(max.getMax(10,20));
    }
}
