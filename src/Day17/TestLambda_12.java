package Day17;
interface PrintString{
    void showString(String str);
}
public class TestLambda_12 {
    public static void main(String[] args) {
        PrintString lambda = asdfsdaf -> System.out.println(asdfsdaf);
        lambda.showString("hello lamda_1");
        showMyString(lambda);
    }
    public static void showMyString(PrintString p){
        p.showString("hello lamda_2");
    }
}
