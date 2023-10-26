package Day16;

import java.util.HashMap;

class C{
    int k;
}
class D{
    String str;
}

public class MapTest2_6 {
    public static void main(String[] args) {
        HashMap<C,D> map = new HashMap<>();
        C c = new C();
        C c1 = new C();
        map.put(c,new D());
        if(map.get(c1) == null){
            System.out.println("Null  입니다.");
        }
        else{
            System.out.println("객체가 존재합니다.");
        }
        if (map.get(c) != null){
            System.out.println("객체가 존재합니다.");
        }
        else{
            System.out.println("Null  입니다.");
        }
    }
}
