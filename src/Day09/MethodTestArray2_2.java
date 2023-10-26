package Day09;

public class MethodTestArray2_2 {

    static int[] a(){
        /*
        int[] a = new int[3];
        return a;
         */
        return new int[3];
    }
    static void b(int[] a){
        a[0] = 10;
    }
    static void c(int[] a){
        a[1] = 20;
    }

    public static void main(String[] args) {
        int[] c = new int[3];
        int[] b = a();
        b(c);
        c(b);
        System.out.println(c[0]);
        System.out.println(b[1]);
    }
}
