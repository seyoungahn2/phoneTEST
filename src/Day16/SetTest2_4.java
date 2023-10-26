package Day16;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest2_4 {
    public static void main(String[] args) {
        HashSet<A> set = new HashSet<>();
        A a1 = new A(7,8);
        set.add(new A(5,6));
        set.add(a1);
        //set.add(a1);
        //set.add(new A(7,8));
        Iterator<A> it = set.iterator();
        int num = 1;
        while(it.hasNext()){
            A a = it.next();
            if(a == a1){
                System.out.println(num+"번째에 있습니다.");
            }
            num++;
        }
    }
}
