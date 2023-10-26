package Day09;

public class Multi {

    static int[] a() {
        int[] a = new int[3];
        return a;

    }

    static void b(int[]a){
        a[1]=20;
    }

    static void c(int[] a ){
        a[1]=20;

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
