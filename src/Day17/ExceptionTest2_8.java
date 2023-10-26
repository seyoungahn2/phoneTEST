package Day17;

import java.io.FileReader;

public class ExceptionTest2_8 {
    public static void main(String[] args) {
        FileReader fr;
        try {
            fr = new FileReader("a.txt");
            int i;
            while((i = fr.read()) != -1){
                System.out.println((char)i);
            }
            fr.close();
        }
        catch (Exception e){
            System.out.println("예러 발생");
        }
        finally {
            System.out.println("하이");
        }
    }
}
