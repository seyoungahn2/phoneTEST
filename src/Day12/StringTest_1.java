package Day12;

public class StringTest_1 {
    public static void main(String[] args) {
        String str = "11111123241231245";

        System.out.println(str.length()); // 주고 안받고

        System.out.println(str.charAt(0)); // 주고 받고

        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}
