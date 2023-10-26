package Day16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetTest1_3 {
    public static void main(String[] args) {
        HashSet<Integer> odd = new HashSet<>(); //홀수
        HashSet<Integer> even = new HashSet<>(); // 짝수

        for(int i = 1; i<=5;i=i+2){
            odd.add(i); //    1 3 5
            even.add(i+1); // 2 4 6
        }

        boolean setChanged = odd.add(5);
        System.out.println("odd에 5추가 성공 ? : "+setChanged);
        setChanged = even.add(12);
        System.out.println("even에 12추가 성공 ? : "+setChanged);
        System.out.println("odd 집합 : "+odd);
        System.out.println("even 집합 : "+even);
        System.out.println("odd에서 가장 작은 값은 : "+ Collections.min(odd));
        System.out.println("even에서 가장 큰 값은 : "+ Collections.max(even));
        Iterator<Integer> it = even.iterator();
        int sum = 0;
        while(it.hasNext()){
            sum = sum +it.next();
        }
        System.out.println("even 집합의 합은 : "+sum);
    }
}
