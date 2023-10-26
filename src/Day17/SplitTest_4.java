package Day17;

public class SplitTest_4 {
    public static void main(String[] args) {
        String a = "abc def xor";
        String[] temp = a.split(" ");
        for(int i = 0;i<temp.length;i++){
            System.out.println("index : "+i +" Data : "+temp[i]);
        }
    }
}
